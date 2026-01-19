package nivell1.exercici1.app;

import nivell1.exercici1.exceptions.EmptySaleException;
import nivell1.exercici1.model.Product;
import nivell1.exercici1.model.Sale;

public class Main {
    public static void main(String[] args){

        Sale sale = new Sale();

        try{
            sale.calculateTotal();
        } catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }

        Product p1 = new Product("Moto",33.33);
        Product p2 = new Product("Tablet",22.22);
        Product p3 = new Product("Iphone",81);

        sale.addProduct(p1);
        sale.addProduct(p2);
        sale.addProduct(p3);

        try{
            sale.calculateTotal();
            sale.getProducts().get(3);
            sale.calculateTotal();
        } catch (EmptySaleException | IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println(sale.getTotalPrice());
    }
}
