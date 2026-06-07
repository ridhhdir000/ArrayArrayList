/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;
import java.util.ArrayList;

public class LatihanMandiriArrayList {
       public static void main(String[] args) {

            ArrayList<String>daftar_belanja = new ArrayList<>();
            daftar_belanja.add("Telur");
            daftar_belanja.add("Ikan");
            daftar_belanja.add("Ayam");
            daftar_belanja.add("Nasi");
            
            System.out.println("Isi list : " + daftar_belanja);
            daftar_belanja.remove("Ikan");
            System.out.println("Isi list : " + daftar_belanja);
            System.out.println();
            
            ArrayList<Integer> angka = new ArrayList<>();
            angka.add(80);
            angka.add(75);
            angka.add(90);
            angka.add(85);
            angka.add(70);
            
            int max = angka.get(0);

            for (int i = 0; i < angka.size(); i++) {
                
     
                int angkaNow = angka.get(i);
                
                if (angkaNow > max) {

                    max = angkaNow;
                }
            }
            System.out.println("Nilai max: " + max);
            System.out.println();
                  
            ArrayList<String>name = new ArrayList<>();
            name.add("Arlott");
            name.add("Lancelot");
            name.add("Amartis");
            name.add("Joy");
            name.add("Abenedetta");
            name.add("Badang");
            
            for (int i = 0; i < name.size(); i++){
                
                String nameShow = name.get(i);
                if (nameShow.startsWith("A")){
                    System.out.println(nameShow);
                }
            }
    } 
}
