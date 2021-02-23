package racingcar.race;

import racingcar.Car;
import racingcar.race.RaceInformation;

import java.util.List;
import java.util.Scanner;

public class Initialize {
    private RaceInformation raceInformation;

    public Initialize() {
        raceInformation = RaceInformation.getInstance();
    }

    public void init(Scanner scanner) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String nameBuffer = scanner.next();
        System.out.println("시도할 회수는 몇회인가요?");
        raceInformation.initRegisterInformation(scanner.nextInt());
        raceInformation.initCarInformations(raceInformation.splitCarNameBuffer(nameBuffer));
    }
}
