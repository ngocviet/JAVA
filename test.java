/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

public class test {

    public static void main(String args[]) {
        String str = "this is Java";
        System.out.println(str.substring(0, str.length()-2));
        System.out.println(str.substring(4));
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
