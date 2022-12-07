package Main;

import Manager.ManagerEMployee;
import Manager.ManagerShift;

import java.util.Scanner;

public class MainEmployee {
    static Scanner scanner= new Scanner(System.in);
    static ManagerEMployee managerEMployee3= new ManagerEMployee();
    static ManagerShift managerShift3= new ManagerShift();
   public void mainEmployye(){
      while (true){
          System.out.println("1.Doi mat khau");
          System.out.println("2.Dang ki ca lam viec");
          System.out.println("3. ca lam viec cua toi");
          System.out.println("4. dang xuat");
          int choice= Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1:
                  managerEMployee3.fixpass();
                  break;
              case 2:
                  managerShift3.RegisterShift();
                  break;
              case 3:
                  managerShift3.showca();
                  break;
              case 4:
                  break;
          }
      }
   }



}
