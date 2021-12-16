package baseball;

import baseball.controller.BaseballGameController;
import baseball.controller.InputController;
import baseball.model.ComputerPlayer;
import baseball.utils.DataValidation;
import baseball.utils.RandomGenerator;
import baseball.view.BaseballGameInput;
import baseball.view.BaseballGameOutput;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        final ComputerPlayer computerPlayer = new ComputerPlayer(new RandomGenerator());
        final InputController inputController = new InputController(new DataValidation(),
            new BaseballGameInput());
        final BaseballGameOutput baseballGameOutput = new BaseballGameOutput();
        final BaseballGameController baseballGameController =
            new BaseballGameController(computerPlayer, inputController, baseballGameOutput);
        baseballGameController.startGame();
    }
}
