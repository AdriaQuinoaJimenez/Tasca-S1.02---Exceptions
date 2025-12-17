package exercici1.app;

import exercici1.exceptions.EmptySaleException;
import exercici1.model.Sale;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();
        try {
            sale.calculateTotal();
        } catch (EmptySaleException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
