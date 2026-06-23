package step2;

import java.util.ArrayList;

public class Calculator {

    public List<Integer> results = new ArrayList<>();

    public Integer calculate(int num1, int num2, char operator) {

        int result;

        switch (ch) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
                result = num1 / num2;
            }
            default -> throw new IllegalArgumentException("지원하지 않는 연산자 입니다.");
        }
        return result;
    }
}
