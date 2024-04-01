import java.util.Scanner;

import OOP.LopVaPhuongThucTruuTuong.*;
import OOP.interface1.*;

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
        
        //khi qua so phan tu trong mang

        int[] arr = new int[3];
        // Scanner input = new Scanner(System.in);
        // for(int i = 0; i <= arr.length; i++){
        //     arr[i] = input.nextInt();
        // }
        //input.close();

    //try...catch: 
    //chi sd try...catch khi ngoai vung kiem soat duoc
    //finally: giai phong tai nguyen-dong ket noi

        try{
            for(int i = 0; i<= arr.length; i++){
                System.out.printf("nhap phan tu arr[%d] = ", i);
                arr[i] = input.nextInt();
                }
            } catch(Exception e){
                //goi vao khi chuong trinh gap exception
                e.printStackTrace();

            // }catch(ArrayIndexOutOfBoundsException e){
            //     //bo qua loi tran phan tu mang
            //     e.printStackTrace();
            // }catch(ArithmeticException e){
            //     //bo qua loi chia cho 0
            //     e.printStackTrace();
            // }

            } finally{
                //duoc goi khi chuong trinh k co error hoac error
                System.out.println("finish 1");
            }
            try {
                int z = 5/0;
                for(int i = 0; i<= arr.length; i++){
                System.out.println(arr[i]);
            }   
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());;
            } finally{
                System.out.println("finish 1");
            }

    }
}