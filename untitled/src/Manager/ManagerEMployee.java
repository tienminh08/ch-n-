package Manager;

import Main.MainEmployee;
import Model.Employee;
import Model.Shift;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManagerEMployee {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> SaveEmployee = new ArrayList<>();
    static int IDEmployee = -1;
    static MainEmployee mainEmployee9= new MainEmployee();

    public void CreateEmployee() {
        System.out.println("Nhap ten dang nhap");
        String Account = scanner.nextLine();
        System.out.println("Nhap mat khau ");
        String pass = scanner.nextLine();
        System.out.println("Nhap ten nhan vien");
        String Name = scanner.nextLine();
        System.out.println("Nhap tuoi nhan vien");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh nhan vien");
        String Gender = scanner.nextLine();
        System.out.println("Nhap Ma nhan vien ");
        String IDEMployee = scanner.nextLine();
        ArrayList<Shift> saveShift = new ArrayList<>();
        Employee employee = new Employee(Account, pass, Name, age, Gender, IDEMployee, saveShift);
        SaveEmployee.add(employee);
    }

    public boolean checkAccount(String Account) {
        for (int i = 0; i < SaveEmployee.size(); i++) {
            if (Account.equals(SaveEmployee.get(i).getAccount())) {
                IDEmployee = i;
                return true;
            }

        }
        return false;
    }

    public boolean checkPass(String pass) {
        for (int i = 0; i < SaveEmployee.size(); i++) {
            if (pass.equals(SaveEmployee.get(i).getPass())) {

                return true;
            }

        }
        return false;
    }

    public int checkAccount1(String Account) {
        for (int i = 0; i < SaveEmployee.size(); i++) {
            if (Account.equals(SaveEmployee.get(i).getAccount())) {
               return i;
            }

        }
        return -1;
    }
    public void looginEmployye() {
        System.out.println("nhap ten tai khoan");
        String Account= scanner.nextLine();
        if (checkAccount(Account)){
            System.out.println("nhap mat khau");
            String pass= scanner.nextLine();
            if (checkPass(pass)){
                System.out.println("Dang nhap thanh cong");
                mainEmployee9.mainEmployye();
            }else {
                System.out.println("dang nhap that bai");
            }

        }else {
            System.out.println("tai khoan khong ton tai");
        }
    }


    public void deleteEmployye(){
        System.out.println("nhap ten tai khoan muon xoa");
        String Account= scanner.nextLine();
        if (checkAccount1(Account)==-1){
            System.out.println("tai khoan khong ton tai");
        }else {
            int index= checkAccount1(Account);
            SaveEmployee.remove(index);
            System.out.println("thanh cong");
        }
    }
    public void editEmployye(){
        System.out.println("nhap ten tai khoan muon thay doi");
        String Account= scanner.nextLine();
        if (checkAccount1(Account)==-1){
            System.out.println("tai khoan khong ton tai");
        }else {
            int index= checkAccount1(Account);
            System.out.println("ban muon sua gi?");
            System.out.println("1.sua ten");
            System.out.println("2.sua tuoi");
            System.out.println("3.sua gioi tinh");
            System.out.println("4.sua ma nhan vien");
            System.out.println("5.thoat");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap ten moi muon thay doi");
                    String name= scanner.nextLine();
                    SaveEmployee.get(index).setName(name);
                    System.out.println("thanh cong");
                    break;
                case 2:
                    System.out.println("nhap tuoi muon thay doi");
                    int age= Integer.parseInt(scanner.nextLine());
                    SaveEmployee.get(index).setAge(age);
                    System.out.println("thanh cong");
                    break;
                case 3:
                    System.out.println("nhap gioi tinh muon thay doi");
                    String gender= scanner.nextLine();
                    SaveEmployee.get(index).setGender(gender);
                    System.out.println("thanh cong");
                    break;
                case 4:
                    System.out.println("nhap ma nhan vien muon thay doi");
                    String ID= scanner.nextLine();
                    SaveEmployee.get(index).setIDEmployee(ID);
                    System.out.println("thanh cong");

                    break;
                case 5:
                    return;
            }
        }

    }
    public void show(){
        for (int i = 0; i < SaveEmployee.size(); i++) {
            System.out.println(SaveEmployee.get(i).toString());

        }
    }
    public void fixpass(){
        System.out.println("nhap tai khoan muon doi mat khau");
        String Account= scanner.nextLine();
        if (checkAccount1(Account)==-1){
            System.out.println("tai khoan khong dung");
        }else {
            int index=checkAccount1(Account);
            System.out.println("nhap mat khau cu");
            String pass= scanner.nextLine();
            if (!checkPass(pass)){
                System.out.println("mat khau cu khong dung");
            }else {
                System.out.println("nhap mat khau moi");
                String newpass= scanner.nextLine();
                SaveEmployee.get(index).setPass(newpass);
                System.out.println("thanh cong");
            }
        }
    }



}
