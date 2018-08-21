package com.sergio.algoritmos;

public class CopyAnagram {
   
   public static boolean isAnagram_1(String word_1, String word_2) {
      boolean flag = false;
      
      if(word_1.length() == word_2.length()) {
         char[] vector_1 = word_1.toCharArray();
         char[] vector_2 = word_2.toCharArray();
         java.util.Arrays.sort(vector_1);
         java.util.Arrays.sort(vector_2);
         String cadena_1 = String.valueOf(vector_1);
         String cadena_2 = String.valueOf(vector_2);
         if(cadena_1.equalsIgnoreCase(cadena_2))
            flag = true;
      }
      
      return flag;
   }
   
   public static boolean isAnagram_2(String word_1, String word_2) {
      boolean flag = true;
      if(word_1.length() == word_2.length()) {
         int i = 0;
         boolean corte = false;
         while(!corte && i < word_1.length()) {
            if(word_1.indexOf(String.valueOf(word_2.charAt(i))) == -1) {
               corte = true;
            }
            i++;
         }
         if(corte)
            flag = false;
      }else {
         flag = false;
      }
      return flag;
   }
   
   public static boolean isAnagram_3(String word_1, String word_2) {
      boolean flag = true;
      if(word_1.length() == word_2.length()) {
         char[] vector_1 = new char[word_1.length()];
         char[] vector_2 = new char[word_2.length()];
         
         char aux;
         int limite = vector_1.length;
         for(int i = 0; i < vector_1.length-1; i++) {
            for(int h = 1; h < limite; h++) {
               if(vector_1[h-1] > vector_1[h]) {
                  aux = vector_1[h-1];
                  vector_1[h-1] = vector_1[h];
                  vector_1[h] = aux;
               }
               
               if(vector_2[h-1] > vector_2[h]) {
                  aux = vector_2[h-1];
                  vector_2[h-1] = vector_2[h];
                  vector_2[h] = aux;
               }
            }
            limite--;
         }
         
         for(int i = 0; i < vector_1.length; i++) {
            if(vector_1[i] != vector_2[i])
               flag = false;
         }
      } else {
         flag = false;
      }
      return flag;
   }

   public static void main(String[] args) {
      System.out.println(isAnagram_1("amors", "moras"));
      System.out.println(isAnagram_2("amors", "moras"));
      System.out.println(isAnagram_3("amors", "moras"));
   }

}
