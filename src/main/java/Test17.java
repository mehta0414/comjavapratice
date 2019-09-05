public class Test17 {
    public static void main(String[] args) {
        /*
        Math Class:
         */

        System.out.println(Math.round(1.1f));
        System.out.println(Math.ceil(1.1f));  //2.0

        int result = (int) Math.ceil(1.1f);
        System.out.println(result);

        int result2 = (int) Math.floor(1.1f);
        System.out.println(result2);

        int maxNo = Math.max(1, 2);
        System.out.println(maxNo);

        int minNo = Math.min(1, 2);
        System.out.println(minNo);

        int random1 = (int) (Math.random() * 10);
        System.out.println(random1);

        long random2 = Math.round(Math.random() * 10);
        System.out.println(random2);
    }
}