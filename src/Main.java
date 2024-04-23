import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Виклик методу main з кожного класу в зазначеному порядку
        Exercise_1.main(args);
        Exercise_2.main(args);
        User.main(args);
        Car.main(args);
        Exercise_5.main(args);
    }
}

class Exercise_1 {
    public static void main (String args[]) {
        // Об'явлення та ініціалізація змінних типу int зі значеннями
        int x = 8, y = 4, z = 2, p = 1, v = 6;
        int t = 2,c = 9, n = 3, m = 1, a = 7;
        // Ініціалізація змінних q, w, e, r
        int q = 0, w = 0, e = 0 ,r = 0;
        // Обчислення суми всіх змінних
        q = x + y + z + p + v + t + c + n + m + a;
        // Обчислення різниці всіх змінних
        e = x - y - z - p - v - t - c - n - m - a;
        // Обчислення добутку всіх змінних
        w = x * y * z * p * v * t * c * n * m * a;
        // Обчислення частки всіх змінних
        r = x / y / z / p / v / t / c / n / m / a;
        // Виведення результатів на екран
        System.out.printf("\nРезульат додавання всіх змінних: %d \n", q);
        System.out.printf("Резульат віднімання всіх змінних: %d  \n", e);
        System.out.printf("Резульат множення всіх змінних: %d \n", w);
        System.out.printf("Резульат ділення всіх змінних:: %d \n", r);
    }
}

class Exercise_2 {
    public static void main (String args[]) {
        String name = "\nШлях";       String a= "рідний";
        String  b= "далеко";        String c = "веде";
        String d = "у";             String e = "далекі";
        String f = "степи,";        String g = "до";
        String h = "краю";          String j = "рідного.\n";
        System.out.printf(" %s %s %s %s %s %s %s %s %s %s \n", name, a, b, c,d,e,f,g,h,j);
    }}

class User {
    int id; // унікальний ідентифікатор
    int age; // вік
    String name; // ім'я
    String surname; // прізвище
    double weight; // вага
    double height; // зріст

    // Конструктор класу User для ініціалізації змінних об'єкта
    User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
    // Основний метод програми
    public static void main(String[] args) {
        // Масив об'єктів класу User, що містить дані про різних користувачів
        User[] a = {
                new User(1, 18, "Vitaliy", "Antonushun", 70.5, 175.0),
                new User(2, 19, "Hazar", "Docenko", 65.0, 160.0),
                new User(3, 18, "Mukola", "Tereshchyk", 80.0, 180.5),
                new User(4, 18, "Dmitro", "Blashchak", 55.0, 162.5),
                new User(5, 19, "Maryan", "Dobush", 68.7, 170.0),
                new User(6, 18, "Ostap", "Svidruk", 72.3, 168.0),
                new User(7, 19, "Oleksandr", "Voroncov", 75.0, 185.0),
                new User(8, 19, "Ivan", "Borcix", 63.0, 155.0),
                new User(9, 21, "Oleksandr", "Studennyi", 90.5, 190.0),
                new User(10, 21, "Uyra", "Vaskovski", 58.0, 162.0)
        };
        // Обчислення загального віку, ваги та зросту всіх користувачів
        int totalAge = 0;
        double totalWeight = 0.0, totalHeight = 0.0;
        for (User user : a) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }
        // Виведення загального віку, ваги та зросту
        System.out.print("Сумарний вік: " + totalAge + " р.\n");
        System.out.print("Сумарна вага: " + totalWeight + " кг.\n");
        System.out.print("Сумарний зріст: " + totalHeight + " см.\n");
        // Створення об'єкту Scanner для отримання введення користувача з консолі
        Scanner scanner = new Scanner(System.in);
        // Запит номера користувача для виведення ім'я та прізвища
        System.out.println("Введіть номер особи (від 1 до " + a.length + "), щоб вивести ім'я та прізвище:");
        int index = scanner.nextInt();
        if (index >= 1 && index <= a.length) {
            User selectedUser = a[index - 1];
            System.out.println("Ім'я: " + selectedUser.name);
            System.out.println("Прізвище: " + selectedUser.surname);
        } else {
            System.out.println("Введено недійсний номер особи.");
        }
    }
}

class Car {
// Оголошення змінних для характеристик автомобіля
int Generation; // покоління автомобіля
int power; // потужність двигуна в кінських силах
int engine_volume; // об'єм двигуна в галонах
String name; // назва автомобіля
double mileage; // пробіг автомобіля
double car_number; // номер автомобіля
double height; // висота автомобіля

// Конструктор класу Car для ініціалізації змінних об'єкта
 Car(int Generation, int power, int engine_volume, String name, double mileage, double car_number, double height) {
    this.Generation = Generation;
    this.power = power;
    this.engine_volume = engine_volume;
    this.name = name;
    this.mileage = mileage;
    this.car_number = car_number;
    this.height = height;
}
// Основний метод програми
public static void main(String[] args) {
    // Масив об'єктів класу Car, що містить дані про різні автомобілі
    Car[] a = {
            new Car(1, 200, 2000, "Toyota Camry", 50000, 123456, 1.5),
            new Car(2, 180, 1800, "Honda Civic", 60000, 654321, 1.4),
            new Car(1, 220, 2500, "Nissan Altima", 45000, 987654, 1.6),
            new Car(3, 250, 3000, "Ford Mustang", 30000, 246810, 1.3),
            new Car(2, 190, 2200, "Chevrolet Cruze", 55000, 135792, 1.7),
            new Car(1, 210, 2400, "Hyundai Sonata", 48000, 112233, 1.6),
            new Car(3, 260, 2800, "BMW 3 Series", 35000, 975310, 1.4),
            new Car(2, 200, 2100, "Kia Optima", 52000, 468135, 1.5),
            new Car(1, 230, 2300, "Volkswagen Passat", 47000, 246802, 1.6),
            new Car(3, 270, 3200, "Mercedes-Benz C-Class", 32000, 802467, 1.3)
    };
    // Обчислення загальної потужності двигуна та об'єму двигуна всіх автомобілів
    int totalEngine_volume = 0;
    double totalPower = 0.0;
    for (Car car : a) {
        totalEngine_volume += car.engine_volume;
        totalPower += car.power;
    }
    // Виведення загальної потужності двигуна та об'єму двигуна
    System.out.print("\n Сумарна кількість кінських сил: " + totalPower );
    System.out.println(" Миль на годину. \n");
    System.out.print("Сумарна кількість об'єму двигуна: " + totalEngine_volume);
    System.out.println(" Галонів");
}}

class Exercise_5 {
    // Основний метод програми
    public static void main(String[] args) {
        // Задане число для реверсу
        int number = 318;
        System.out.println("Задане число: " + number);
        // Виконання реверсу числа
        // Отримання останньої цифри залишком від ділення на 10
        int a = number % 10;
        number /= 10;
        // Отримання другої цифри залишком від ділення на 10
        int b = number % 10;
        number /= 10;
        // Отримання першої цифри, оскільки вона стала останньою при реверсі
        int firstDigit = number;
        // Формування реверсованого числа
        int c = a * 100 + b * 10 + firstDigit;
        // Виведення реверсованого числа
        System.out.println("Реверснуте число: " + c);
    }
}