public class Main {

    // Метод для виведення квадрата числа
    public static void printSquare(int number) {
        System.out.println("Квадрат числа: " + (number * number));
    }

    // Метод для обчислення об'єму циліндра
    public static double calculateCylinderVolume(double radius, double height) {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }

    // Метод для обчислення суми елементів масиву
    public static int calculateArraySum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Метод для перевертання рядка
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    // Метод для обчислення a^b (a підняте до степеня b)
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // Метод для виведення рядка text n разів
    public static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        // Приклад використання методів
        printSquare(5); // Виведе квадрат числа 5

        double volume = calculateCylinderVolume(3, 7);
        System.out.println("Об'єм циліндра: " + volume); // Виведе об'єм циліндра

        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateArraySum(array);
        System.out.println("Сума елементів масиву: " + sum); // Виведе суму елементів масиву

        String reversedText = reverseString("Програмування");
        System.out.println("Перевернутий рядок: " + reversedText); // Виведе перевернутий рядок

        int result = power(2, 3);
        System.out.println("2^3 = " + result); // Виведе результат піднесення 2 до степеня 3

        printTextMultipleTimes(3, "Hello World!"); // Виведе рядок 3 рази
    }
}

