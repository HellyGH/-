package org.example;

import java.util.Scanner;

public class NumberSum {

    //Рекурсивна функция, която ще връща сумата между A и B
    //Съхраняваме два параметъра а и b, за да може да подаваме произволни аргументи при
    //извикването на функцията
    static int sum(int a, int b) {
        if (b >= a) {
            return b + sum(a, b - 1);
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        //Използваме Scanner, за да въведем числата в конзолата
        var scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers A and B between 1 and 10001:");
        //Целочислени променливи, които ще съхраняват стойностите от интервала [1,1001]
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //Проверка, за правилно въведени стойности от потребителя, чрез оператора
        // ||(AND),когато използваме него е необходими всички условия да бъдат верни
        if (a < 1 || a > 10001 || b < a || b > 10001) {
            System.out.println("Not correct numbers");
            return;
        }
        //Извикваме функцията sum, чрез променливата result
        int result = sum(a, b);
        System.out.println("The result is: " + result);














        

        }
    }
