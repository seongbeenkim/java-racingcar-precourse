package racingcar.view;

import racingcar.constant.Constant;
import racingcar.controller.RaceController;

import java.util.InputMismatchException;
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
        System.out.println(Constant.INIT_ROUND_MESSAGE);
        try {
            raceController.initRound(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println(Constant.ERROR_MESSAGE_FORMAT + Constant.ILLEGAL_NUMBER_FORMAT);
            System.exit(1);
        }
    }
}