package racingcar;

import racingcar.race.Initialization;
import racingcar.race.Race;
import racingcar.race.RaceInformation;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        Initialization initialization = new Initialization();
        initialization.init(scanner);

        Race race = new Race();
        race.raceAllAttempt();

        RaceInformation.getInstance().printWinnerList();
        scanner.close();
    }
}
