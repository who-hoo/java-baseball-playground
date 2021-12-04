package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.joining;

public class Answer {

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
        while (numbers.size() < 3) {
            int num = random.nextInt(9) + 1;
            insertNumberToAnswer(num);
        }
    }

    private void insertNumberToAnswer(int num) {
        if (!numbers.contains(num)) {
            numbers.add(num);
        }
    }
}
