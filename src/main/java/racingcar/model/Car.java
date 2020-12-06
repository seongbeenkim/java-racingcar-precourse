package racingcar.model;

import static racingcar.constant.Constants.*;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        validateMaxNameLength(name);
        validateMinNameLength(name);
        this.name = name;
        this.position = POSITION_INIT_VALUE;
    }

    private void validateMaxNameLength(String name) {

        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_LENGTH_GREATER_THAN_FIVE);
        }

    }

    private void validateMinNameLength(String name) {

        if (name.length() < MIN_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_LENGTH_LESS_THAN_ONE);
        }

    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public void moveFoward() {
        this.position += MOVEMENT_RANGE;
    }
}
