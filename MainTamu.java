/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author nuel
 */
import java.util.Scanner;

public class MainTamu {

    public static void main(String[] args) {

        Scanner nuel = new Scanner(System.in);
        int counter = 0;
        System.out.print("Input banyak tamu : ");
        int banyak = nuel.nextInt();
        Tamu guest[] = new Tamu[banyak];
        for (int i = 0; i < banyak; i++) {
            System.out.print("Input nama : ");
            String nama = nuel.next();
            System.out.print("Input no_telp : ");
            int nom = nuel.nextInt();
            guest[i] = new Tamu(nama, nom);

        }
        for (int i = 0; i < banyak; i++) {
            System.out.println("======"+" Data Tamu Ke-"+counter+"======");
            System.out.println("No ID - " + counter++);
            System.out.println("Nama : " + guest[i].getNama());
            System.out.println("No-Telp : " + guest[i].getNo());
            System.out.println("");
        }

    }
}
