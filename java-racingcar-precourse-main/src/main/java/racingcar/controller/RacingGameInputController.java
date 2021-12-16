package racingcar.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import racingcar.model.Car;
import racingcar.utils.DataValidation;
import racingcar.view.RacingGameInput;

public class RacingGameInputController {

	private DataValidation validation;

	private RacingGameInput input;

	public RacingGameInputController(final DataValidation validation,
			final RacingGameInput input) {
		this.validation = validation;
		this.input = input;
	}

	public List<String> parseCarsName(final String carsName) {
		String[] carsNameArray = carsName.split(",");
		return Arrays.asList(carsNameArray);
	}

	public ArrayList<Car> inputCarsName() {
		final ArrayList<Car> cars = new ArrayList<>();
		while(true) {
			try {
				final String carsName = input.inputCarsName();
				validation.validateCarName(carsName);
				final List<String> carNameList = parseCarsName(carsName);
				carNameList.forEach(carName -> cars.add(new Car(carName)));
				break;
			} catch (IllegalArgumentException error) {
				System.out.println(error.getMessage());
			}
		}
		return cars;
	}

	public int inputGameTurns() {
		int turns = 0;
		while(true) {
			try {
				final String gameTurns = input.inputGameTurns();
				validation.validateNumberData(gameTurns);
				turns = Integer.parseInt(gameTurns);
				break;
			} catch (IllegalArgumentException error) {
				System.out.println(error.getMessage());
			}
		}
		return turns;
	}

}
