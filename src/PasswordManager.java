public class PasswordManager {
private String username;
private  String password;

    public PasswordManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isUserAuthenticated(String username, String password) {
         return this.username.equals(username) &&  this.password.equals(password);
    }


    public boolean chnagePassword(String oldPassword, String newPassword){
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return true;
        }else {
            System.out.println("failed to update");
            return false;
        }
    }

    @Override
    public String toString() {
        return "PasswordManager{" +
                "username='" + username + '\'' +
                ", password='[PROTECTED]'" +
                '}';
    }
}
