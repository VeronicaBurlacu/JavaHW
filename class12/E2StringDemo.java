package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String password="pass123";
        //write a code to check the usernaem and pass if the userN and
        //pass are less than 8 charcat this mess should be printed
        // sign up successful otherwise "username and pass can't be more than 8 characters"
        if(userName.length()<8&&password.length()>8){
            System.out.println("UserName and password can't be more than 8 characters");
        }else{
            System.out.println("Sighn up successful");

        }
    }
}
