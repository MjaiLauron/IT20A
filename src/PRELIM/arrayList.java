/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class arrayList {
    public static void main (String[] args) {       
        ArrayList<String> names = new ArrayList<>();
        
        names.add("MJ");
        names.add("Caleb");
        names.add("Aki");
        names.add("Rhedang");
        names.addLast("Jam");
        names.addFirst("Monmon");
        
       // System.out.println(names.getFirst());
       
       for (int i = 4; i < names.size(); i++) {
           System.out.println(names.get(i) + " ");
       }
    }
}
