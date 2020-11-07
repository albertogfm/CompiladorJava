package regex;
import java.util.Scanner;
import java.util.regex.*;

 class compilador{ //CLASE COMPILADOR
     String convertidor(String operando){ //CONVERTIR LOS OPERANDOS A HEXADECIMAL
         if (operando.charAt(0)=="$"){
             //metodo para insertar en la lista (compilador) cuando ya estan en hexadecimal
         }else //insertaremos el caso de cuando es decimal para convertirlo a hexadecimal y agregarlo al array compilador 

     }

 }
 /*Método que se encarga de identificar el modo de direccionamiento a través de expresiones regulares y de validarlos*/
    void matcher(String cadena){
        //NOTAAAAAAAAAAA: AGREGAR EL FUNCIONAMIENTO EN ASSCCI PREGUNTA OBLIGATORIA EL LUNES 
        Pattern expresionINH = Pattern.compile("^([a-zA-Z]{3,6})$"); // Identifica el direccionamiento INHERENTE
        Pattern expresionIMM = Pattern.compile("^([a-zA-Z]{3,6}( )(#)(\\$)?([0-9a-fA-F]{2,4}))$");// Identifica el modo de direccionamiento INMEDIATO
        Pattern expresionEXT = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{4}))$");// Identifica el modo de direcciconamiento EXTENDIDO
        Pattern expresionDIR = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2}))$"); // Identifica el modo de direccionamiento  DIRECTO
        Pattern expresionREL = Pattern.compile("^([a-zA-Z]{3,6}( )[a-zA-Z]*)$");// Identifica el modo de direccionamiento el RELATIVO
        Pattern expresionINDX = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2})(,[xX]))$");// Identifica el modo de direccionamiento INDEXADO RESPECTO A "Y"
        Pattern expresionINDY = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2})(,[yY]))$");// Identifica el modo de direccionamiento INDEXADO RESPECTO A "X"

        Matcher inh = expresionINH.matcher(cadena);//Valida la expresión INHERENTE
        Matcher imm = expresionIMM.matcher(cadena);//Valida la expresión INMEDIATO
        Matcher ext = expresionEXT.matcher(cadena);//Valida la expresión EXTENDIDO
        Matcher dir = expresionDIR.matcher(cadena);//Valida la expresión DIRCETO
        Matcher rel = expresionREL.matcher(cadena);//Valida la expresión RELATIVO       
        Matcher indx = expresionINDX.matcher(cadena);//Valida la expresión INDEXADO RESPECTO A "X"
        Matcher indy = expresionINDY.matcher(cadena);//Valida la expresión INDEXADO RESPECTO A "Y"

        if(inh.find())
            //FUNCION DE BETO CON PARAMETROS(MNEMONICO, inh)
        if(imm.find())
            System.out.println("imm");
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


