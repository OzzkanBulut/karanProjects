public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1, 120, 3);
        Product product2 = new Product(2, 30, 12);

        Inventory inventory = new Inventory();

        inventory.addProduct(product1);
        inventory.addProduct(product2);


        System.out.println("Value of inventory : "+ inventory.sumValue());

        inventory.deleteProduct(product1);

        System.out.println("Value of inventory after removing an item : "+ inventory.sumValue());


    }
}