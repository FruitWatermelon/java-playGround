package calendar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요 Ex) 5 10");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("두 수의 합은 " + sum + " 입니다.");


    }
}
