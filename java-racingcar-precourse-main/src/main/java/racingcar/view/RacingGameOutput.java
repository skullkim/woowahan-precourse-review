package racingcar.view;

import java.util.ArrayList;

import racingcar.model.Car;
import racingcar.utils.RacingGameMessage;

public class RacingGameOutput {

	public void printTurnResult(ArrayList<Car> cars) {
		System.out.println(RacingGameMessage.TURNS_RESULT);
		cars.forEach(car -> {
			System.out.print(car.getName() + " : ");
			int position = car.getPosition();
			while(position-- > 0) {
				System.out.print("-");
			}
			System.out.print("\n");
		});
		System.out.print("\n");
	}

	public void printWinners(final String winners) {
		System.out.print(RacingGameMessage.FINAL_WINNERS + winners);
	}
}
