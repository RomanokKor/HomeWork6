package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите какую величину переводить:");
        System.out.println("Масса - 1");
        System.out.println("Расстояние - 2");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Выберите единицу измерения:");
                System.out.println("1 - килограмм:");
                System.out.println("2 - центнер:");
                System.out.println("3 - унция:");
                System.out.println("4 - стоун:");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Введите число выбранных единиц");
                        double a = scanner.nextDouble();
                        System.out.println("кг: " + a);
                        System.out.println("цт: " + a / 100);
                        System.out.println("унц: " + a * 35.27);
                        System.out.println("ст: " + a * 0.15);
                        break;

                    case 2:
                        System.out.println("Введите число выбранных единиц");
                        double b = scanner.nextDouble();
                        System.out.println("кг: " + b * 100);
                        System.out.println("цт: " + b);
                        System.out.println("унц: " + b * 3527);
                        System.out.println("ст: " + b * 15);
                        break;

                    case 3:
                        System.out.println("Введите число выбранных единиц");
                        double c = scanner.nextDouble();
                        System.out.println("кг: " + c * 0.028);
                        System.out.println("цт: " + c * 2.8);
                        System.out.println("унц: " + c);
                        System.out.println("ст: " + c * 0.0045);
                        break;

                    case 4:
                        System.out.println("Введите число выбранных единиц");
                        double d = scanner.nextDouble();
                        System.out.println("кг: " + d * 0.028);
                        System.out.println("цт: " + d * 2.8);
                        System.out.println("унц: " + d * 224);
                        System.out.println("ст: " + d);
                        break;
                }
                break;
        }

            switch (scanner.nextInt()) {
                case 2:
                    System.out.println("Выберите единицу измерения:");
                    System.out.println("1 - метр:");
                    System.out.println("2 - миля:");
                    System.out.println("3 - километр:");
                    System.out.println("4 - дюйм:");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("Введите число выбранных единиц");
                            double a = scanner.nextDouble();
                            System.out.println("метр: " + a);
                            System.out.println("миля: " + a * 0.00062);
                            System.out.println("километр: " + a * 0.001);
                            System.out.println("дюйм: " + a * 39.37);
                            break;

                        case 2:
                            System.out.println("Введите число выбранных единиц");
                            double b = scanner.nextDouble();
                            System.out.println("метр: " + b * 1609.34);
                            System.out.println("миля: " + b);
                            System.out.println("километр: " + b * 1.61);
                            System.out.println("дюйм: " + b * 63360);
                            break;

                        case 3:
                            System.out.println("Введите число выбранных единиц");
                            double c = scanner.nextDouble();
                            System.out.println("метр: " + c * 1000);
                            System.out.println("миля: " + c * 1.62);
                            System.out.println("километр: " + c);
                            System.out.println("дюйм: " + c * 39370.1);
                            break;

                        case 4:
                            System.out.println("Введите число выбранных единиц");
                            double d = scanner.nextDouble();
                            System.out.println("метр: " + d * 0.0254);
                            System.out.println("миля: " + d * 0.000016);
                            System.out.println("километр: " + d * 0.000025);
                            System.out.println("дюйм: " + d);
                            break;
                    }
                    break;
            }

        }
}