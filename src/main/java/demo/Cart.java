package demo;

import org.springframework.stereotype.Component;

@Component
public class Cart {

    public void checkout(String status) {
        System.out.println("Checking out.");
    }

    public int qty() {
        return 7;
    }

}


