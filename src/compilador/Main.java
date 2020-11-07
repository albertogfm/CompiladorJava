<<<<<<< HEAD
package compilador;

import filemanagment.FileMan;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        FileMan trataFiles = new FileMan();
        //System.out.println(trataFiles.readOpcodes("adca","INDX"));
        ArrayList<String> codigo = trataFiles.leerArchivo("ERROR");
        for (int i = 0; i < 500; i++) {
            System.out.println(codigo.get(i)); 
        }
        
    }
=======
