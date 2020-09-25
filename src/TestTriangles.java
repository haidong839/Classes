import Shapes.Triangle;

import java.util.Scanner;

public class TestTriangles {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Indtast sidelængden a:");
        int a = s.nextInt();
        System.out.println("Indtast sidelængden b:");
        int b = s.nextInt();
        System.out.println("Indtast sidelængden c:");
        int c = s.nextInt();

        Triangle t = new Triangle();
        t.getTriangle(a,b,c);


    }

}
