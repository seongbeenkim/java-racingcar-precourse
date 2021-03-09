package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars;
    private int raceNumber;

    public Race(int raceNumber, List<Car> cars) {
        this.raceNumber = raceNumber;
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getRaceNumber() {
        return raceNumber;
    }
}
