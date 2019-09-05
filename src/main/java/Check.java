public class Check {

    private int a, b;  // instance variable

    public Check(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {

        Check check = new Check(10, 12);
        System.out.println(check.getA());

        Check check2=check;
        System.out.println(check2.getA());
        check2.setA(100);
        System.out.println(check2.getA());
        System.out.println(check.getA());


    }
}
