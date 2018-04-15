public class QuadratPoly {
    private int a;
    private int b;
    private int c;
    private int delta;


    public QuadratPoly(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
        getDelta();
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

    private int getDelta() {
        return getB()*getB() - 4 * getA()*getC();
    }

    public int value(int x){
        return getA()*x^2 + getB() * x + getC();
    }

}
