package OOP.LopVaPhuongThucTruuTuong;

//sd tu khoa implements de trien khai interface

public class rectangle implements polygon{
    public void getArea1(int length, int breadth){
        int area = length*breadth;
        System.out.println("Area: " + area);
    }
}
