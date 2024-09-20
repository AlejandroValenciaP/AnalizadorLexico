package codigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
                Equipo: Pablo
    Materia: Lenguajes y autoimatas 2 Grupo A
                Integrantes:
        Gomez Ibarra Eduardo Manuel
        Martínez Mendoza Gloria Isable
        Valencia Pérez Alejandro
        Vargas Amézquita Gonzalo
        Ramírez Ramírez Miguel Angel
        Morales Belman Alan Ouseri
        Salcedo Cordova Mauricio Alejandro
*/

public class analizador_Lexico {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String []args){
        String patron = "(abstract|conft|finally|IOException|null|public|this|continue|interface|return|throw|break|defaut|for|long|glont|throw|byte|do|goto|native|"
                + "static|transfert|care|case|if|new|scrypt|try|System|out|println|catch|else|implements|package|super|void|char|extends|import|private|switch|volatile|class|"
                + "final|Scanner|main|equalsIgnoreCase|instance|of|protected|synchronized|while|print)|(boolean|byte|char|double|int|float|long|String|slust)|([<|>]+)|([+]|[-])|([=]+)|"
                + "([0-9]+)|([++]{2}|[--]{2})|([(|)]+)|([{|}]+)|([\\[|\\]])|(;)|(\\.)|([a-zA-Z]+)";
        
        //System.out.println("Ingresa el codigo a analizar");
        String direccion;
        direccion ="C:\\Users\\PRIDE ANACONDA\\Downloads\\proye\\proye.txt";
        try {
            BufferedReader bf = new BufferedReader (new FileReader (direccion));
            String temp ="";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
                
            }
            String expr = temp;
            System.out.println("Tabla de simbolos: \t\tSIMBOLO\n");
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(expr);
        
        while(matcher.find()){
            String token1 = matcher.group(1);
            if (token1 != null) {
                System.out.println("Palabras reservadas\t\t " + token1);
            }
            
            String token2 = matcher.group(2);
            if (token2 != null) {
                System.out.println("Tipo de dato\t\t\t " + token2);
            }
            
            String token3 = matcher.group(3);
            if (token3 != null) {
                System.out.println("Operadores relacionales\t\t " + token3);
            }
            
            String token4 = matcher.group(4);
            if (token4 != null) {
                System.out.println("Operadores de aritméticos\t " + token4);
            }
            
            String token5 = matcher.group(5);
            if (token5 != null) {
                System.out.println("Operadores de asignación\t " + token5);
            }
            
            String token6 = matcher.group(6);
            if (token6 != null) {
                System.out.println("Números\t\t\t\t " + token6);
            }
            
            String token7 = matcher.group(7);
            if (token7 != null) {
                System.out.println("Operadores de incremento/decremento\t\t\t " + token7);
            }
            
            String token8 = matcher.group(8);
            if (token8 != null) {
                System.out.println("Parentesis\t\t\t " + token8);
            }
            
            String token9 = matcher.group(9);
            if (token9 != null) {
                System.out.println("Llaves\t\t\t\t " + token9);
            }
            
            String token10 = matcher.group(10);
            if (token10 != null) {
                System.out.println("Corchetes\t\t\t " + token10);
            }
            
            String token11 = matcher.group(11);
            if (token11 != null) {
                System.out.println("Punto y coma\t\t\t " + token11);
            }
            
            String token12 = matcher.group(12);
            if (token12 != null) {
                System.out.println("Punto\t\t\t\t " + token12);
            }
            
            String token13 = matcher.group(13);
            if (token13 != null) {
                System.out.println("Identificador\t\t\t " + token13);
            }
            
        }
        } catch (Exception e) {
            System.out.println("no se encontro el archivo");
        }
        
        
        
    }
}
