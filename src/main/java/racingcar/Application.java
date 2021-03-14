package racingcar;


import racingcar.controller.RaceController;
import racingcar.controller.WinnerController;
import racingcar.model.Race;
import racingcar.model.Winner;
import racingcar.view.InputView;
import racingcar.view.RaceView;
import racingcar.view.WinnerView;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        Race race = new Race();
        Winner winner = new Winner();

        RaceController raceController = new RaceController(race, scanner);
        WinnerController winnerController = new WinnerController(winner, race);

        InputView inputView = new InputView(scanner, raceController);
        RaceView raceView = new RaceView(raceController);
        WinnerView winnerView = new WinnerView(winnerController);

        inputView.printInputView();
        raceView.printRace();
        winnerView.printWinner();

        scanner.close();
    }
}
