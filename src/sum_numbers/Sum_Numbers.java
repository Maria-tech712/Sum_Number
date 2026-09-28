/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum_numbers;


public class Sum_Numbers {
    public int sum(int a, int b)
    {
        return (a+b);
    }
    
    public double sum(double a, double b)
    {
        return (a+b);
    }
    public double sum(double a, double b,double c)
    {
        return (a+b+c);
    }
    public static void main(String[] args) {
        Sum_Numbers s = new Sum_Numbers();
        System.out.println("Sum for 3 (DECIMAL VALUES):" + s.sum(45.8,45.9,30.9));
        System.out.println("Sum for 2 (Integers Values): " + s.sum(87,67));
        System.out.println("Sum for 2 (DECIMAL VALUES): "+ s.sum(56.7, 45.8));
        System.out.println("Sum (3 Integer Values): " + s.sum(20,40,46));
    }
    
}
