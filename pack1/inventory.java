package pack1;

public class inventory {
    int inventory_id;
    int inventory_quantity;

    inventory(int inventory_id, int inventory_quantity)
    {
        System.out.println("****Inventory Class****");
        this.inventory_id=inventory_id;
        this.inventory_quantity=inventory_quantity;
    }
    void display()
    {
        System.out.println(" Id "+this.inventory_id);
        System.out.println(" Quantity : "+this.inventory_quantity);
    }
}
