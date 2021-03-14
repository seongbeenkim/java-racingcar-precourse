package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.controller.RaceController;
import racingcar.model.Car;
import racingcar.model.Race;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RaceViewTest {
    public static final int ROUND = 5;

    @Test
    @DisplayName("Race를 출력하는 메서드")
    void printRace() {
        //Given
        Race race = new Race();
        race.initRound(ROUND);
        race.addCar(new Car("pobi"));
        race.addCar(new Car("dobi"));
        race.addCar(new Car("chovy"));

        RaceController raceController = new RaceController(race, new Scanner(System.in));
        RaceView raceView = new RaceView(raceController);

        raceView.printRace();
    }
}