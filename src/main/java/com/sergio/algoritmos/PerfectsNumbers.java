package com.sergio.algoritmos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PerfectsNumbers {

   public static void main(String[] args) {
      manager();
   }

   private static boolean isPerfect(int n) {
      boolean flag = false;
      if (n > 0) {
         int re = 0;
         for (int i = 1; i < n; i++) {
            if ((n % i) == 0) {
               re = re + i;
            }
         }
         if (n == re) {
            flag = true;
         }
      } else {
         System.out.println("The range must be greater than zero");
      }
      return flag;
   }

   private static List<Integer> perfectList(int n) {
      List<Integer> list = new ArrayList<>();
      if (n > 0) {
         int rango = n;
         for (int i = 1; i < rango; i++) {
            int re = 0;
            for (int h = 1; h < i; h++) {
               if ((i % h) == 0) {
                  re = re + h;
               }
            }
            if (re == i) {
               list.add(i);
            }
         }
      } else {
         System.out.println("The range must be greater than zero");
      }
      return list;
   }

   private static void manager() {
      Scanner scanner = new Scanner(System.in);
      int selected = 0;
      try {
         while (selected > 2 || selected < 1) {
            System.out.println("1- Verify if a number is perfect");
            System.out.println("2- Generate all perfect numbers in a range");
            selected = scanner.nextInt();
         }
         switch (selected) {
         case 1:
            System.out.println("Please enter a number...");
            int number = scanner.nextInt();
            System.out.println(isPerfect(number) ? number + " is a perfect number" : number + " is not perfect number");
            break;
         case 2:
            System.out.println("Please enter a range...");
            number = scanner.nextInt();
            System.out.println("Perfect numbers in the range 1-" + number + ":");
            perfectList(number).forEach(x -> System.out.println("..." + x));
            break;
         }

      } catch (InputMismatchException e) {
         System.out.println("Illegal Type. You must enter a number...");
         manager();
      } finally {
         scanner.close();
      }
   }

}
