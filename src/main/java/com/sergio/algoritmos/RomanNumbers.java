package com.sergio.algoritmos;

public class RomanNumbers {
   
   private static String[] millares = {"","M","MM","MMM"};
   private static String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
   private static String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
   private static String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
   
   public static String parseRomano(int num) {
      String cadena = null;
      if(num > 0 && num < 4000) {
         cadena = millares[num/1000]+centenas[(num/100)%10]+decenas[(num/10)%10]+unidades[num%10];
      }
      return cadena;
      
   }

   public static void main(String[] args) {
      System.out.println(parseRomano(4000));
   }

}
