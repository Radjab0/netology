import java.util.Scanner;
public class hw1Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите ваш доход: ");
        int income = scanner.nextInt();

        System.out.printf("Введите ваши расходы: ");
        int spending = scanner.nextInt();
        int total = income - spending;

        System.out.printf("Итого (руб):%n" + total);
    }
}