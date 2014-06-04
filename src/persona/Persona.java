/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.awt.Color;
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
            JOptionPane.showMessageDialog(null, "EL archivo no pudo ser escrito");
        }

        try {
            readFile(file);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "El archivo " + file.getPath() + "no pudo ser leido, compruebe que la ruta sea la correcta y que exista tal archivo");

        }

    }

    private static void writeFile(File file) throws IOException {
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter writer = new PrintWriter(bw);
        String persona = JOptionPane.showInputDialog("Cuantas personas desea almacenar: ");
        int personas = Integer.parseInt(persona);

        for (int i = 0; i < personas; i++) {

            writer.println("_____________________________________________");
            writer.println("PERSONA " + (i + 1));
            writer.println("Nombres: " + JOptionPane.showInputDialog("Persona" + (i + 1) + "\nNombres :"));
            writer.println("Apellidos: " + JOptionPane.showInputDialog("Persona" + (i + 1) + "\nApellidos: "));
            writer.println("Edad: " + JOptionPane.showInputDialog("Persona" + (i + 1) + "\nEdad: "));
            writer.println("Domicilio: " + JOptionPane.showInputDialog("Persona" + (i + 1) + "\nDomicilio: "));
            writer.println("Dirección: " + JOptionPane.showInputDialog("Persona" + (i + 1) + "\nDirección: "));
            writer.println("Telefonos: " + JOptionPane.showInputDialog("Persona" + (i + 1) + "\nTelefonos: "));
            writer.println("_____________________________________________");
        }

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
        JOptionPane.showMessageDialog(null, linea);
        reader.close();
    }

}
