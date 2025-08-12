// import java.util.*;
// import java.util.function.*;

// class User {
//     String name;
//     Optional<String> email;

//     User(String name, String email) {
//         this.name = name;
//         this.email = Optional.ofNullable(email);
//     }
// }

// public class UserSearch {
//     public static void main(String[] args) {
//         List<User> users = Arrays.asList(
//             new User("Bhargav", "Bhargav123@gmail.com"),
//             new User("Adhitya", null),
//             new User("Mahesh", "mahesh123@gmail.com")
//         );

//         String searchName = "Bhargav";

//         Function<String, String> toUpper = String::toUpperCase;

//         Optional<User> userOpt = users.stream()
//             .filter(u -> u.name.equalsIgnoreCase(searchName))
//             .findFirst();

//         userOpt.flatMap(u -> u.email)
//                .map(toUpper)
//                .ifPresent( 
//                    System.out::println);
                
               
//     }
// }
public class UserSearch{
    public static void main(String[]args){
        int i=0;
        do{
            i=i+2;
            System.out.println(i);
        }while(i<10);
    }
}