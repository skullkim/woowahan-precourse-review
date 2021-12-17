package racingcar.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import racingcar.model.Car;
import racingcar.utils.RacingGameMessage;
import racingcar.utils.RandomGenerator;
import racingcar.view.RacingGameOutput;

public class RacingGameController {

	private static final Integer CAN_GO_FORWARD = 4;

	private final RacingGameInputController input;

	private final RacingGameOutput output;

	private final RandomGenerator randomGenerator;

	private ArrayList<Car> cars;

	private int turns;

	public RacingGameController(final RacingGameInputController input,
			final RacingGameOutput output, final RandomGenerator randomGenerator) {
		this.input = input;
		this.output = output;
		this.randomGenerator = randomGenerator;
	}

	private void inputDataBeforeStart() {
		cars = input.inputCarsName();
		turns = input.inputGameTurns();
	}

	private void startThisTurn() {
		cars.forEach(car -> {
			if(randomGenerator.getRandomNumber() >= CAN_GO_FORWARD) {
				car.goForward();
			}
		});
	}

	private int getMaxPosition() {
		ArrayList<Car> sortedCars = new ArrayList<>(cars);
		sortedCars.sort(Comparator.comparingInt(Car::getPosition).reversed());
		return sortedCars.get(0).getPosition();
	}

	private String makeWinnerList(final int maxPosition) {
		String[] winnerArray = cars.stream()
			.filter(car -> car.getPosition() == maxPosition)
			.map(Car::getName)
			.toArray(String[]::new);
		return String.join(", ", winnerArray);
	}

	private void printWinners() {
		final int maxPosition = getMaxPosition();
		output.printWinners(makeWinnerList(maxPosition));
	}

	public void startRacing() {
		inputDataBeforeStart();
		System.out.println(RacingGameMessage.TURNS_RESULT);
		while(turns-- > 0) {
			startThisTurn();
			output.printTurnResult(cars);
		}
		printWinners();
	}

}
