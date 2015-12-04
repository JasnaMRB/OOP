package designpatterns.builder;


public class App {
    public static void main(String[] args) {
        User newUser = new  User.Builder("jim", "jim@email.com").firstName("Jimmy").build();
        System.out.println(newUser);

    }
}
