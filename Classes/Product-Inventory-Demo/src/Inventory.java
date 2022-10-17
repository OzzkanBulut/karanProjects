import java.util.ArrayList;

public class Inventory {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) throws Exception {
        if(product.getPrice()<=0){
            throw new Exception("Product Price must be positive!");
        }
        products.add(product);
    }

    public void deleteProduct(Product product){
        products.remove(product);
    }

    public int sumValue(){
        int sum = 0 ;
        for(Product p:products){
            sum = sum+ (p.getPrice() * p.getQuantity() );
        }
        return sum;
    }

}
