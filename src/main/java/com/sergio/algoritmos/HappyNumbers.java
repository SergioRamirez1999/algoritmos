package com.sergio.algoritmos;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {

   public static boolean isHappy(Long num) {
      List<Long> repetidos = new ArrayList<>();
      boolean flag = false;
      String numero = String.valueOf(num);
      Long suma = 0L;
      boolean repetido = false;
      while (!flag && !repetido) {
         for (int i = 0; i < numero.length(); i++) {
            suma += (int) (Math.pow(Double.parseDouble(String.valueOf(numero.charAt(i))), 2));
         }
         for (Long temp : repetidos) {
            if (temp == suma) {
               repetido = true;
            }
         }
         if (repetido == false)
            repetidos.add(suma);
         if (suma == 1)
            flag = true;
         numero = String.valueOf(suma);
         suma = 0L;
      }
      return flag;
   }

   public static List<Long> isHappyRange(Long range) {
      List<Long> felices = new ArrayList<>();
      for (Long i = 1L; i <= range; i++) {
         if (isHappy(i))
            felices.add(i);
      }
      return felices;
   }

   public static void main(String[] args) {
      isHappyRange(100L).forEach(x -> System.out.print(x + " "));
   }

}
