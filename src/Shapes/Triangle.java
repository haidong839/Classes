package Shapes;

public class Triangle {

    int a = 0, b = 0, c = 0;
    double cos_A, cos_B, cos_C, vinkel_A, vinkel_B, vinkel_C;

    public Triangle(int x, int y, int z) {
        a = x;
        b = y;
        c = z;

        if (isValidTriangle()){
            //vinkel A
            cos_A = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
            vinkel_A = Math.toDegrees(Math.acos(cos_A));
            //vinkel B
            cos_B = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
            vinkel_B = Math.toDegrees(Math.acos(cos_B));
            //vinkel C
            cos_C = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
            vinkel_C = Math.toDegrees(Math.acos(cos_C));
        }
    }

    public double getVinkelA() {
        return vinkel_A;
    }

    public double getVinkelB() {
        return vinkel_B;
    }

    public double getVinkelC() {
        return vinkel_C;
    }

    public boolean isValidTriangle() {
        //ugyldig
        if (a > b + c || b > a + c || c > a + b) {
            //System.out.println("Noget er galt!");
            return false;
        }
        return true;
    }

    public boolean isEquilateralTriangle() {
        if (a == b && b == c) {
            //System.out.println("Trekanten er ligesidet");
            return true;
        }
        return false;
    }

    public boolean isIsoscelesTriangle() {
        if ((a == b && c != b) || (b == c && a != c) || (a == c && b != c)) {
            //System.out.println("Trekanten er ligebenet");
            return true;
        }
        return false;
    }

    public boolean isRightAngledTriangle() {
        if ((vinkel_A == 90) || (vinkel_B == 90) || (vinkel_C == 90)) {
            //System.out.println("Trekanten er retvinklet");
            return true;
        }
        return false;
    }

    public boolean isPointedTriangle() {
        if (vinkel_A < 90 && vinkel_B < 90 && vinkel_C < 90) {
            //System.out.println("Trekanten er spids");
            return true;
        }
        return false;
    }

    public boolean isObtuseAngledTriangle() {
        if (vinkel_A > 90 || vinkel_B > 90 || vinkel_C > 90) {
            //System.out.println("Trekanten er stump");
            return true;
        }
        return false;
    }


}






