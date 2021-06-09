package com.tms.homework10.functional_and_lambda;

import java.util.Scanner;
/**
 * С помощью обобщенного функционального интерфейса и лямда выражений
 * в зависимости от выбранного пользователем действия
 * реверсируем строку или находим факториал числа
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 1 или 2");
        Scanner userInput = new Scanner(System.in);
        int switchNumber = userInput.nextInt();

        switch (switchNumber){
            case 1:
                System.out.println("Введите строку");
                Scanner  stringInput = new Scanner(System.in);
                String string = stringInput.nextLine();
                ReverseOrFactorial<String> reverseOrFactorial1 = (str) -> {
                    String result = "";
                    for(int i = str.length()-1; i>=0; i--) {
                        result += str.charAt(i);
                    }
                    return result;
                };
                System.out.println(reverseOrFactorial1.getResult(string));
                stringInput.close();
                break;
            case 2:
                System.out.println("Введите число");
                Scanner intInput = new Scanner(System.in);
                int number = intInput.nextInt();
                ReverseOrFactorial<Integer> reverseOrFactorial2 = (num) -> {
                    int factorial = 1;
                    while (num > 0){
                        factorial *=num;
                        num--;
                    }
                    return factorial;
                };
                System.out.println(reverseOrFactorial2.getResult(number));
                break;
            default:
                System.out.println("Введите 1 или 2!");
                break;
        }
        userInput.close();
    }
}
