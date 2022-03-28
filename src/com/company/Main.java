package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int year = 2024; //переменная для передачи в метод значения "год"

        int clientOS = 0; //переменная для передачи в метод типа ОС в метод
        int clientDeviceYear = 2021; //переменная для передачи в метод года выпуска устройства

        int deliveryDistance = 95; //переменная для передачи в метод дистанции до клиента

        int timeToClient = calculateTimeToDeliver(deliveryDistance); //переменная, получающая значение "Срок доставки" из метода

        String stringToDuplicateCheck = "aa"; //переменная для передачи отсортированной строки в метод

        definitionYear(year);
        definitionDeviceApp(clientOS, clientDeviceYear);

        System.out.println("Срок доставки: " + timeToClient + " дня/ей");

        searchDuplicate(stringToDuplicateCheck);


    }

    //Задание 1
    public static void definitionYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0  && year % 400 != 0) {
                System.out.println("Год не високосный");
            } else {
                System.out.println("Год високосный");
            }
        }
        else {
            System.out.println("Год не високосный");
        }
    }

    //Задание 2
    public static void definitionDeviceApp (int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    //Задание 3
    public static int calculateTimeToDeliver (int deliveryDistance) {
        int buffer = (deliveryDistance - 20) / 40;
        int timeToClient = 0;

        if (deliveryDistance <= 20) {
            timeToClient = 1;
        } else {
            timeToClient = buffer + 2;
        }

        return timeToClient;
    }

    //Задание 4
    public static void searchDuplicate (String stringToDuplicateCheck) {

        for (int i = 0; i < stringToDuplicateCheck.length() - 1; i++) {

            char letterA = stringToDuplicateCheck.charAt(i);
            char letterB = stringToDuplicateCheck.charAt(i + 1);

            if (letterA == letterB) {
                System.out.println("Задублирован символ: " + letterB);
                return;
            }

        }
        System.out.println("Дублей нет");
    }
}
