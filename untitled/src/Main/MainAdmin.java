package Main;

import Manager.ManagerEMployee;
import Manager.ManagerShift;

import java.util.Scanner;

public class MainAdmin {
    static Scanner scanner= new Scanner(System.in);
    static ManagerEMployee managerEMployee1= new ManagerEMployee();
    static ManagerShift managerShift= new ManagerShift();

    public  void mainAdmin(){
       while (true){
           System.out.println("1.Them nhan vien");
           System.out.println("2.Sua nhan vien");
           System.out.println("3.Xoa nhan vien");
           System.out.println("4.Hien thi nhan vien");
           System.out.println("5.Them ca lam viec");
           System.out.println("6.Sua ca lam viec");
           System.out.println("7.Xoa ca lam viec");
           System.out.println("8.Dang xuat");
           int choice= Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   managerEMployee1.CreateEmployee();
                   break;
               case 2:
                   managerEMployee1.editEmployye();
                   break;
               case 3:
                   managerEMployee1.deleteEmployye();
                   break;
               case 4:
                   managerEMployee1.show();
                   break;
               case 5:
                   managerShift.craterShift();
                   break;
               case 6:
                   managerShift.editShift();
                   break;
               case 7:
                   managerShift.delete();
                   break;
               case 8:
                   return;

           }
       }
    }
}
