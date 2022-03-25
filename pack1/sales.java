package pack1;

public class sales {
    int sales_id;
    String sales_amount;
    String sales_type;
    String sales_description;
    int sales_customer_id;
    int sales_date;

    sales(int sales_id, String sales_amount,String sales_type, String sales_description, int sales_date)
    {
        System.out.println("****Sales Class****");
        this.sales_id=sales_id;
        this.sales_description=sales_description;
        this.sales_type=sales_type;
        this.sales_date=sales_date;
    }
    void display()
    {
        System.out.println(" Id "+this.sales_id);
        System.out.println(" Description : "+this.sales_description);
        System.out.println(" Type  : "+this.sales_type);
    }
}
