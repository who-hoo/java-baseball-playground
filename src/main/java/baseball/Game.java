package baseball;

import baseball.view.InputView;
import java.util.*;

public class Game {

    private final Random random = new Random();
    private final List<Integer> answer = new ArrayList<>();
    private final InputView input = new InputView();
    private boolean isRunning = true;

    public Game() {
        initAnswer();
    }

    public void run() {
        while (isRunning) {
            int userGuess = input.getUserInput();
            System.out.println(userGuess);
        }
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
