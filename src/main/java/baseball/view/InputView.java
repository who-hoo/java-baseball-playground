package baseball.view;

import java.util.Scanner;

public class InputView {

    private final Scanner sc = new Scanner(System.in);

    public int getUserGuess() {
        System.out.print("숫자를 입력해 주세요 : ");
        return Integer.parseInt(sc.nextLine());
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
