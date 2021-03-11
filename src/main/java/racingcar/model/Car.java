package racingcar.model;

import racingcar.constant.Constant;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    //TODO change public to private
    public boolean isCarProgress(int randomNUmber) {
        if (randomNUmber >= Constant.PROGRESS_RANGE) {
            return true;
        }
        return false;
    }

    public void drive(boolean isCarProgress) {
        if (isCarProgress) {
            this.position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
