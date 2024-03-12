package OOP.interface1;


//interface chi chua cac phuong thuc truu tuong
abstract interface polygon {
   abstract public void getArea1(int length, int breadth); 
}


//Trong Java, interface cung cấp những chi tiết kỹ thuật mà lớp phải tuân theo
//tinh truu tuong cho phép ta quản lý độ phức tạp của chương trình bằng cách ẩn các chi tiết không cần thiết và chỉ hiển thị thông tin cần thiết.
//co nhieu loai khac nhau nhung chung mot nguyen ly
/*
vi du 
interface MotorBike {
   abstract void brake();
}

class SportsBike implements MotorBike {

   // implement the abstract method
   public void brake() {
       System.out.println("Working of brake on Sports Bikes");
       System.out.println("Stopping Sports Bikes");
   }
}

class MountainBike implements MotorBike {

   // implement the abstract method
   public void brake() {
       System.out.println("Working of brake on Mountain Bikes");
       System.out.println("Stopping Mountain Bikes");
   }
}

class Main {
   public static void main(String[] args) {
       
       // access brake of SportsBike
       SportsBike s1 = new SportsBike();
       s1.brake();

       // access brake of MountainBike
       MountainBike m1 = new MountainBike();
       m1.brake();
   }
}

Bởi vì mỗi chiếc xe máy có hệ thống phanh khác nhau, vì vậy tất cả các lớp con sẽ có cách triển khai brake() khác nhau.

Tuy nhiên, nguyên lý hoạt động của các phanh là như nhau (để dừng xe máy).

*/



