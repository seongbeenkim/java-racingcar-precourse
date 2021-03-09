package racingcar.controller;

import racingcar.constant.Constant;
import racingcar.model.Car;
import racingcar.model.Race;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class RaceController {
    private Race race;
    private InputView inputView;
    private OutputView outputView;

    public RaceController(Race race, Scanner scanner) {
        this.race = race;
        this.inputView = new InputView(scanner, this);
        this.outputView = new OutputView();
    }

    public void race() {
        inputView.printInputView();
    }

    public String[] splitCarName (String carName) {
        String[] carNames = carName.split(Constant.SPLIT_DELIMITER);
        return carNames;
    }

    public void addCar(String[] carNames) {
        Arrays.stream(carNames)
                .forEach(carName -> race.addCar(new Car(carName)));

        race.getCars().stream()
                .forEach(car -> System.out.println(car.getName()));
    }

    public void initRound(int round) {
        race.initRound(round);
    }
}
