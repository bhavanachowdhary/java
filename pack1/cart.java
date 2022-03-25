package pack1;

public class cart {
    public String itemName;
    public double itemPrice;
    public int itemQuantity;

    public cart() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
        System.out.println("Cart items with no parameters:" +" " +  "itemname:"+ itemName + " " +"itemprice:"+  itemPrice + " " +"itemquantity:"+ itemQuantity);
      }

    public cart(String name, double price){
        itemName=name;
        itemPrice=price;
        itemQuantity=0;
        System.out.println("Cart items with two parameters:" + " " +  "itemname:"+ itemName + " " +"itemprice:"+  itemPrice + " " +"itemquantity:"+ itemQuantity);


    }
    public cart(String name, double price, int quantity){
        itemName=name;
        itemPrice=price*quantity;
        itemQuantity=quantity;
        System.out.println("Cart items with three parameters:" + " " +  "itemname:"+ itemName + " " +"itemprice:"+  itemPrice + " " +"itemquantity:"+ itemQuantity);


    }
      
    //   public void setName(String name) {
    //     itemName = name;
        
    //   }
      
    //   public void setPrice(int price) {
    //      itemPrice = 0;
         
    //   }
      
    //   public void setQuantity (int quantity) {
    //      itemQuantity = 0;
    //      ;      
    //   }
      
    //   public String getName() {
    //      return itemName;
    //   }
      
    //   public int getPrice() {
    //      return itemPrice;
    //   }
      
    //   public int getQuantity() {
    //       return itemQuantity;
    //   }
      
    //   public void printItemPurchase() {
    //     System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  " = $" + (itemPrice * itemQuantity));
    //   }
    //   }
}
