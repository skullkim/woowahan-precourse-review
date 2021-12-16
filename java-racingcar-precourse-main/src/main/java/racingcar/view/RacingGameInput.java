package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.RacingGameMessage;

public class RacingGameInput {

	public String inputCarsName() {
		System.out.println(RacingGameMessage.INPUT_CARS_NAME);
		return Console.readLine();
	}

	public String inputGameTurns() {
		System.out.println(RacingGameMessage.INPUT_GAME_TURNS);
		return Console.readLine();
	}
}
