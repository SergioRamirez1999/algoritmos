package com.sergio.algoritmos;

public class Bank {
   private double importe;
   private double[] sistema;
   private int[] vuelto;

   public Bank(double importe, double[] sistema) {
      this.importe = importe;
      this.sistema = sistema;
      this.vuelto = new int[sistema.length];
   }

   public int[] calcularVuelto() {
      for (int i = 0; i < sistema.length; i++) {
         vuelto[i] = retirarDinero(sistema[i]);
      }
      return vuelto;
   }

   private int retirarDinero(double cantidad) {
      int contador = 0;
      while (this.importe >= cantidad) {
         this.importe -= cantidad;
         contador++;
      }
      return contador;
   }

   public static void main(String[] args) {
      double[] sistema = { 500, 100, 50, 20, 10, 5, 1, 0.50, 0.25 };
      Bank banco = new Bank(1250.25, sistema);
      int[] vuelto = banco.calcularVuelto();
      for (int temp : vuelto)
         System.out.println(temp);
   }

}
