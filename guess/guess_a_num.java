import java.util.Scanner;
import java.util.Random;

class guess_a_num {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number btw 1 to 100");
        for (int i = 1; i <= 5; i++) {
            int b = sc.nextInt();
            if (b == a) {
                System.out.println("you guess right number");
                if (i == 1) {

                    System.out.println("you got 10 outof 10");
                } else if (i == 2) {
                    System.out.println("you got 8 outof 10");
                } else if (i == 3) {
                    System.out.println("you got 6 out of 10");
                } else if (i == 4) {
                    System.out.println("you got 4 outof 10");
                } else {
                    System.out.println("you got 2 outof 10");
                }
                break;
            } else if (b > a) {
                System.out.println(" Number is less then " + b);
                System.out.println("Enter the number ");
            }else{
                System.out.println("Number is greater then "+b);
                System.out.println("Enter the number ");
            }
        }

    }
}