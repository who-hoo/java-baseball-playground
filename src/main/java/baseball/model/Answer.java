package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.joining;

public class Answer {

    public static final int COUNT = 3;
    public static final int MIN = 1;
    public static final int MAX = 9;

    private final Random random = new Random();
    private final List<Integer> numbers = new ArrayList<>();

    public Answer() {
        initAnswer();
    }

    @Override
    public String toString() {
        return numbers.stream()
            .map(String::valueOf)
            .collect(joining(""));
    }

    public void initAnswer() {
        numbers.clear();
        while (numbers.size() < COUNT) {
            int num = random.nextInt(MAX) + MIN;
            insertNumberToAnswer(num);
        }
    }

    private void insertNumberToAnswer(int num) {
        if (!numbers.contains(num)) {
            numbers.add(num);
        }
    }
}
