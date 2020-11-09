package compilador;

import regex.*;
import filemanagment.*;
import java.util.ArrayList;

public class Main{
  public static void main(String [] args){
    FileMan trataFiles = new FileMan();
        //System.out.println(trataFiles.readOpcodes("adca","INDX"));
        trataFiles.leerArchivo("ERROR");
        for (int i = 0; i < 500; i++) {
            System.out.println(trataFiles.lineasArchivoASC.get(i)); 
        }
  }
}