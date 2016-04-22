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
public class Tamu {

    private final String nama;
    private static int no_telp;

    public  Tamu(String n, int no) {
        nama = n;
        no_telp = no;
    }

    public final String getNama() {
        return nama;
    }

    public static int getNo() {
        return no_telp;
    }

}
