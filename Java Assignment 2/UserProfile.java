public class UserProfile {
    private String username;
    private String email;
    private String password;
    void setUser(String user){
        this.username=user;
    }
    void getUser(){
        System.out.println("The username is"+username);
    }
    void setEmail(String email){
        this.email=email;
    }
    void getEmail(){
        System.out.println("The email is "+email);
    }
    void setPassword(String pass){
        this.password=pass;
    }
    void getPassword(){
        System.out.println("The password is"+password);
    }
    public static void main(String[]args){
        UserProfile up=new UserProfile();
        up.setUser("Bhargav");
        up.setEmail("kotabhargavsai@gmail.com");
        up.setPassword("P@ssword1234");
        up.getUser();
        up.getEmail();
        up.getPassword();
    }

    
}
