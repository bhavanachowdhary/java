package pack1;

public class product {
    int product_id;
    String product_name;
    int product_size;
    int product_price;
    int product_quantity;

    product(int product_id, String product_name,int product_size, int product_price, int product_quantity)
    {
        System.out.println("****Product Class****");
        this.product_id=product_id;
        this.product_name=product_name;
        this.product_price=product_price;
        this.product_size=product_size;
        this.product_quantity=product_quantity;
    }
    void display()
    {
        System.out.println(" Id "+this.product_id);
        System.out.println(" Product Name : "+this.product_name);
        System.out.println(" Product Size : "+this.product_size);
        System.out.println(" Product Quantity : "+this.product_quantity);
    }
}
