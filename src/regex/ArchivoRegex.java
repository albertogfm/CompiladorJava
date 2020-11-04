import java.util.Scanner;
import java.util.regex.*;

 class leerArchivo{
    String nombre;
    public leerArchivo(String nombreFile){
        this.nombre=nombreFile;
    }
    void matcher(String cadena){
        System.out.println("Entre");
        Pattern expresionINH = Pattern.compile("^([a-zA-Z]{3,6})$");
        Pattern expresionIMM = Pattern.compile("^([a-zA-Z]{3,6}( )(#)(\\$)?([0-9a-fA-F]{2,4}))$");
        Pattern expresionEXT = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{4}))$");
        Pattern expresionDIR = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2}))$");
        Pattern expresionREL = Pattern.compile("^([a-zA-Z]{3,6}( )[a-zA-Z]*)$");
        Pattern expresionINDX = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2})(,[xX]))$");
        Pattern expresionINDY = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2})(,[yY]))$");
        
        Matcher inh = expresionINH.matcher(cadena);
        Matcher imm = expresionIMM.matcher(cadena);
        Matcher ext = expresionEXT.matcher(cadena);
        Matcher dir = expresionDIR.matcher(cadena);
        Matcher rel = expresionREL.matcher(cadena);
        Matcher indx = expresionINDX.matcher(cadena);
        Matcher indy = expresionINDY.matcher(cadena);
        if(inh.find())
            System.out.println("Inherente");
        if(imm.find())
            System.out.println("Inmediato");
        if(ext.find())  
            System.out.println("Extendido");    
        if(dir.find())
            System.out.println("Directa");
        if(rel.find())
            System.out.println("Relativo");
        if(indx.find())
            System.out.println("Indexado en X");
        if(indy.find())
            System.out.println("Indexado en Y");
}
}

public class archivoRegex{
    public static void main(String args[]){
        System.out.println("A trabajar");
        leerArchivo prueba = new leerArchivo("Hola haha");
        prueba.matcher("jmp inicio");
}

}