package Main;

import Manager.ManagerAdmin;
import Manager.ManagerEMployee;

import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    static ManagerAdmin managerAdmin= new ManagerAdmin();
    static ManagerEMployee managerEMployee= new ManagerEMployee();
    public static void main(String[] args) {
        while (true){
            System.out.println("----xin chao----");
            System.out.println("1.Dang nhap");
            System.out.println("2.Dang nhap nhan vien");
            System.out.println("3.Thoat");
            int choie= Integer.parseInt(scanner.nextLine());
            switch (choie){
                case 1:
                    managerAdmin.CreateAdmin();
                    managerAdmin.loginAdmin();
                    break;
                case 2:
                    managerEMployee.looginEmployye();
                    break;
                case 3:
                    return;
            }
        }
    }
}
