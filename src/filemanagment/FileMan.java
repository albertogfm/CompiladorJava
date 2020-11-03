package filemanagment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileMan{
    public static boolean leerArchivo(String nombreAr) {
        File file = new File(".\\files\\read\\"+nombreAr+".asc");
        if(!file.exists()){
                System.out.println("\tNo se encontró el archivo");
                return false;
        }
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {

                String linea = sc.nextLine();//Lee el contenido del archivo
                System.out.println(linea);
                //método para identificar error en cada línea


            }        
            sc.close();
            
        }catch (FileNotFoundException e) {
            System.out.println("Scanner unable to use");
        }
        return true;
    }
}