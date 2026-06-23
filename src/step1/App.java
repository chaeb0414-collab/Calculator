package step1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner 생성
        Scanner sc = new Scanner(System.in);
        String exit = "";
        // 계산 반복 시키기
        while (!exit.equals("exit")) {
            //양의 정수(0포함)를 2개 입력받기
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return;
            }
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return;
            }
            // 사칙연산 기호(+,-,*,/) 입력받기
            System.out.println("사칙연산 기호를 입력하세요: ");
            char ch = sc.next().charAt(0);

            int result;

            switch (ch) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return;
                    }
                    result = num1 / num2;
                }
                default -> {
                    System.out.println("지원하지 않는 연산자 입니다.");
                    return;
                }
            }
            System.out.println("결과: " + result);
            System.out.println("종료를 원하면 exit / 계속하려면 아무 글자 입력");
            exit = sc.next();
        }
        sc.close();
        System.out.println("계산기를 종료합니다.");
    }


}
