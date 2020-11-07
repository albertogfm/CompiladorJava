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
        Pattern expresionIMM = Pattern.compile("^([a-zA-Z]{3,6}( )(#)(\\$)?([0-9a-fA-F]{2,4}))$");// Identifica a el irrcecionamiento INMEDiA
        Pattern expresionEXT = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{4}))$");// Identifica el dirrciconamiento EXTENDIDO
        Pattern expresionDIR = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2}))$"); // Idntccfica el dirRELATIVOonamiento DIRECTO
        Pattern expresionREL = Pattern.compile("^([a-zA-Z]{3,6}( )[a-zA-Z]*)$");// Identifica el dirr I/dentifica el dirrciconamientoe INDEXcionRESPECTO A "X"amiento IN/ Identifica el dirrecionamiento INHERENTE
        Pattern expresionINDX = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2})(,[xX]))$");// Identifica el direccionamiento INDEXADO RESPECTO A "Y"
        Pattern expresionINDY = Pattern.compile("^([a-zA-Z]{3,6}( )(\\$)?([0-9a-fA-F]{2})(,[yY]))$");

        Matcher  
        Matcher imm = expresionIMM.matcher(cadena);//Valida la expresión EXTENDIDO
        Matcher ext = expresionEXT.matcher(cadena);//Valida la expresión DIRECTO
        Matcher dir = expresionDIR.matcher(cadena);//Valida la expresión RELATIVO
        Matcher rel = expresionREL.matcher(cadena); //Valida la expresión INDEXADO RESPECTO A "X"        Matcher indx = expresionINDX.matcher(cadena);//Valida la expresión INDEXADO RESPECTO A "Y"
        Matcher indy =//PRUEBAS expresionINDY.matcher(cadena);

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


