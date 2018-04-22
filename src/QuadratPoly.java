public class QuadratPoly {
    private int a;
    private int b;
    private int c;
    private int delta;


    public QuadratPoly(int a, int b, int c) {
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

    public int getDelta() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public int value(int x) {
        return getA() * x ^ 2 + getB() * x + getC();
    }

    public int sgnDelta(){
        if(getDelta() == 0){
            return 0;
        } else if(getDelta() > 0){
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if ( getA() == -1 ) {
            sb.append("-x^2");
        } else if ( getA() == 1 ) {
            sb.append("x^2");
        } else if ( getA() > 0 || getA() < 0 ) {
            sb.append(getA()).append("x^2");
        }

        if ( getA() != 0 ) {
            if ( getB() == -1 ) {
                sb.append("-x");
            } else if ( getB() == 1 ) {
                sb.append("+").append("x");
            } else if ( getB() < 0 ) {
                sb.append(getB()).append("x");
            } else if ( getB() > 0 ) {
                sb.append("+").append(getB()).append("x");
            }
        } else {
            if ( getB() == -1 ) {
                sb.append("-x");
            } else if ( getB() == 1 ) {
                sb.append("x");
            } else if (getB() < 0 || getB() > 0) {
                sb.append(getB()).append("x");
            }
        }

        if ( getC() > 0 ) {
            sb.append("+").append(getC());
        } else if ( getC() < 0 ) {
            sb.append(getC());
        }

        return sb.toString();
    }
}
