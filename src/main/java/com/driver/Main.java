package com.driver;


class Product{
   public int product(int x, int y) {
     return 2;
   }
  public int product(int x, int y, int z) {
    return 3;
  }
  public double product(double x, double y) {
    return 4.56;
  }
  
}

public class Main {
     public static void main(String[] args){
      Product p=new Product();
      p.product(2,3);
      p.product(2,3,4);
      p.product(2.35,4.56);
     }
}
