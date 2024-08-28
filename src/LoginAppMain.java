public class LoginAppMain {

    public static void main(String[] args) {

        PasswordManager passwordManager = new PasswordManager("pragra","pragra123");

        if(passwordManager.isUserAuthenticated("pragra", "pragra123")){
            System.out.println("user autheticated");
        }else{
            System.out.println("failed to autheticate");
        }
        System.out.println("I am trying to change password");
        passwordManager.chnagePassword("pragra123","newPasswword");

        System.out.println(passwordManager);


        if(passwordManager.isUserAuthenticated("pragra","newPasswword")){
            System.out.println("user autheticated done");
        }else {
            System.out.println("failed to autheicated");
        }
    }
}
