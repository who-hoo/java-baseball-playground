package baseball;

import baseball.model.Answer;
import baseball.view.InputView;
import baseball.view.ResultView;

public class Game {

    private final Answer answer = new Answer();
    private final InputView input = new InputView();
    private final ResultView output = new ResultView();
    private boolean isRunning = true;

    public void run() {
        while (isRunning) {
            System.out.println(answer); // 테스트용
            String userGuess = input.getUserGuess();
            compareWithAnswer(userGuess);
        }
    }

    private int calcStrike(String userGuess) {
        String s = answer.toString();
        int strike = 0;
        for (int i = 0; i < userGuess.length(); i++) {
            if (userGuess.charAt(i) == s.charAt(i)) {
                strike++;
            }
        }
        return strike;
    }

    private int calcBall(String userGuess) {
        String s = answer.toString();
        int ball = 0;
        for (int i = 0; i < userGuess.length(); i++) {
            if (s.contains(String.valueOf(userGuess.charAt(i)))) {
                ball++;
            }
        }
        return ball;
    }

    private void compareWithAnswer(String userGuess) {
        int strike = calcStrike(userGuess);
        int ball = calcBall(userGuess) - strike;
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
        answer.initAnswer();
    }

    private void terminate() {
        isRunning = false;
        input.close();
    }
}
