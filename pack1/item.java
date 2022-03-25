package pack1;

public class item {
    int item_id;
    String item_name;
    String item_description;;
    String item_type;
    String item_price;
    String item_availability;
    String item_supplier;

    item(int item_id, String item_name,String item_description, String item_type, String item_price, String item_availability, String item_supplier)
    {
        System.out.println("****Item Class****");
        this.item_id=item_id;
        this.item_name=item_name;
        this.item_description=item_description;
        this.item_type=item_type;
        this.item_price=item_price;
        this.item_availability=item_availability;
    }
    void display()
    {
        System.out.println(" Id "+this.item_id);
        System.out.println(" Item Name : "+this.item_name);
        System.out.println(" Description : "+this.item_description);
        System.out.println(" Type  : "+this.item_type);
    }
}
