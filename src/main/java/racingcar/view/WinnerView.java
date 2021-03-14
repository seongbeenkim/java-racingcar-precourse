package racingcar.view;

import java.util.List;

import racingcar.constant.Constant;
import racingcar.controller.WinnerController;
import racingcar.model.Car;

public class WinnerView {
    private WinnerController winnerController;

    public WinnerView(WinnerController winnerController) {
        this.winnerController = winnerController;
    }

    public void printWinner() {
        String winnerMessage;
        winnerController.addWinners();
        List<Car> cars = winnerController.getWinners();
        winnerMessage = getWinnerMessage(cars);
        System.out.println(winnerMessage);
    }

    private String getWinnerMessage(List<Car> cars) {
        StringBuilder winnerMessage = new StringBuilder(Constant.WINNER_MESSAGE_FORMAT);
        winnerMessage.append(cars.get(0).getName());

        for (int i = 1; i < cars.size(); i++) {
            winnerMessage.append(", ");
            winnerMessage.append(cars.get(i).getName());
        }

        return winnerMessage.toString();
    }
}
