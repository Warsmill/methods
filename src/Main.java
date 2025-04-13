import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int year = 2024;

        Random random = new Random();
        int clientOS = random.nextInt(2);
        int phoneReleaseDate = random.nextInt(2008, LocalDate.now().getYear());

        int distanceClient = 95;
        int numberDays = 0;

        checkLeapYearOrNot(year);
        checksClientOperatingSystem(phoneReleaseDate, clientOS);
        calculatesNumberDaysDeliveryCustomer(distanceClient, numberDays);
    }

    public static void checkLeapYearOrNot(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0))) {
            System.out.println(year + ". год является високосным");
        } else {
            System.out.println(year + ". год не является високосным");
        }
    }

    public static void checksClientOperatingSystem(int phoneReleaseDate, int clientOS) {
        if (clientOS == 0 && phoneReleaseDate < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && phoneReleaseDate > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && phoneReleaseDate < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && phoneReleaseDate > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void calculatesNumberDaysDeliveryCustomer(int distanceClient, int numberDays) {
        if (distanceClient < 100) {
            if (distanceClient < 20) {
                numberDays += 1;
                System.out.println("Потребуется дней: " + numberDays);
            } else if (distanceClient >= 20 && distanceClient < 60) {
                numberDays += 2;
                System.out.println("Потребуется дней: " + numberDays);
            } else if (distanceClient >= 60 && distanceClient < 100) {
                numberDays += 3;
                System.out.println("Потребуется дней: " + numberDays);
            }
        } else {
            System.out.println("Доставки нет");
        }
    }
}