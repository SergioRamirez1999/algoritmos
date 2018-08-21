package com.sergio.algoritmos;

public class Palindrome {

   public static void main(String[] args) {
      
      System.out.println(isPalindromeQuick("Anna"));
      System.out.println(isPalindrome_1("reconocer"));
   }
   
   private static boolean isPalindromeQuick(String word) {
      boolean flag = false;
      String cadena = word.toLowerCase();
      if(cadena.equals(new StringBuilder(cadena).reverse().toString()))
         flag = true;
      
      return flag;
   }

   private static boolean isPalindrome_1(String word){
       boolean flag = true;
       if(word.length() > 0){
           word = word.toLowerCase();
           char[] vector_word = new char[word.length()];
           char[] reverse_word = new char[word.length()];
           int aux = vector_word.length - 1;
           for(int i = 0; i < vector_word.length; i++){
               vector_word[i] = word.charAt(i);
               reverse_word[i] = word.charAt(aux);
               aux--;
           }
           boolean control = false;
           int i = 0;
           while(!control && i < vector_word.length){
               if(vector_word[i] != reverse_word[i])
                   control = true;
               i++;
           }
           if(control)
               flag = false;
       } else {
           flag = false;
       }

       return flag;
   }


}
