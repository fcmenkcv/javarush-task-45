package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/*
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int min = 2147483647;

        while (console.hasNextInt()) {
            int num = console.nextInt();
            if (num <= min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}

