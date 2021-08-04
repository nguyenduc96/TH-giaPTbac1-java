import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a;
        float b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số a : ");
        a = scanner.nextFloat();

        System.out.println("Nhập vào số b : ");
        b = scanner.nextFloat();

        if (a == 0 && b == 0){
            System.out.println("Phương trình có vô số nghiệm!!");
        }
        else if (a == 0 && b != 0){
            System.out.println("Phương trình vô nghiệm!!");
        }
        else {
            float x = (-b)/a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
