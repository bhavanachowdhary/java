package pack1;

public class category {
    int category_id;
    String category_type;

    category(int category_id, String category_type)
    {
        System.out.println("****Category Class****");
        this.category_id=category_id;
        this.category_type=category_type;
    }
    void display()
    {
        System.out.println(" Id "+this.category_id);
        System.out.println(" Type : "+this.category_type);
    }
}
