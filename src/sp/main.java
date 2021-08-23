package sp;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
//                - Mango, price = 3.0
//                - Banana, price = 1.5
//                - Apple, price = 2.5
        ArrayList<Product> list = new ArrayList<>();
        Product p1 = new Product("Mango",3.0);
        Product p2 = new Product("Banana",1.5);
        Product p3 = new Product("Apple",4.5);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.forEach(e->{
                e.show();
        });

        System.out.println("<==========================>");
        Collections.sort(list,(a,b)->{
           return (int) (a.price - b.price);
        });
        list.forEach(e->{
            e.show();
        });

        System.out.println("<==========================>");
        Collections.sort(list,(a,b)->{
            return  (a.name.equalsIgnoreCase(b.name) == true) ? 0 : 1;
        });
        list.forEach(e->{
            e.show();
        });
    }
}

