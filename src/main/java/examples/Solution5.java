package examples;

public class Solution5 {

    public static void main(String[] args) {
        signIn("Peter");
        signIn("user");
        signIn("Jhonny");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
