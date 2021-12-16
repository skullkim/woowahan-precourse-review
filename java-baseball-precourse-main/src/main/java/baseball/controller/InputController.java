package baseball.controller;

import baseball.utils.DataValidation;
import baseball.view.BaseballGameInput;

public class InputController {

	private final DataValidation dataValidation;

	private final BaseballGameInput baseballGameInput;

	public InputController(final DataValidation dataValidation, final BaseballGameInput baseballGameInput) {
		this.dataValidation = dataValidation;
		this.baseballGameInput = baseballGameInput;
	}

	public String guessNumber() {
		final String selectedNumber = baseballGameInput.guessNumber();
		dataValidation.numberInput(selectedNumber);
		return selectedNumber;
	}

	public int selectedGameStatus() {
		final String selectedStatus = baseballGameInput.selectGameStatus();
		dataValidation.selectMoveGame(selectedStatus);
		return Integer.parseInt(selectedStatus);
	}
}
