package calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
    public static void main(String[] args) throws ParseException {
        Prompt p = new Prompt();
        p.runPrompt();
    }

    public void printMenu() {
        System.out.println("+----------------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+----------------------+");
//        System.out.println("명령 (1, 2, 3, h, q)");
    }

    public int parseDay(String week) {
        switch (week) {
            case "su":
                return 0;
            case "mo":
                return 1;
            case "tu":
                return 2;
            case "we":
                return 3;
            case "th":
                return 4;
            case "fr":
                return 5;
            case "sa":
                return 6;
            default:
                return 0;
        }
    }

    public void runPrompt() throws ParseException {
        printMenu();

        Calendar cal = new Calendar();
        Scanner scanner = new Scanner(System.in);

        boolean isLoop = true;
        while (isLoop) {
            System.out.println("명령 (1, 2, 3, h, q)");
            String cmd = scanner.next();
            switch (cmd) {
                case "1":
                    cmdRegister(scanner, cal);
                    break;
                case "2":
                    cmdSearch(scanner, cal);
                    break;
                case "3":
                    cmdCal(scanner, cal);
                    break;
                case "h":
                    printMenu();
                    break;
                case "q":
                    isLoop = false;
                    break;
            }
        }
        System.out.println("Bye");
    }

    private void cmdCal(Scanner s, Calendar c) {
        int month = 1;
        int year = -1;
        System.out.println("년도를 입력하세요. (Exit : -1) ");
        year = s.nextInt();

        System.out.println("달을 입력하세요.");
        month = s.nextInt();

        if (month > 12 || month < 1) {
            System.out.println("mistake you input month");
            return;
        }
        c.printCalendar(year, month);
    }

    private void cmdSearch(Scanner s, Calendar c) {
        System.out.println("[일정 검색]");
        System.out.println("날짜를 입력해 주세요. (yyyy-MM-dd)");
        String date = s.next();
        String plan = "";
        try {
            plan = c.searchPlan(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(plan);
    }

    private void cmdRegister(Scanner s, Calendar c) throws ParseException {
        System.out.println("[새 일정 등록]");
        System.out.println("날짜를 입력해 주세요. (yyyy-MM-dd)");
        String date = s.next();
        String text = "";
        System.out.println("일정을 입력해 주세요.");
        while (true) {
            String word = s.next();
            text += word + " ";
            if (word.endsWith(";")) {
                break;
            }
        }
        c.registerPlan(date, text);
    }
}
