package baseball.view;

public class ResultView {

    public void showHint(int strike, int ball) {
        String hint = "";
        if (ball > 0) {
            hint = hint.concat(ball + "볼 ");
        }
        if (strike > 0 ) {
            hint = hint.concat(strike + "스트라이크");
        }
        if (ball == 0 && strike == 0) {
            hint = hint.concat("낫싱");
        }
        System.out.println(hint);
    }

    public void showWinningMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
