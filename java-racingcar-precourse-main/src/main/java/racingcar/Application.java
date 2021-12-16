package racingcar;

import racingcar.controller.RacingGameInputController;
import racingcar.utils.DataValidation;
import racingcar.view.RacingGameInput;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
		RacingGameInputController a = new RacingGameInputController(new DataValidation(),
			new RacingGameInput());
		a.inputGameTurns();
	}
}
