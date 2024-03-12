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

        
    }
}