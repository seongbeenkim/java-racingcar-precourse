package racingcar.race;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class RaceInformation {
    private int numberOfAttempt;
    private List<Car> carInformations = new ArrayList<>();
    private static RaceInformation raceInformation= new RaceInformation();

    private RaceInformation() { }

    public static RaceInformation getInstance() {
        return raceInformation;
    }
    public void initRegisterInformation(int numberOfAttempt) {
        this.numberOfAttempt = numberOfAttempt;
    }

    public int getNumberOfAttempt() {
        return numberOfAttempt;
    }

    public void initCarInformations(String[] carNames) {
        for (String carName : carNames) {
            carInformations.add(new Car(carName));
        }
    }

    public String[] splitCarNameBuffer(String carNameBuffer) {
        return carNameBuffer.split(",");
    }

    public List<Car> getCarInformations() {
        return carInformations;
    }
}
