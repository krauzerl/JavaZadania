public class Java2 {
    public static void main(String[] args) {
        int startYear = 2001;
        int currentYear = 2024;

        for(int year = startYear; year <= currentYear ; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}
