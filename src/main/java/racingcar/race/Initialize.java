package racingcar.race;

import java.util.InputMismatchException;
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

        try {
            raceInformation.initRegisterInformation(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
            System.exit(0);
        }
        raceInformation.initCarInformations(raceInformation.splitCarNameBuffer(nameBuffer));
    }
}
