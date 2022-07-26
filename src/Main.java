import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            System.out.println("Chọn hình muốn in bằng cách nhập số từ 1-4");
            System.out.println("1. In ra hình chữ nhật");
            System.out.println("2. In hình tam giác vuông tại 4 chỗ");
            System.out.println("3. In hình tam giác cân");
            System.out.println("4. Exit");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("In hình chữ nhật");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Bạn muốn chọn loại tam giác vuông nào: bottom-left, top-left, top-right, bottom-right");
                    String type = scanner.next();
                    if (type.equals("bottom-left")) {
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("top-left")) {
                        for (int i = 5; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("top-right")) {
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                    }
                    if (type.equals("bottom-right")) {
                        for (int i = 8; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }

                    break;
                case 3:
//                    System.out.println("In hình tam giác cân");
//                    int k = 0;
//                    for (int i = 1; i <= 5; ++i, k = 0) {
//                        for (int j = 1; j <= 5 - i; ++j) {
//                            System.out.print(" ");
//                        }
//                        while (k != 2 * i - 1) {
//                            System.out.print("* ");
//                            ++k;
//                        }
//                        System.out.println("");
//                    }
                    int star = 1;
                    for (int i = 1; i < 4; i++) {
                        for (int k = 4 - i; k >0 ; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < star; j++) {
                            System.out.print("*");
                        }
                        star+=2;
                        System.out.println("");
                    }
            }
        }
        while (number != 4);
    }


}
