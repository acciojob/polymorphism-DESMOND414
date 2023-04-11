package com.driver;




public class Main {
  static class Product{
   public int product(int x, int y) {
    return 1;
   }
   
  public int product(int x, int y, int z) {
    return 2;
  }
   
  public double product(double x, double y) {
   return 3;
  }
  
}
     public static void main(String[] args){
      Product p=new Product();
      p.product(2,3);
      p.product(2,3,4);
      p.product(2.35,4.56);
     }
}
