package racingcar.utils;

import java.util.regex.Pattern;

public class DataValidation {

	private static final String NUMBER_PATTERN = "^[0-9]*$";

	private static final Integer MAX_CAR_NAME_LENGTH = 5;

	private String errorMessage;

	public DataValidation() {
		this.errorMessage = "";
	}

	public void validateNumberData(final String inputtedData) {
		if (!Pattern.matches(NUMBER_PATTERN, inputtedData)) {
			errorMessage = RacingGameMessage.notNaturalNumberError(inputtedData);
			throw new IllegalArgumentException(errorMessage);
		}
		return;
	}

	public void validateCarName(final String carName) {
		if(carName.length() > MAX_CAR_NAME_LENGTH) {
			errorMessage = RacingGameMessage.invalidCarNameLength(carName);
			throw new IllegalArgumentException(errorMessage);
		}
		return;
	}
}
