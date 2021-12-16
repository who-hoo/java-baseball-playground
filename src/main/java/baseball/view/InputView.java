package baseball.view;

import java.util.Scanner;

public class InputView {

    private static final String CONTINUE = "1";
    private static final String TERMINATE = "2";
    private static final String GUESS_MSG = "숫자를 입력해 주세요 : ";
    private static final String CONTINUE_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private final Scanner sc = new Scanner(System.in);

    public String getUserGuess() {
        // TODO: 예외처리
        // 1. 숫자가 아닌 경우
        // 2. 세자리 숫자가 아닌 경우
        // 3. 세 숫자가 서로 다른 숫자가 아닌 경우
        System.out.print(GUESS_MSG);
        return sc.nextLine();
    }

    public boolean getUserContinue() {
        System.out.println(CONTINUE_MSG);
        String input = sc.nextLine();
        if (input.equals(CONTINUE)) {
            return true;
        }
        if (input.equals(TERMINATE)) {
            return false;
        }
        return getUserContinue();
    }

    public void close() {
        sc.close();
    }
}
