package exercici1.app;

import exercici1.model.ConsoleReader;

public class Main {
    public static void main(String[] args) {

        Byte num1 = ConsoleReader.readByte("Introdueix un Byte: ");
        int num2 = ConsoleReader.readInt("Introdueix un Integer: ");
        float dec1 = ConsoleReader.readFloat("Introdueix un Float: ");
        double dec2 = ConsoleReader.readDouble("Introdueix un Double: ");
        char char1 = ConsoleReader.readChar("Introdueix un caracter: ");
        String str = ConsoleReader.readString("Introdueix un String: ");
        boolean bool = ConsoleReader.readYesNo("Introdueix 's' o 'n': ");

        System.out.println("Les dades introduides son: \nByte: " + num1 + "\nInteger: " + num2 + "\nFloat: " + dec1 + "\nDouble: " + dec2 + "\nChar: " + char1 + "\nString: " + str + "\nBoolean: " + bool);

    }
}
