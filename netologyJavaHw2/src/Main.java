import ru.netology.service.CustomsService;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();
        System.out.print("Размер пошлины (в руб.) составит: ");
        System.out.println(CustomsService.calculateCustoms(price, weight));
    }


}