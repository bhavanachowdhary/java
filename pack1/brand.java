package pack1;

public class brand {
    int brand_id;
    String brand_name;
    String brand_description;
    String brand_company;
    int brand_sales;
    int brand_revenue;

    brand(int brand_id, String brand_name,String brand_description, String brand_company, int brand_sales, int brand_revenue)
    {
        System.out.println("****Brand Class****");
        this.brand_id=brand_id;
        this.brand_name=brand_name;
        this.brand_description=brand_description;
        this.brand_company=brand_company;
    }
    void display()
    {
        System.out.println(" Id "+this.brand_id);
        System.out.println(" Brand Name : "+this.brand_name);
        System.out.println(" Description : "+this.brand_description);
        System.out.println(" company : "+this.brand_company);
    }
}
