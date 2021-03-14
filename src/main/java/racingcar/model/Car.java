package racingcar.model;

import racingcar.constant.Constant;

import java.util.Objects;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public boolean isCarProgress(int randomNUmber) {
        return randomNUmber >= Constant.PROGRESS_RANGE;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Car car = (Car) other;
        return position == car.position && name.equals(car.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
