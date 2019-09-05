public class Test26 {
    public static void main(String[] args) {
        /*
        Switch Statements
         */
        // we can't use long inside the switch statement

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;

            case "moderator":
                System.out.println("You are moderator");
                break;

            default:
                System.out.println("You are the guest");

        }
    }
}
