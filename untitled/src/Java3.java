import java.util.Scanner;


public class Java3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String imie = scanner.nextLine();
        System.out.println("Witaj "+ imie + "!");
    }
}
