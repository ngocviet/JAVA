package De1_ngan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee implements Serializable {

    private int id;
    private String name;
    private String email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin:");
        System.out.println("------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Employee " + (i + 1) + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            Employee employee = new Employee(id, name, email);
            list.add(employee);
            System.out.println("-----------------");
        }
        // ghi du lieu
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"));
            for (Employee employee : list) {
                oos.writeObject(employee);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println("err");
        }
        // doc du lieu
        List<Employee> listt = new ArrayList<>();
        try {
            File file = new File("employee.dat");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            while (is.available() > 0) {
                Employee employee = (Employee) ois.readObject();
                listt.add(employee);
            }
            System.out.println("------------------------");
            System.out.println("Doc file");
            for (Employee employee : listt) {
                System.out.println(employee);
            }
        } catch (Exception e) {
            System.out.println("err read");
        }
    }
}
