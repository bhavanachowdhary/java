// INTERFACE

interface checkout {
    int purchase();

    int finalcheckout();

    void details();
}

class localvender implements checkout {
    int product_id, quantity, price;
    String product_name;
    float state_tax = .12f;

    localvender(int product_id, String product_name, int quantity, int price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity = quantity;
        this.price = price;
    }

    public void details() {
        System.out.println("=====================================");
        System.out.println("Local Vendor");

    }

    public int purchase() {
        details();
        System.out.println("=====================================");
        System.out.println("Product Name:\t" + product_name);
        System.out.println("Product ID:\t" + product_id);
        System.out.println("Product Quantity:\t" + quantity);
        System.out.println("Product Name:\t" + price);
        System.out.println("=====================================");
        System.out.println("State Tax:\t" + state_tax);
        return 0;
    }

    public int finalcheckout() {
        System.out.println("Total Price:\t" + (price * quantity) + (state_tax));
        return 0;
    }

}

class globalvender implements checkout {
    int product_id, quantity, price;
    String product_name;
    float shipping_duty = .12f;

    globalvender(int product_id, String product_name, int quantity, int price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity = quantity;
        this.price = price;
    }

    public void details() {
        System.out.println("=====================================");
        System.out.println("Global Vendor");

    }

    public int purchase() {
        details();
        System.out.println("=====================================");
        System.out.println("Product Name:\t" + product_name);
        System.out.println("Product ID:\t" + product_id);
        System.out.println("Product Quantity:\t" + quantity);
        System.out.println("Product Name:\t" + price);
        System.out.println("=====================================");
        System.out.println("State Tax:\t" + shipping_duty);
        return 0;
    }

    public int finalcheckout() {
        System.out.println("Total Price:\t" + (price * quantity) + (shipping_duty));
        return 0;
    }

}

class New_purchase {
    public static void main(String args[]) {
        checkout c = new localvender(12, "Formals", 2, 1000);
        c.purchase();
        c.finalcheckout();

        checkout c2 = new globalvender(18, "Casuals", 2, 1500);
        c2.purchase();
        c2.finalcheckout();

    }
}