import java.util.Scanner;

import OOP.LopVaPhuongThucTruuTuong.*;

class Main{
    public static void main(String[] args){


        // create object of the child class
        Rectangle rectangle1 = new Rectangle();
        
        // access the non-abstract method
        rectangle1.printSides();
        
        // access the implemented abstract method
        rectangle1.getArea();


        //abstract
        Dog d1 = new Dog();
        d1.makeSound();

        //interface
        rectangle rec1 = new rectangle();
        System.out.println("enter length and breadth: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();
        rec1.getArea1(length, breadth);
        
    }
}