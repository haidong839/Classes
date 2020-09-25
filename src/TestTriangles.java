
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

        Triangle t = new Triangle(a,b,c);
        if (t.isValidTriangle() == false){
            System.out.println("Noget er galt!");
            return;
        }

        if (t.isEquilateralTriangle()){
            System.out.println("Trekanten er ligesidet");
        } else if (t.isPointedTriangle()){
            System.out.println("Trekanten er spids");
        }

        if (t.isIsoscelesTriangle()){
            System.out.println("Trekanten er ligebenet");
        } else if (t.isObtuseAngledTriangle()){
            System.out.println("Trekanten er stump");
        }

        if (t.isRightAngledTriangle()){
            System.out.println("Trekanten er retvinklet");
        }


    }

}
