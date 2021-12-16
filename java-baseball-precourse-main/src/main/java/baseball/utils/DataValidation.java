package baseball.utils;

import java.util.regex.Pattern;

public class DataValidation {

	private static final String NUMBER_PATTERN = "^[0-9]*$";

	private static final Integer NUMBER_LENGTH = 3;

	private static final String START_NEW_GAME = "1";

	private static final String TERMINATE_GAME = "2";

	private String errorMessage;

	public DataValidation() {
		this.errorMessage = "";
	}

	public void numberInput(final String inputtedNumber) {
		if(!Pattern.matches(NUMBER_PATTERN, inputtedNumber)) {
			errorMessage = BaseBallGameMessage.involveOtherCharacter(inputtedNumber);
			System.out.println(errorMessage);
			throw new IllegalArgumentException(errorMessage);
		}
		if(inputtedNumber.length() != NUMBER_LENGTH) {
			errorMessage = BaseBallGameMessage.wrongLengthNumber(inputtedNumber);
			System.out.println(errorMessage);
			throw new IllegalArgumentException(errorMessage);
		}
	}

	public void selectMoveGame(final String inputtedNumber) {
		if(!Pattern.matches(NUMBER_PATTERN, inputtedNumber)) {
			errorMessage = BaseBallGameMessage.involveOtherCharacter(inputtedNumber);
			System.out.println(errorMessage);
			throw new IllegalArgumentException(errorMessage);
		}
		if(!inputtedNumber.equals(START_NEW_GAME) && !inputtedNumber.equals(TERMINATE_GAME)) {
			errorMessage = BaseBallGameMessage.wrongNumber(inputtedNumber);
			System.out.println(errorMessage);
			throw new IllegalArgumentException(errorMessage);
		}

	}

}
