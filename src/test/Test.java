package test;

import beans.User;

/**
 * Created by simon on 10/12/15.
 */
public class Test {

    public static void main(String[] args) {
        User user  = new User("xl127@duke.edu", "letmeinadfasdf");

        if(user.validate()) {
            System.out.println("Bean validates OK.");
        } else {
            System.out.println(user.getMessage());
        }

    }


}
