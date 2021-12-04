package baseball.view;

import java.util.Scanner;

public class InputView {

    private final Scanner sc = new Scanner(System.in);

    public int getUserGuess() {
        System.out.print("숫자를 입력해 주세요 : ");
        return Integer.parseInt(sc.nextLine());
    }
}
