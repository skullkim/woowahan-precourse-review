package baseball.controller;

import baseball.model.ComputerPlayer;

import baseball.utils.BaseBallGameMessage;
import baseball.view.BaseballGameOutput;

public class BaseballGameController {

	private final static String CORRECT_ANSWER = "3스트라이크";

	private final static Integer TERMINATE_GAME = 2;

	private final ComputerPlayer computerPlayer;

	private final InputController input;

	private final BaseballGameOutput output;

	public BaseballGameController(final ComputerPlayer computerPlayer,
			final InputController input,
			final BaseballGameOutput output) {
		this.computerPlayer = computerPlayer;
		this.input = input;
		this.output = output;
	}

	private String getStrikes(final String selectedNumber, final String computerSelectedNumber) {
		int strikes = 0;
		for (int i = 0; i < computerSelectedNumber.length(); i++) {
			if(selectedNumber.charAt(i) == computerSelectedNumber.charAt(i)) {
				strikes++;
			}
		}
		if(strikes > 0) {
			return BaseBallGameMessage.getStrike(strikes);
		}
		return "";
	}

	private String getBalls(final String selectedNumber, final String computerSelectedNumber) {
		int balls = 0;
		for(int i = 0; i < computerSelectedNumber.length(); i++) {
			final char currentChar = selectedNumber.charAt(i);
			final int currentCharPosition = computerSelectedNumber.indexOf(currentChar);
			if(currentCharPosition != -1 && currentCharPosition != i) {
				balls++;
			}
		}
		if(balls > 0) {
			return BaseBallGameMessage.getBall(balls);
		}
		return "";
	}

	private String getGuessResult(final String selectedNumber) {
		final String computerSelectedNumber = Integer
			.toString(computerPlayer.getSelectedNumber());

		String result = getBalls(selectedNumber, computerSelectedNumber)
			+ getStrikes(selectedNumber, computerSelectedNumber);

		if(result.isEmpty()) {
			return BaseBallGameMessage.NOTHING;
		}
		return result;
	}

	public void startGame() {
		final String selectedNumber = input.guessNumber();
		final String result = getGuessResult(selectedNumber);
		output.printGuessResult(result);
		if(result.equals(CORRECT_ANSWER)) {
			final int gameStatus = input.selectedGameStatus();
			if(gameStatus == TERMINATE_GAME) {
				return;
			}
			computerPlayer.generateNewRandomNumber();
		}
		startGame();
	}
}
