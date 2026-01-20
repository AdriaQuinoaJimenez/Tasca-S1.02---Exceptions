package nivell2.exercici1.model;

import nivell2.exercici1.exceptions.InputExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        byte num = 0;
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println(message);
                num = sc.nextByte();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("Error de format. Torna-ho a provar");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return num;
    }

    public static int readInt(String message) {
        int num = 0;
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println(message);
                num = sc.nextInt();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("Error de format. Torna-ho a provar");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return num;
    }

    public static float readFloat(String message) {
        float num = 0;
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println(message);
                num = sc.nextFloat();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("Error de format. Torna-ho a provar");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return num;
    }

    public static double readDouble(String message) {
        double num = 0;
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println(message);
                num = sc.nextDouble();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("Error de format. Torna-ho a provar");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return num;
    }

    public static char readChar(String message) {
        char caracter = ' ';
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println(message);
                String input = sc.next();

                if(input.length() != 1){
                    throw new InputExceptions("Error: S'ha d'introduir un caracter");
                }
                caracter = input.charAt(0);
                flag = true;
            } catch (InputExceptions e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        sc.nextLine();
        return caracter;
    }

    public static String readString(String message) {
        String input = " ";
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println(message);
                input = sc.next();

                if(input.length() == 1){
                    throw new InputExceptions("Error: el text ha de tenir mes d'un caracter");
                }
                flag = true;
            } catch (InputExceptions e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        sc.nextLine();
        return input;
    }

    public static boolean readYesNo(String message) {
        boolean result = false;
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println(message);
                String input = sc.next();

                if(input.length() > 1 || !input.equalsIgnoreCase("s") && !input.equalsIgnoreCase("n")) {
                    throw new InputExceptions("Error: S'ha de respondre 's' o 'n'");
                }

                if(input.equalsIgnoreCase("s")){
                    result = true;
                }
                flag = true;

            } catch (InputExceptions e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        sc.nextLine();
        return result;
    }

}
