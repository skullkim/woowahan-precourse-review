package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {

	private static final Integer RANDOM_NUMBER_MIN_RANGE = 1;

	private static final Integer RANDOM_NUMBER_MAX_RANGE = 9;

	public int getRandomNumber() {
		boolean[] usedNumber = new boolean[12];
		String threeDigitRandomNumber = "";
		while(threeDigitRandomNumber.length() != 3) {
			final int randomNumber = Randoms
				.pickNumberInRange(RANDOM_NUMBER_MIN_RANGE, RANDOM_NUMBER_MAX_RANGE);
			if(usedNumber[randomNumber]) {
				continue;
			}
			usedNumber[randomNumber] = true;
			threeDigitRandomNumber = threeDigitRandomNumber
				.concat(Integer.toString(randomNumber));
		}
		return Integer.parseInt(threeDigitRandomNumber);
	}
}
