package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Width: ");
        double width = scanner.nextDouble();

        System.out.println("Height: ");
        double height = scanner.nextDouble();

        System.out.println("Alan: " + area(width, height));

        System.out.println("Yarıçap: ");
        double radius = scanner.nextDouble();
        System.out.println("Çemberin Alanı: " + area(radius));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock >= 20 || clock < 8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int lowestTemp = 25;
        int highestTemp = isSummer ? 45 : 36;
        return temp < highestTemp && temp > lowestTemp;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            System.out.println("Yükseklik ve genişlik 0'dan küçük olamaz. Genişlik: " + width + "Yükseklik: " + height);
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Yarıçap 0'dan küçük olamaz. Yarıçap: " + radius);
            return -1;
        }
        return Math.PI * radius * radius;

    }
}
