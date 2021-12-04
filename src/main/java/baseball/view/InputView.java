package baseball.view;

import java.util.Scanner;

public class InputView {

    private final Scanner sc = new Scanner(System.in);

    public String getUserGuess() {
        // TODO: 예외처리
        // 1. 숫자가 아닌 경우
        // 2. 세자리 숫자가 아닌 경우
        // 3. 세 숫자가 서로 다른 숫자가 아닌 경우
        System.out.print("숫자를 입력해 주세요 : ");
        return sc.nextLine();
    }

    public boolean getUserContinue() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = sc.nextLine();

        if (input.equals("1")) {
            return true;
        }
        if (input.equals("2")) {
            return false;
        }

        return getUserContinue();
    }

    public void close() {
        sc.close();
    }
}
