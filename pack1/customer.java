package pack1;

public class customer {
    int customer_id;
    String first_name;
    String last_name;
    int age;
    String email;
    long phone_no;
    String address;

    customer(int customer_id, String first_name,String last_name, long phone_no, int age, String email, String address)
    {
        System.out.println("****Customer Class****");
        this.customer_id=customer_id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.phone_no=phone_no;
        this.age=age;
        this.email=email;
        this.address=address;
    }
    void display()
    {
        System.out.println(" Id "+this.customer_id);
        System.out.println(" First Name : "+this.first_name);
        System.out.println(" Last Name : "+this.last_name);
        System.out.println(" Phone No  : "+this.phone_no);
        System.out.println(" Age :  "+this.age);
        System.out.println(" Email : "+this.email);
        System.out.println(" Address : "+this.address);
    }
    
    // void return_policy (int sales_id)
    // {
    //     if(sales_id == super.sales_id)
    //     {
    //         System.out.println("Product Returned");

    //     }
    //     else
    //     {
    //         System.out.println("Unauthorized Return");
    //     }

    // }
    // void searchByName(String first_name)
    // {
    //     customer customer = map.get(first_name);
    //     System.out.println(customer);
    //     return customer;
    // }
}
