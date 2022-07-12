public class Mane {
    public static void main(String[] args) {

        { // Задание 1
            int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Install the iOS version of the app by following the link");
            } else if (clientOS == 1) {
                System.out.println("Install the Android version of the app by following the link");
            } else if (clientOS != 0 && clientOS != 1) {
                System.out.println("Available only for iOS and Android");
            }
        }
        { // Задание 2

            int clientOS = 0;
            int clientDeviceYear = 2022;
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Install the iOS version of the app by following the link");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Install the lite version of the iOS app by following the link");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Install the Android version of the app by following the link");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Install the lite version of the Android app by following the link");
            } else if (clientOS != 0 && clientOS != 1) {
                System.out.println("Available only for iOS and Android");
            }
        }
        { // Задание 3

            int year = 2022;
            if (year %4 == 0 && year %100 != 0 || year %400 == 0) {
                System.out.println(year + " year is a leap year");
            } else {
                System.out.println(year + " year is not a leap year");
            }
        }
        { // Задание 4

            int deliveryDistance = 30;
            if (deliveryDistance < 20) {
                System.out.println("It will take days: 1");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("It will take days: 2");
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("It will take days: 3");
            } else if (deliveryDistance > 100) {
                System.out.println("Contact customer support");
            }
        }
        { // Задание 5
            int monthNumber = 13;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("The " + monthNumber + "th month belongs to the winter season");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("The " + monthNumber + "th month belongs to the spring season");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("The " + monthNumber + "th month belongs to the summer season");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("The " + monthNumber + "th month belongs to the autumn season");
                    break;
                default:
                    System.out.println("There is no such month. Enter from 1 to 12.");
            }
        }
    }
}