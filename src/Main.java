public class Main {
    public static void main(String[] args) {
        System.out.println("In hình chữ nhật");
        for (int i = 0; i < 3; i++) {
                System.out.println("* * * * * * *");
        }

        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở bottom-left");
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
        for (int i = 5; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("In hình tam giác cân");
        int k =0;
        for (int i = 1; i <= 5; ++i, k = 0) {
            for (int j = 1; j <= 5 - i; ++j) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }


}
