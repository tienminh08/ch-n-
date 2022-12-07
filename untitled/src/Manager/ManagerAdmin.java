package Manager;

import Main.MainAdmin;
import Model.Admin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManagerAdmin {
    static Scanner scanner= new Scanner(System.in);
    static List<Admin> SaveAdmin= new ArrayList<>();
    static MainAdmin mainAdmin9= new MainAdmin();

    public  void CreateAdmin(){
        Admin admin= new Admin("admin","admin");
        SaveAdmin.add(admin);

    }
    public boolean checklogin(  String Account,String pass){
        for (int i = 0; i < SaveAdmin.size(); i++) {
            if (Account.equals(SaveAdmin.get(i).getAccount())&&pass.equals(SaveAdmin.get(i).getPass())){
                return true;
            }

        }
        return false;
    }
    public void loginAdmin(){
        System.out.println(" Nhap ten tai khoan");
        String Account= scanner.nextLine();
        System.out.println("nhap mat khau");
        String pass= scanner.nextLine();
        if (!checklogin(Account,pass)){
            System.out.println("dang nhap that bai");
        }else {
            System.out.println("dang nhap thanh cong");
            mainAdmin9.mainAdmin();

        }
    }






}
