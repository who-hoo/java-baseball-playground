package baseball;

import baseball.view.InputView;
import baseball.view.ResultView;
import java.util.*;

public class Game {

    private final Random random = new Random();
    private final List<Integer> answer = new ArrayList<>();
    private final InputView input = new InputView();
    private final ResultView output = new ResultView();
    private boolean isRunning = true;

    public Game() {
        initAnswer();
    }

    public void run() {
        while (isRunning) {
            System.out.println(answer); // 테스트용
            String userGuess = input.getUserGuess();
            compareWithAnswer(userGuess);
        }
    }

    private void initAnswer() {
        answer.clear();
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

    private void compareWithAnswer(String userGuess) {
        String answerToString = "";
        for (int number : answer) {
            answerToString = answerToString.concat(String.valueOf(number));
        }

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < userGuess.length(); i++) {
            if (userGuess.charAt(i) == answerToString.charAt(i)) {
                strike++;
            }
            if (answerToString.contains(String.valueOf(userGuess.charAt(i)))) {
                ball++;
            }
        }

        ball -= strike;
        output.showHint(strike, ball);

        if (strike == 3) {
            output.showWinningMessage();
            gameOver();
        }
    }

    private void gameOver() {
        if (input.getUserContinue()) {
            resetGame();
            return;
        }
        terminate();
    }

    private void resetGame() {
        isRunning = true;
        initAnswer();
    }

    private void terminate() {
        isRunning = false;
        input.close();
    }
}
