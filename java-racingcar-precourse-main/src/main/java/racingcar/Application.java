package racingcar;

import racingcar.controller.RacingGameController;
import racingcar.controller.RacingGameInputController;
import racingcar.utils.DataValidation;
import racingcar.utils.RandomGenerator;
import racingcar.view.RacingGameInput;
import racingcar.view.RacingGameOutput;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
		final DataValidation validation = new DataValidation();
		final RacingGameInput racingGameInput = new RacingGameInput();
		final RacingGameInputController input
			= new RacingGameInputController(validation, racingGameInput);
		final RacingGameOutput output = new RacingGameOutput();
		final RandomGenerator randomGenerator = new RandomGenerator();
		RacingGameController racingGame
			= new RacingGameController(input, output, randomGenerator);
		racingGame.startRacing();
	}
}
