import java.util.Scanner;

public class QuadratPolyMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuadratPoly poly = new QuadratPoly(2,5,1);
        System.out.println(poly.value(3));
        System.out.println("Delta: " + poly.getDelta());
        System.out.printf("X1: %.2f\n",poly.getX1());
        System.out.printf("X2: %.2f\n",poly.getX2());
        System.out.println("Znak delta: " + poly.sgnDelta());
        System.out.println(poly);
//
//        QuadratPoly polyUser = new QuadratPoly();
//        System.out.println("Podaj wartosci dwumianu:");
//        System.out.println("Podaj a: ");
//        polyUser.setA(sc.nextInt());
//        System.out.println("Podaj b: ");
//        polyUser.setB(sc.nextInt());
//        System.out.println("Podaj c: ");
//        polyUser.setC(sc.nextInt());
//
//        System.out.println("Podaj wartosc dla ktorego ma zostac obliczony dwumian");
//        System.out.println(poly.value(sc.nextInt()));
//        System.out.println("Delta: " + polyUser.getDelta());
//        System.out.printf("X1: %.2f\n",polyUser.getX1());
//        System.out.printf("X2: %.2f\n",polyUser.getX2());
//        System.out.println("Znak delta: " + polyUser.sgnDelta());
//        System.out.println(polyUser);
        System.out.println("Wierzchołek p: " + poly.getP());
        System.out.println("Wierzchołek q: " + poly.getQ());

        System.out.println("isPositive: " + poly.isAPositive());
        System.out.println("Range: " + poly.quadratPolySolutionRange());

    }
}
