package com.sergio.algoritmos;

public class Anagram {

   public static void main(String[] args) {

      System.out.println(isAnagram("buenos aires", "urbe asesino"));
      System.out.println(isAnagramQuick("buenos aires", "urbe asesino"));
   }

   private static boolean isAnagram(String str1, String str2) {
      boolean flag = false;
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();

      if (str1.length() == str2.length()) {

         char[] vCadena_1 = new char[str1.length()];
         char[] vCadena_2 = new char[str2.length()];

         for (int i = 0; i < str1.length(); i++) {
            vCadena_1[i] = str1.charAt(i);
         }

         for (int i = 0; i < str2.length(); i++) {
            vCadena_2[i] = str2.charAt(i);
         }

         char aux;

         for (int i = 0; i < vCadena_1.length - 1; i++) {
            for (int h = 1; h < vCadena_1.length; h++) {
               if (vCadena_1[h - 1] > vCadena_1[h]) {
                  aux = vCadena_1[h - 1];
                  vCadena_1[h - 1] = vCadena_1[h];
                  vCadena_1[h] = aux;
               }
               
               if (vCadena_2[h - 1] > vCadena_2[h]) {
                  aux = vCadena_2[h - 1];
                  vCadena_2[h - 1] = vCadena_2[h];
                  vCadena_2[h] = aux;
               }
            }
         }
         String cadena_1 = String.valueOf(vCadena_1);
         String cadena_2 = String.valueOf(vCadena_2);
         if (cadena_1.equals(cadena_2))
            flag = true;
      }

      return flag;
   }

   private static boolean isAnagramQuick(String str1, String str2) {
      boolean flag = false;
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();

      if (str1.length() == str2.length()) {
         char[]vCadena_1 = str1.toCharArray();
         char[]vCadena_2 = str2.toCharArray();
         java.util.Arrays.sort(vCadena_1);
         java.util.Arrays.sort(vCadena_2);
         String cadena_1 = String.valueOf(vCadena_1);
         String cadena_2 = String.valueOf(vCadena_2);
         if(cadena_1.equals(cadena_2))
            flag = true;
      }
      

      return flag;
   }

}
