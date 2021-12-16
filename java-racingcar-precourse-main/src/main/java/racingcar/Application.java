package racingcar;

import racingcar.utils.DataValidation;
import racingcar.utils.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        DataValidation d = new DataValidation();
        System.out.println(d.validateCarName("1s4dsagf"));
    }
}
