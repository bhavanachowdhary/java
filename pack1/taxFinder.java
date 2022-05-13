// COMMAND LINE ARGUMENT AND THIS OPERATOR

class taxFinder {
    float VAT_price = 0.12f;
    float Sales_tax = 0.06f;
    String product;
    String category;
    float price;

    taxFinder(String product, String category, String price) {
        this.product = product;
        this.category = category;
        this.price = Float.parseFloat(price);
    }

    float taxer() {
        return (Sales_tax + VAT_price);
    }

    int display() {
        System.out.println("===========================================");
        System.out.println("Tax Details");
        System.out.println("===========================================");
        System.out.println("Product Name:\t" + product);
        System.out.println("Product Category:\t" + category);
        System.out.println("Product Price:\t" + price);
        System.out.println("Current VAT price:\t" + VAT_price);
        System.out.println("Current Sales Tax:\t" + Sales_tax);
        price = price + price * taxer();
        System.out.println("===========================================");
        System.out.println("Final Product Price:\t" + price);
        System.out.println("===========================================");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("Calculating Taxes");
        System.out.println("===========================================");
        System.out.println("Product Name:\t" + args[0]);
        System.out.println("Product Category:\t" + args[1]);
        System.out.println("Product Price:\t" + args[2]);
        taxFinder tf = new taxFinder(args[0], args[1], args[2]);
        tf.display();
    }
}