import java.util.Scanner;

public class Figures {

    public static char Asterisk = '*';

    public static void writeSquare(int a) {

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.printf("*");
            }
            System.out.print("");
        }
    }

    public static void writeSquare2(int a, char c) {

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }
    public static void writeSquarePyramid(int a, char c) {

        for(int i=0;i<a;i--){

            for(int j=0;j<a;j++){
                System.out.print('*');
            }
            System.out.println(" ");
            System.out.println("este bucle hara una piramide y se ira empequeñeciendo");
        }
    }
}

