/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Mapa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author MaPache
 */
public class MapReader {

    public static ArrayList<String[]> reader(String archivo) throws FileNotFoundException, IOException {
        String c;

        ArrayList<String[]> d = new ArrayList();
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((c = b.readLine()) != null) {
            //System.out.println(c);
            d.add(c.split(" "));
        }
        b.close();
        return d;
    }
}
