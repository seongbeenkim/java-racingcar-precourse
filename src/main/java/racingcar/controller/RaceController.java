package racingcar.controller;

import racingcar.constant.Constant;
import racingcar.model.Car;
import racingcar.model.Race;
import racingcar.view.InputView;
import racingcar.view.RaceView;
import utils.RandomUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RaceController {
    private Race race;
    private InputView inputView;
    private RaceView raceView;

    public RaceController(Race race, Scanner scanner) {
        this.race = race;
        this.inputView = new InputView(scanner, this);
        this.raceView = new RaceView(this);
    }

    public void race() {
        inputView.printInputView();
        raceView.printRace();
    }

    public String[] splitCarName (String carName) {
        String[] carNames = carName.split(Constant.SPLIT_DELIMITER);
        return carNames;
    }

    public void addCar(String[] carNames) {
        Arrays.stream(carNames)
                .forEach(carName -> race.addCar(new Car(carName)));
    }

    public void initRound(int round) {
        race.initRound(round);
    }

    public List<Car> getCarInformation() {
        return race.getCars();
    }

    public int getRoundInformation() {
        return race.getRound();
    }

    public void updateCarInformation() {
        List<Car> cars = race.getCars();
        cars.stream()
                .forEach(car -> {
                    int randomNumber = RandomUtils.nextInt(Constant.RANDOM_START_INCLUSIVE, Constant.RANDOM_END_INCLUSIVE);
                    car.drive(car.isCarProgress(randomNumber));
                });
    }

}
