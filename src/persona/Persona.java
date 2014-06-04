/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author leonel
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("/home/leonel/Escritorio/datos_persona.txt");

        try {
            writeFile(file);

        } catch (IOException e) {
            System.out.println("El archivo no pudo ser escrito o la ruta no existe");
        }

        try {
            readFile(file);
        } catch (IOException e) {
            System.out.println("El archivo " + file.getPath() + "no pudo ser leido, "
                    + "compruebe que la ruta sea la correcta y que exista tal archivo");
        }

    }

    private static void writeFile(File file) throws IOException {
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter writer = new PrintWriter(bw);

        writer.println("Nombres: "+JOptionPane.showInputDialog("Nombres :"));
        writer.println("Apellidos: "+JOptionPane.showInputDialog("Apellidos: "));
        writer.println("Edad: "+JOptionPane.showInputDialog("Edad: "));
        writer.println("Domicilio: "+JOptionPane.showInputDialog("Domicilio: "));
        writer.println("Dirección: "+JOptionPane.showInputDialog("Dirección: "));
        writer.println("Telefonos: "+JOptionPane.showInputDialog("Telefonos: "));
        writer.close();
    }

    private static void readFile(File file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

//Se lee la primera línea
        String linea = reader.readLine();

        while (linea != null) {
            System.out.println(linea);
//Se lee una nueva línea
            linea = reader.readLine();
        }
        reader.close();
    }

}
