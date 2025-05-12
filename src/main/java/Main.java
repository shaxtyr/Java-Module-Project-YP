import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        // указываем данные для 3ех автомобилей
        for (int i = 1; i <= 3; i++) {
            Car car = new Car("", 0);

            // проверка на корректность названия
            while (true) {
                System.out.println("— Введите название машины №" + i + " :");
                car.brand = scanner.nextLine();
                if (car.brand.isEmpty()) {
                    System.out.println("— Пустое название автомобиля");
                } else {
                    break;
                }
            }

            // проверка на корректность скорости
            while (true) {
                System.out.println("— Введите скорость машины №" + i + " :");
                if (scanner.hasNextInt()) {
                    car.speed = scanner.nextInt();
                    scanner.nextLine();                                 //очищаем буффер
                    if (car.speed <= 0 || car.speed > 250) {
                        System.out.println("— Неправильная скорость");
                    } else {
                        break;
                    }
                }
                else {
                    scanner.nextLine();                                 //очищаем буффер
                    System.out.println("— Неправильная скорость");
                }
            }

            // если у нескольких участкиков одинаковая скорость, лидером будет та машина, скорость которой указана раньше
            race.getNewWinner(car);
        }
        scanner.close();
        System.out.println("Самая быстрая машина: " + race.currentWinner);
    }
}

