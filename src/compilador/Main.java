package compilador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import filemanagment.FileMan;

public class Main{
    public static void main(String[] args) {
        FileMan trataFiles = new FileMan();
        System.out.println(trataFiles.readOpcodes("mul","INH"));
    }
}