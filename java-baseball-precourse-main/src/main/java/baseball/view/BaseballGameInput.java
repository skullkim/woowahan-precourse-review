package baseball.view;

import baseball.utils.BaseBallGameMessage;

import camp.nextstep.edu.missionutils.Console;

public class BaseballGameInput {

	public String guessNumber() {
		System.out.print(BaseBallGameMessage.NUMBER_INPUT);
		return Console.readLine();
	}

	public String selectGameStatus() {
		System.out.println(BaseBallGameMessage.END_GAME);
		System.out.println(BaseBallGameMessage.CONTINUE_GAME_OR_NOT);
		return Console.readLine();
	}
}
