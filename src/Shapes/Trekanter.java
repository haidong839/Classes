package Shapes;

import java.util.Scanner;

public class Trekanter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Indtast sidelængden a:");
        int a = s.nextInt();
        System.out.println("Indtast sidelængden b:");
        int b = s.nextInt();
        System.out.println("Indtast sidelængden c:");
        int c = s.nextInt();

        final double cos_A;
        final double cos_B;
        final double cos_C;
        final double vinkel_A;
        final double vinkel_B;
        final double vinkel_C;

        //Cos A
        cos_A = (Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c);

        //Cos B
        cos_B = (Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(2*a*c);

        //Cos C
        cos_C = (Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b);

        //vinkel A
        vinkel_A = Math.toDegrees(Math.acos(cos_A));

        //vinkel B
        vinkel_B = Math.toDegrees(Math.acos(cos_B));

        //vinkel C
        vinkel_C = Math.toDegrees(Math.acos(cos_C));


        //ugyldig
        if ( a > b + c || b > a + c || c > a + b ) {
            System.out.println("Noget er galt!");
        }

        //ligesidet trekant
        else if (a == b && b == c) {
            System.out.println("Trekanten er ligesidet");
        }

        //ligebenet
        else if (a == b && c != b || b == c && a != c || a == c && b != c) {
            System.out.println("Trekanten er ligebenet");
        }

        //retvinklet
        else if (vinkel_A == 90 || vinkel_B == 90 || vinkel_C == 90){
            System.out.println("Trekanten er retvinklet");
        }

        //spidsvinklet
        else if (vinkel_A < 90 && vinkel_B < 90 && vinkel_C < 90){
            System.out.println("Trekanten er spids");
        }

        //stumpvinklet
        else if (vinkel_A > 90 || vinkel_B > 90|| vinkel_C > 90){
            System.out.println("Trekanten er stump");
        }

    }

}
