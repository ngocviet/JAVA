/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1_ngan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class FirstThread extends Thread {
    public static List<String> listDaysOfWeek = new ArrayList<>();
    Random rd = new Random();

    public String runn() {
        listDaysOfWeek.add("Thu hai");
        listDaysOfWeek.add("Thu ba");
        listDaysOfWeek.add("Thu tu");
        listDaysOfWeek.add("Thu nam");
        listDaysOfWeek.add("Thu sau");
        listDaysOfWeek.add("Thu bay");
        listDaysOfWeek.add("Chu nhat");
        String day = "";
        try {
            Thread.sleep(100);
            int a = rd.nextInt(7);
            Threaddd.soRanDom = a;
            day = listDaysOfWeek.get(a);
            System.out.println("Hom nay la: " + day);
        } catch (InterruptedException ex) {
        }
        return day;
    }
}
