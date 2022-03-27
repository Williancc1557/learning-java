package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.entity.User;

public class CreateUser {
    private User user = new User();

    public User create() {
        user.email = "willian.cacoelho@gmail.com";
        user.id = 12345;
        user.name = "willian";
        return user;
    }

    public static void main(String[] args) {
        System.out.println(new CreateUser().create());
    }
}
