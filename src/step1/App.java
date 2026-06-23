package step1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner 생성
        Scanner sc = new Scanner(System.in);
        //양의 정수(0포함)를 2개 입력받기
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        if (num1 < 0){
            System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
            return;
        }
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        if(num2 < 0){
            System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
            return;

        }
    }

}
