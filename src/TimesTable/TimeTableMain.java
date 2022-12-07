package TimesTable;

import java.util.Scanner;

public class TimeTableMain {

    public static void main(String[] args) {

        System.out.println("출력하실 구구단의 값을 입력하세요 ");
        System.out.println("Ex) 8,7 입력시 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현됩니다.");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        timeTable(inputValue);
    }

    public static void timeTable(String inputValue) {

        String[] splitedValue = inputValue.split(",");

        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        for (int i = 2; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

    }
}
