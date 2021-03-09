package racingcar.view;

import racingcar.constant.Constant;
import racingcar.controller.RaceController;
import racingcar.model.Race;

import java.util.Scanner;

public class InputView {
    private Scanner scanner;
    private RaceController raceController;

    public InputView(Scanner scanner, RaceController raceController) {
        this.scanner = scanner;
        this.raceController = raceController;
    }

    public void printInputView() {
        System.out.println(Constant.INIT_CAR_MESSAGE);
        String[] carName = raceController.splitCarName(scanner.nextLine());
        raceController.addCar(carName);
        raceController.initRound(scanner.nextInt());
    }
}