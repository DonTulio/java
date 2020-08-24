/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DonTulio
 */
public class ClaseInicio {
    public static void main(String[] args){
        // Datos de Caracter
        char variableChar = '\u0052';
        char otroChar = 'Q';
        char[] nombre = {'J','u','l','i','o'};
        System.out.println("Datos de caracteres");
        System.out.println(nombre);
        System.out.println(otroChar);
        System.out.println(variableChar);
        System.out.println("----------------");
        // Datos Entero
        byte variableByte = 127; // 127 - -128
        short variableShort = 32000; // 32000 - - 32000
        int variableInt = 2000000000; // 2000000000 - -2000000000
        long variableLong = 2000000000000L; // 
        // Datos Real
        float variableFloat = 20.025F;
        double variableDouble = 20.00000;
        //Booleano
        boolean variableBoolean = true;
    }
}
