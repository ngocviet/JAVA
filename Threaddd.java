/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1_ngan;

import java.util.Hashtable;


/**
 *
 * @author DELL
 */
public class Threaddd extends Thread{
    public static Hashtable<String, String> mydictionary = new Hashtable<>();
    public static int soRanDom = 0;
    public static void main(String[] args) {
        mydictionary.put("Thu hai", "Monday");
        mydictionary.put("Thu ba", "Tuesday");
        mydictionary.put("Thu tu", "Wednesday");
        mydictionary.put("Thu nam", "Thursday");
        mydictionary.put("Thu sau", "Friday");
        mydictionary.put("Thu bay", "Saturday");
        mydictionary.put("Chu nhat", "Sunday");
        
        FirstThread thread = new FirstThread();
        String day = thread.runn();
        System.out.println(mydictionary.get(day));
    }
}
