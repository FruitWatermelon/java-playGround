package TimesTable;

import java.util.Scanner;

public class TimeTables {

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = Main.caculate(i);
            Main.print(result);
        }

        // 2단
//        System.out.println(2 * 1);
//        System.out.println(2 * 2);
//        System.out.println(2 * 3);
//        System.out.println(2 * 4);
//        System.out.println(2 * 5);
//        System.out.println(2 * 6);
//        System.out.println(2 * 7);
//        System.out.println(2 * 8);
//        System.out.println(2 * 9);
//
//        // 3단
//        System.out.println(3 * 1);
//        System.out.println(3 * 2);
//        System.out.println(3 * 3);
//        System.out.println(3 * 4);
//        System.out.println(3 * 5);
//        System.out.println(3 * 6);
//        System.out.println(3 * 7);
//        System.out.println(3 * 8);
//        System.out.println(3 * 9);

        //4단
//        int result = 4 * 1;
//        System.out.println(result);
//        result = 4 * 2;
//        System.out.println(result);
//        result = 4 * 3;
//        System.out.println(result);
//        result = 4 * 4;
//        System.out.println(result);
//        result = 4 * 5;
//        System.out.println(result);
//        result = 4 * 6;
//        System.out.println(result);
//        result = 4 * 7;
//        System.out.println(result);
//        result = 4 * 8;
//        System.out.println(result);
//        result = 4 * 9;
//        System.out.println(result);

        // 5단
//        System.out.println("출력하고 싶은 단은? :");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        System.out.println(number * 1);
//        System.out.println(number * 2);
//        System.out.println(number * 3);
//        System.out.println(number * 4);
//        System.out.println(number * 5);
//        System.out.println(number * 6);
//        System.out.println(number * 7);
//        System.out.println(number * 8);
//        System.out.println(number * 9);

        // 6단
//        int i = 1;
//        while(i<10){
//            System.out.println(6 * i);
//            i = i+1;
//        }
//
//        // 7단
//        for(int j=1; j<10; j++){
//            System.out.println(7 * j);
//        }

        // 8단
//        System.out.println("구현하고 싶은 단은 ? :");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if (number >= 2 && number <= 9) {
//            for (int i = 1; i < 10; i++) {
//                System.out.println(number * i);
//            }
//        } else {
//            System.out.println("2 이상 9 이하의 숫자를 입력해주세요.");
//        }

//        int[] result = new int[9];
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = 2 * (i + 1); // 2단 배열
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
//
//        result = new int[9];
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = 3 * (i + 1); // 3단 배열
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

    }
}
