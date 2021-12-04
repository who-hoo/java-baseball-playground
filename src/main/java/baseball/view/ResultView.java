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
}
