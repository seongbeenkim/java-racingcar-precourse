package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private List<Car> winners;

    public Winner() {
        winners = new ArrayList<>();
    }

    public void addWinner(Car car) {
        winners.add(car);
    }

    public List<Car> getWinners() {
        return winners;
    }
}
