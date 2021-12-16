package racingcar.utils;

public class RacingGameMessage {

	/* input message */
	public static final String INPUT_CARS_NAME =
		"경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

	public static final String INPUT_GAME_TURNS = "시도할 회수는 몇회인가요?";

	/* output message */
	public static final String TURNS_RESULT = "실행 결과";

	public static final String FINAL_WINNERS = "최종 우승자 : ";

	private static final String ERROR_PREFIX = "[ERROR]: ";

	private static final String NOT_NATURAL_NUMBER = "자연수만 입력할 수 있습니다";

	public static String notNaturalNumberError(final String inputtedData) {
		return ERROR_PREFIX + inputtedData + NOT_NATURAL_NUMBER;
	}
}
