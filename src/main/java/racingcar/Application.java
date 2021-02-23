package racingcar;

import racingcar.race.Initialize;
import racingcar.race.Race;
import racingcar.race.RaceInformation;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        Initialize initialize = new Initialize();
        initialize.init(scanner);

        Race race = new Race();
        race.raceAllAttempt();

        RaceInformation.getInstance().printWinnerList();
        scanner.close();
    }
}
