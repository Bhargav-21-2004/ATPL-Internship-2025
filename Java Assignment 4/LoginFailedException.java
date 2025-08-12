public class LoginFailedException extends Exception {
    public LoginFailedException(String name,int password){
        super();
    }    
}
public void Login(String message)throws LoginFailedException{
    if(name!="Bhargav" && Password!="123456789"){
        throw new LoginFailedException("Invalid Login  details");

    }
    else{
        System.out.println("welcome to home page");
    }
    LoginFailedException l=new LoginFailedException("Bhargav",123456789);
    l.Login();
}



