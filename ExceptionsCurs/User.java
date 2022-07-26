package ExceptionsCurs;

public class User {
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) throws InvalidEmailException {
        if(!emailAddress.contains("@")){
            throw new InvalidEmailException("Your email is not valid");
        }
        this.emailAddress = emailAddress;
    }



}
