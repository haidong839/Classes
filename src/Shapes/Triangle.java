package Shapes;

public class Triangle {

    int a = 0; int b = 0; int c = 0;
    double cos_A; double cos_B; double cos_C;
    double vinkel_A; double vinkel_B; double vinkel_C;

    public void getTriangle(int a, int b, int c){

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






