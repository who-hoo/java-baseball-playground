package baseball;

import java.util.*;

public class Game {

    private final Random random = new Random();
    private final List<Integer> answer = new ArrayList<>();

    public Game() {
        initAnswer();
    }

    private void initAnswer() {
        while (answer.size() < 3) {
            int num = random.nextInt(9) + 1;
            insertNumberToAnswer(num);
        }
    }

    private void insertNumberToAnswer(int num) {
        if (!answer.contains(num)) {
            answer.add(num);
        }
    }
}
