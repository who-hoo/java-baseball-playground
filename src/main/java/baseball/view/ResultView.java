package baseball.view;

public class ResultView {

    private static final String BALL = "볼 ";
    private static final String STRIKE = "스트라이크";
    private static final String NOTING = "낫싱";
    private static final String WINNING_MSG = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void showHint(int strikeCnt, int ballCnt) {
        String hint = "";
        if (ballCnt > 0) {
            hint = hint.concat(ballCnt + BALL);
        }
        if (strikeCnt > 0 ) {
            hint = hint.concat(strikeCnt + STRIKE);
        }
        if (ballCnt == 0 && strikeCnt == 0) {
            hint = hint.concat(NOTING);
        }
        System.out.println(hint);
    }

    public void showWinningMessage() {
        System.out.println(WINNING_MSG);
    }
}
