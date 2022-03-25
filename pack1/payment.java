package pack1;

public class payment {
    int payment_id;
        int customer_id;
        String payment_methods;
        String invoice;
        double paymentAmount;
        String payment_date;
        double amount;
    
        public payment()
        {
        amount = 0.0;
        }
    
        payment(double paymentAmount)
        {
        amount = paymentAmount;
        }
        
        public void setPayment(double paymentAmount)
        {
        amount = paymentAmount;
        }
       
        public double getPayment()
        {
        return amount;
        }
        
        public void paymentDetails()
        {
        System.out.println("The payment amount is " + amount);
        }
    
        public void makePayment(String username, String password){
            //Making Payment through Internet Banking
            if (username == "bhavana123" && password == "christ123")
            {
                System.out.println("Payment Succesfull through internet banking");
            }
            else
            {
                System.out.println("Enter a valid username and password");
            }
          }
        public void makePayment(long mobileNumber, int password){
            //Making Payment through any UPI support App(Paytm, Google Pay etc)
            if (mobileNumber == 98998989 && password==1234)
            {
                System.out.println("Payment Succesfull through UPI support");
            }
            else
            {
                System.out.println("Enter a mobile number and password");
            }
          }  
        public void makePayment(long cardNumber, int cvv, String name,
                              String expireDate){
            //Making Payment through Credit or Debit Card
            if (cardNumber == 1232222222 && cvv == 566 && name == "bhavana" && expireDate == "21/8/2022")
            {
                System.out.println("Payment Succesfull through credit or debit card");
            }
            else
            {
                System.out.println("Enter valid card details");
            }
          }  
    
    }

