package Manager;

import Model.Employee;
import Model.Shift;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerShift {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Shift> SaveShift = new ArrayList<>();


    public void craterShift() {
        System.out.println("nhap ma ca lam viec");
        String ID = scanner.nextLine();
        System.out.println("nhap ngay lam viec");
        String day = scanner.nextLine();
        System.out.println("nhap ca lam viec");
        String session = scanner.nextLine();
        Shift shift = new Shift(ID, day, session);
        SaveShift.add(shift);
    }

    public int chechibyShift(String ID) {
        for (int i = 0; i < SaveShift.size(); i++) {
            if (ID.equals(SaveShift.get(i).getID())) {
                return i;

            }

        }
        return -1;
    }


    public void delete(){
        System.out.println("nhap id ca lam viec muon xoa");
        String ID = scanner.nextLine();
        if (chechibyShift(ID)==-1){
            System.out.println("ca lam viec muon xoa khong ton tai");
        }else {
            int index= chechibyShift(ID);
            SaveShift.remove(index);
            System.out.println("thanh cong");
        }

    }
    public void editShift(){
        System.out.println("nhap id ca lam viec muon sua");
        String ID = scanner.nextLine();
        if (chechibyShift(ID)==-1){
            System.out.println("ca lam viec muon sua khong ton tai");
        }else {
            int index= chechibyShift(ID);
            System.out.println("ban muon sua gi");
            System.out.println("1.sua ngay lam viec");
            System.out.println("2.sua ca lam viec");
            System.out.println("3.thoat");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap ngay lam viec muon thay doi");
                    String day= scanner.nextLine();
                    SaveShift.get(index).setDays(day);
                    System.out.println("thanh cong");
                    break;
                case 2:
                    System.out.println("nhap ca lam viec muon thay doi");
                    String session= scanner.nextLine();
                    SaveShift.get(index).setSession(session);
                    System.out.println("thanh cong");
                    break;
                case 3:
                    return;

            }
        }
    }
    public void showShift(){
        for (int i = 0; i < SaveShift.size(); i++) {
            System.out.println(SaveShift.get(i).toString());

        }
    }
    public int  check(int choice){
        for (int i = 0; i <SaveShift.size() ; i++) {
            if ((choice-1)==i){
                return i;
            }

        }
        return -1;
    }
    public  void RegisterShift(){
        showShift();
        System.out.println(" chon ca lam viec muon dang ki (nhap so)");
        int choie= Integer.parseInt(scanner.nextLine());
        if (check(choie)==-1){
            System.out.println("ca lam viec muon dang ki khong ton tai");

        }else {
            int index= check(choie);
            ManagerEMployee.SaveEmployee.get(ManagerEMployee.IDEmployee).
                    getSaveShift().add(SaveShift.get(index));
            System.out.println("dang ki ca lam viec thanh cong");
        }


    }
    public void showca(){
        for (int i = 0; i < ManagerEMployee.SaveEmployee.get
                (ManagerEMployee.IDEmployee).getSaveShift().size(); i++) {
            System.out.println(ManagerEMployee.SaveEmployee.
                    get(ManagerEMployee.IDEmployee).getSaveShift().get(i).toString());

        }
    }


}
