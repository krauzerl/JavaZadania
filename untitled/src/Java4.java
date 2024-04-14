import java.util.Scanner;

public class Java4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String imie = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj wzrost w metrach");
        Double wzrost = scanner.nextDouble();
        System.out.println("Podaj rok urodzenia");
        int rok = scanner.nextInt();
        System.out.println("Witaj " + imie + " " + nazwisko + "!");
        System.out.println("Masz " + wzrost + " m wzrostu i urodziłeś się w " + rok + " roku!");

    }
}