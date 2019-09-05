public class Test6 {
    /*
    Object toString() Method in Java
    a) Every class in java is child of Object class either directly or indirectly.
    b) Object class contains toString() method.
    c) We can use toString() method to get the String representation of an object.
    d) Whenever we try to print Object reference then internally toString() method is invoked
    e) If we did not define toString() method in your class then Object class toString() method
       is invoked otherwise our implemented/overridden toString() method will be called.


     */

    int a, b;

    public static void main(String[] args) {
        int[] x = new int[5];
        System.out.println(x);
        Test6 t=new Test6();
        t.a=100;
        t.b=200;
        System.out.println(t);
    }

    void hi() {
        System.out.println("Hi to everyone");
    }

    @Override
    public String toString() {
        return "Test6{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
