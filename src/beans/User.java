package beans;

/**
 * Created by simon on 10/12/15.
 */
public class User {
    private String email = "";
    private String password = "";


    private String message = "";

    public User() {

    }


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean validate() {

        if (!email.matches("\\w+@\\w+.\\w+")) {
            message = "Invalid email address.";
            return false;
        }


        if (password.length() < 8) {
            message = "Password must be at least 8 characcters.";
            return false;
        } else if (password.matches("\\w*\\s+\\w*")) {
            message = "Password cannot contain space.";
            return false;
        }

        return true;
    }
}
