package sp;

public class Product {
    String name;
    Double price;
    Product(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public void show(){
        System.out.printf("Name:  %s Price: %.1f\n",this.name,this.price);
    }
}
