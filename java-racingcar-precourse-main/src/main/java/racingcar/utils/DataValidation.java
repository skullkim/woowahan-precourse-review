package racingcar.utils;

import java.util.regex.Pattern;

public class DataValidation {
	private static final String NUMBER_PATTERN = "^[0-9]*$";

	private String errorMessage;

	public DataValidation() {
		this.errorMessage = "";
	}

	public boolean validateNumberData(final String inputtedData) {
		if (!Pattern.matches(NUMBER_PATTERN, inputtedData)) {
			errorMessage = RacingGameMessage.notNaturalNumberError(inputtedData);
			throw new IllegalArgumentException(errorMessage);
		}
		return true;
	}
}
