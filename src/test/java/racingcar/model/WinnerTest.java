package racingcar.model;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WinnerTest {
    public static String TEST1 = "test";
    public static String TEST2 = "test2";

    Winner winner = new Winner();

    @Test
    @DisplayName("Winner을 추가할 때")
    void addWinner() {
        //given
        List<Car> answer = new ArrayList<>();
        answer.add(new Car(TEST1));
        answer.add(new Car(TEST2));

        //when
        Winner winner = new Winner();
        winner.addWinner(new Car(TEST1));
        winner.addWinner(new Car(TEST2));
        List<Car> result = winner.getWinners();

        //test
        assertArrayEquals(answer.toArray(), result.toArray());
    }

    @Test
    @DisplayName("바른 winner list를 가져오는 지 확인")
    void getWinners() {
        List<Car> answer = new ArrayList<>();
        answer.add(new Car(TEST1));
        answer.add(new Car(TEST2));

        //when
        Winner winner = new Winner();
        winner.addWinner(new Car(TEST1));
        winner.addWinner(new Car(TEST2));
        List<Car> result = winner.getWinners();

        //test
        assertArrayEquals(answer.toArray(), result.toArray());
    }
}