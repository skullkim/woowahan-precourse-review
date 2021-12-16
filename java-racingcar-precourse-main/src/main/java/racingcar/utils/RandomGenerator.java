package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {

	private static final Integer RANDOM_NUMBER_MIN_RANGE = 1;

	private static final Integer RANDOM_NUMBER_MAX_RANGE = 9;

	public int getRandomNumber() {
		return Randoms.pickNumberInRange(RANDOM_NUMBER_MIN_RANGE,
			RANDOM_NUMBER_MAX_RANGE);
	}
}
