package racingcar;

import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;
    final int startInclusive = 0;
    final int endtInclusive = 9;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void drive() {
        if (isProgress()) {
            position++;
        }
    }

    public boolean isProgress() {
        if (RandomUtils.nextInt(startInclusive, endtInclusive) >= 4) {
            return true;
        }
        return false;
    }

    public void printInfo() {
        System.out.print(name + " : ");
        printTracking();
        System.out.println();
    }

    public void printTracking() {
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
    }
}
