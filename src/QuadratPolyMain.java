public class QuadratPolyMain {

    public static void main(String[] args) {
        QuadratPoly poly = new QuadratPoly(1,2,1);
        System.out.println(poly.value(3));
        System.out.println("Delta:" + poly.getDelta());
        System.out.println("Znak delta: " + poly.sgnDelta());
        System.out.println(poly);
    }
}
