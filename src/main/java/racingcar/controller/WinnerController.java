package racingcar.controller;

import java.util.List;
import java.util.stream.Collectors;

import racingcar.model.Car;
import racingcar.model.Race;
import racingcar.model.Winner;
import racingcar.view.WinnerView;

public class WinnerController {
    private Winner winner;
    private Race race;


    public WinnerController(Winner winner, Race race) {
        this.winner = winner;
        this.race = race;
    }

    private int getMaxPosition() {
        List<Car> cars = race.getCars();
        return cars.stream()
                .max((o1, o2) -> o1.getPosition() - o2.getPosition())
                .get()
                .getPosition();
    }

    private void addWinners() {
        List<Car> cars = race.getCars().stream()
                .filter(car -> car.getPosition() == getMaxPosition())
                .collect(Collectors.toList());
        cars.stream().forEach(this::addCar);
    }

    private void addCar(Car car) {
        winner.addWinner(car);
    }

    public List<Car> getWinners() {
        return winner.getWinners();
    }

}
