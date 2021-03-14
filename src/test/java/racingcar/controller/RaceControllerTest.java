package racingcar.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Race;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RaceControllerTest {
    RaceController raceController = new RaceController(new Race(), new Scanner(System.in));

    @Test
    @DisplayName("race 시작")
    void race() {
    }

    @Test
    @DisplayName("구분자\",\"를 기준으로 문자열 처리 후 String[]로 리턴")
    void splitCarName() {
        String testString = "pobi,woni,jun";
        String[] result = raceController.splitCarName(testString);
        String[] answer = {"pobi", "woni", "jun"};

        assertArrayEquals(result, answer);
    }

    @Test
    @DisplayName("String[]를 매개변수로 받은 값으로 AddModel에 추가")
    void addCar() {
        String[] test = {"pobi", "woni", "jun"};
        raceController.addCar(test);
    }
}