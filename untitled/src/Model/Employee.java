package Model;

import java.util.List;

public class Employee extends Admin {
    private String name;
    private int age;
    private String gender;
    private  String IDEmployee;
    public List<Shift> SaveShift;

    public Employee(String account, String pass, String name, int age, String gender, String IDEmployee, List<Shift> saveShift) {
        super(account, pass);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.IDEmployee = IDEmployee;
        SaveShift = saveShift;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIDEmployee() {
        return IDEmployee;
    }

    public void setIDEmployee(String IDEmployee) {
        this.IDEmployee = IDEmployee;
    }

    public List<Shift> getSaveShift() {
        return SaveShift;
    }

    public void setSaveShift(List<Shift> saveShift) {
        SaveShift = saveShift;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", IDEmployee='" + IDEmployee + '\'' +
                ", SaveShift=" + SaveShift +
                '}';
    }
}
