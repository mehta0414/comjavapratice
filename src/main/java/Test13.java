public class Test13 {
    public static void main(String[] args) {
        int x=1;
        x=x+2;
        System.out.println(x);

        // below is also called compound or arguemented operator
        x+=2;  // same as x=x+2
        System.out.println(x);

        int y=5;
        y=y-1;
        System.out.println(y);
        y-=3;
        System.out.println(y);

        int d=5;
        d=d*2;
        System.out.println(d);
        d*=4;
        System.out.println(d);

        int s=100;
        s=s/5;
        System.out.println(s);
        s/=20;
        System.out.println(s);
    }
}
