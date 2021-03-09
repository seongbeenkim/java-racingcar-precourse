package racingcar.model;

import racingcar.constant.Constant;
import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    private boolean isCarProgress(int randomNUmber) {
        if (randomNUmber >= Constant.PROGRESS_RANGE) {
            return true;
        }
        return false;
    }

    public void drive() {
        if (isCarProgress(RandomUtils.nextInt(Constant.RANDOM_START_INCLUSIVE, Constant.RANDOM_END_INCLUSIVE))) {
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
