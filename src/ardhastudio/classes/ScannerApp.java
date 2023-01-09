package ardhastudio.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Name: ");
        Integer age = scanner.nextInt();
        System.out.println("Hello " + name.toUpperCase() + " umur anda sekarang " + age);
    }
}
