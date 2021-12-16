package baseball.utils;

public class BaseBallGameMessage {

	/* input message */
	public static final String NUMBER_INPUT = "숫자를 입력해주세요 : ";

	public static final String END_GAME = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

	public static final String CONTINUE_GAME_OR_NOT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	/* output message */
	private static final String BALL = "볼 ";

	private static final String STRIKE = "스트라이크";

	public static final String NOTHING = "낫싱";

	/* error message */
	private static final String ERROR_PREFIX = "[ERROR]: ";

	private static final String INVOLVE_OTHER_CHARACTER = " 정수만 입력할 수 있습니다";

	private static final String LENGTH_ERROR = "입력하는 숫자는 3자리 수여야 합니다";

	private static final String WRONG_NUMBER = "1 또는 2만 입력할 수 있습니다";

	public static String getBall(final Integer balls) {
		return balls + BALL;
	}

	public static String getStrike(final Integer strikes) {
		return strikes + STRIKE;
	}

	public static String involveOtherCharacter(final String inputtedData) {
		return ERROR_PREFIX + inputtedData + INVOLVE_OTHER_CHARACTER;
	}

	public static String wrongLengthNumber(final String inputtedData) {
		return ERROR_PREFIX + inputtedData + LENGTH_ERROR;
	}

	public static String wrongNumber(final String inputtedData) {
		return ERROR_PREFIX + inputtedData + WRONG_NUMBER;
	}
}
