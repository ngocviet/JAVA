/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author DELL
 */
public class GetFileInfo {

    static List<Girl> listGirl = new ArrayList<>();

    public static void main(String[] args) {
//        createFile();
//        writeFile();
//        readFile();
        writeObject();
        readObject();
    }

    static void createFile() {
        File file = new File("D:\\viet.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
        }
    }

    static void getInfo() {
        File file = new File("D:\\viet.txt");
        if (file.exists()) {

        }
    }

    static void writeFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        PrintWriter pw;
        try {
            pw = new PrintWriter("D:\\viet.txt");
            pw.print(name);
            pw.flush();
            pw.close();
            System.out.println("Da ghi thanh cong!");
        } catch (Exception e) {
        }
    }

    static void readFile() {
        File file = new File("D:\\viet.txt");
        // cach 1
        System.out.println("Cach 1");
        try {
            List<String> allText = Files.readAllLines(file.toPath());
            for (String string : allText) {
                System.out.println(string);
            }
        } catch (Exception e) {
        }

        // cach 2
        System.out.println("Cach 2");
        try {
            BufferedReader br = Files.newBufferedReader(file.toPath());
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
        }

        // cach 3
        System.out.println("Cach 3:");
        try {
            BufferedInputStream ous = new BufferedInputStream(new FileInputStream(file));
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Stream<String> lines = br.lines();
            lines.forEach((line) -> {
                System.out.println("-- line: " + line);
            });
        } catch (Exception e) {
        }
    }

    static void writeObject() {
        Scanner sc = new Scanner(System.in);
        try {
            File file = new File("D:\\vietOb.txt");
            file.createNewFile();
            System.out.println("So luong: ");
            int sl = sc.nextInt();
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (int i = 0; i < sl; i++) {
                Girl girl = new Girl();
                girl.input();
                oos.writeObject(girl);
            }
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            System.out.println("hi");
        }
    }

    static void readObject() {
        List<Girl> listGirl = new ArrayList<>();
        try {
            File file = new File("D:\\vietOb.txt");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            while (is.available() > 0) {
                Girl girl = (Girl) ois.readObject();
                listGirl.add(girl);
            }
            for (Girl girl : listGirl) {
                System.out.println(girl);
            }
            ois.close();
        } catch (Exception e) {
            System.out.println("tien");
        }
    }
}
