public class QuadratPoly {
    private int a;
    private int b;
    private int c;


    public QuadratPoly(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int value(int x){
        return getA()*x^2 + getB() * x + getC();
    }

}
