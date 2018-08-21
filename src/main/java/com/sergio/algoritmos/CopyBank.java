package com.sergio.algoritmos;

public class CopyBank {
   private double[] sistema;
   private double price;
   private int[] vuelto;

   
   public CopyBank(double[] sistema, double price) {
      this.sistema = sistema;
      this.price = price;
      this.vuelto = new int[sistema.length];
   }
   
   public int[] generarVuelto() {
      for(int i = 0; i < vuelto.length; i++) {
         vuelto[i] = restar(sistema[i]);
      }
      return vuelto;
   }
   
   private int restar(double cantidad) {
      int contador = 0;
      while(this.price >= cantidad) {
         this.price -= cantidad;
         contador++;
      }
      return contador;
   }

   public static void main(String[] args) {
      double[] sistema = {500,200,100,50,20,10,5,2,1,0.5};
      CopyBank bank = new CopyBank(sistema, 1555.5);
      for(int temp: bank.generarVuelto()) {
         System.out.println(temp);
      }
   }

}
