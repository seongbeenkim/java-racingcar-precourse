package racingcar.race;


import racingcar.Car;

import java.util.List;

public class Race {
    private RaceInformation raceInformation;

    public Race() {
        raceInformation = RaceInformation.getInstance();
    }

    public void raceAllAttempt() {
        for (int i = 0; i < raceInformation.getNumberOfAttempt(); i++) {
            raceOneAttempt();
        }
    }

    public void raceOneAttempt() {
        List<Car> cars = raceInformation.getCarInformations();

        for (Car car : cars) {
            car.drive();
            printOneAttemptResult(cars);
            raceInformation.setCarInformations(cars);
        }
    }

    public void printOneAttemptResult(List<Car> cars) {
        for (Car car : cars) {
            car.printInfo();
        }
        System.out.println();
    }
}
