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

    public void setCarInformations(List<Car> carInformations) {
        this.carInformations = carInformations;
    }

    public int getMaxPosition() {
        int max = -1;

        for (Car car : carInformations) {
            max = Math.max(max, car.getPosition());
        }

        return max;
    }

    public List<String> getWinnerList() {
        List<String> winnerList = new ArrayList<String>();
        int max = getMaxPosition();

        for (Car car : carInformations) {
            if (car.getPosition() == max) {
                winnerList.add(car.getName());
            }
        }
        return winnerList;
    }

    public void printWinnerList() {
        List<String> winnerList = getWinnerList();

        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winnerList.size() - 1; i++) {
            System.out.print(winnerList.get(i) + " ,");
        }
        System.out.println(winnerList.get(winnerList.size() - 1));
    }
}
