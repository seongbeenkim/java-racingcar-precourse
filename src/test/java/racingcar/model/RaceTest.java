package racingcar.model;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {
    public static final int TEST_ROUNT = 3;
    public static final String TEST_NAME1 = "test1";
    public static final String TEST_NAME2 = "test2";
    Race race = new Race();

    @AfterEach
    public void afterEach() {
        race = new Race();
    }
    @Test
    @DisplayName("Round의 수 초기화")
    void initRound() {
        race.initRound(TEST_ROUNT);
        int result = race.getRound();

       assertEquals(result, TEST_ROUNT);
    }

    @Test
    @DisplayName("race에 자동차 정보 추가하기")
    void addCar() {
        race.addCar(new Car(TEST_NAME1));
        String result = race.getCars().get(0).getName();

        assertEquals(TEST_NAME1, result);
    }

    @Test
    @DisplayName("race에서 자동차 정보 받아오기")
    void getCars() {
        race.addCar(new Car(TEST_NAME1));
        race.addCar(new Car(TEST_NAME2));

        List<Car> result = new ArrayList<>();
        result.add(new Car(TEST_NAME1));
        result.add(new Car(TEST_NAME2));

        assertArrayEquals(result.toArray(), race.getCars().toArray());
    }
}