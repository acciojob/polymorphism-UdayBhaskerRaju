package com.driver;

public class Main {
    Product p = new Product();
    int ans = p.product(2,3);
    int ans1 = p.product(2,3,4);
    double ans2 = p.product(2.0,3.0);
    public static class Product{
         public int product(int x, int y) {
             return x+y;
         }
        public int product(int x, int y, int z) {
             return x*y*z;
        }
        public double product(double x, double y) {
             return x/y;
        }
    }
}