package calendar;

import java.util.Scanner;

public class Prompt {

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();

    }

    public int parseDay(String days) {
        if (days.equals("su")) return 0;
        else if (days.equals("mo")) return 1;
        else if (days.equals("tu")) return 2;
        else if (days.equals("we")) return 3;
        else if (days.equals("th")) return 4;
        else if (days.equals("fr")) return 5;
        else if (days.equals("sa")) return 6;
        else
            return 0;
    }

    public void runPrompt() {

        Calendar cal = new Calendar();
        Scanner scanner = new Scanner(System.in);

        int month = 1;
        int year = -1;

        while (true) {
            System.out.println("년도를 입력하세요. (Exit : -1) ");
            year = scanner.nextInt();
            if (year == -1) {
                break;
            }
            System.out.println("달을 입력하세요.");
            month = scanner.nextInt();

            if (month > 12 || month < 1) {
                continue;
            }
            cal.printCalendar(year, month);
        }
        System.out.println("Bye");

    }
}
