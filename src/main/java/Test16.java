public class Test16 {
    public static void main(String[] args) {

        // We always get user input in the form of String in most of the desktop
        // and mobile application

        String s = "1";
        // Integer is the wrapper class for the int primitive type
        int i = Integer.parseInt(s);
        System.out.println(10 + i);

        int y=Integer.parseInt(s)+10;
        System.out.println(y);

        // Short is the Wrapper class for the short primitive type
        short d = Short.parseShort(s);
        System.out.println(d + 2);

        // Float is the Wrapper class for the float primitive type

        Float f=Float.parseFloat(s);
        System.out.println(f+1);

        String p="1.1";
        double a=Double.parseDouble(p) +2;
        System.out.println(a);




        


    }
}
