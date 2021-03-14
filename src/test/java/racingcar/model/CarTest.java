package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car("test");

    @Test
    @DisplayName("차량의 setPosition을 증기시키는 메서드")
    void drive() {
        int currentPosition, nextPosition, answer;

        currentPosition = car.getPosition();
        car.drive(true);
        nextPosition = car.getPosition();
        answer = currentPosition + 1;

        assertEquals(nextPosition, answer);

        currentPosition = car.getPosition();
        car.drive(false);
        nextPosition = car.getPosition();
        answer = currentPosition;

        assertEquals(answer, nextPosition);
    }

    @Test
    @DisplayName("random 값을 확인해서 4이상이면 true 아니면 false")
    void isCarProgress() {
        boolean result = car.isCarProgress(4);
        boolean answer = true;

        assertEquals(result, answer);

        result = car.isCarProgress(5);
        answer = car.isCarProgress(2);

        assertEquals(result, answer);
    }
    @Test
    @DisplayName("차량의 이름 return")
    void getName() {
        assertEquals(car.getName(), "test");
    }

    @Test
    @DisplayName("차량의 현재 posigion을 return")
    void getPosition() {
        assertEquals(car.getPosition(), 1);
    }
}