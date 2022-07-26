package ExceptionsCurs;

public class OnlineShop {
    public static void main(String[] args) {
        User user = new User();

        try {
            user.setEmailAddress("angtrgrdrg");
        } catch (InvalidEmailException emailException) {
            System.out.println(emailException.getMessage());
        }
        ///chesstii
    }
}