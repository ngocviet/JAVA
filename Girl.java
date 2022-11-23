/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Girl implements Serializable{
    private String name;
    private int poin;

    public Girl(String name, int poin) {
        this.name = name;
        this.poin = poin;
    }
    
    public Girl() {
    }

    public String getName() {
        return name;
    }

    public int getPoin() {
        return poin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }

    @Override
    public String toString() {
        return "Girl{" + "name=" + name + ", poin=" + poin + '}';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Poin: ");
        this.poin = sc.nextInt();
    }
}
