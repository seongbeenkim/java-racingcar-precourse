package racingcar.view;

import racingcar.constant.Constant;
import racingcar.controller.RaceController;
import racingcar.model.Car;

import java.util.List;

public class RaceView {
    private RaceController raceController;

    public RaceView(RaceController raceController) {
        this.raceController = raceController;
    }

    public void printRace() {
        for(int i = 0; i < raceController.getRoundInformation(); i++) {
            List<Car> cars = getCarInformation();
            printRound(cars);
            System.out.println();
        }
    }

    private List<Car> getCarInformation() {
        raceController.updateCarInformation();
        List<Car> cars = raceController.getCarInformation();
        return cars;
    }

    private void printRound(List<Car> cars) {
        cars.stream()
                .forEach(car -> {
                    System.out.print(car.getName() + " :");
                    printCurrentPosition(car);
                });
    }

    private void printCurrentPosition(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(Constant.CAR_TRACK_FORMAT);
        }
        System.out.println();
    }

}
