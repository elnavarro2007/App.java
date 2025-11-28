public class Titles {

    public static void writeTitle(String c) {

        System.out.println("");

        for(int i=0;i<80;i++){
            System.out.printf("*");
        }
        System.out.println("");

        System.out.println(c);

        for(int i=0;i<80;i++){
            System.out.printf("*");
        }
        System.out.println("");
    }
    public static void writeTitle2(String c) {

        System.out.println("");

        for(int i=0;i<11;i++){
            System.out.printf("*");
        }
        System.out.println("");
        for(int i=0;i<3;i++){
            System.out.printf("*");
        }

        System.out.printf(" "+c+ " ");
        for(int i=0;i<3;i++){
            System.out.printf("*");
        }
        System.out.println("");
        for(int i=0;i<11;i++){
            System.out.printf("*");
        }
        System.out.println("");
    }
}