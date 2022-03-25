
import pack1.*;
public class jproject{
    public static void main(String[] args) 
    {
        // employee class
        employee emp1 = new employee();
        emp1.basicsalary=50000;
        emp1.bonus=2000;
        emp1.calculate(emp1.basicsalary, emp1.bonus);
        emp1.calculate(emp1.basicsalary, emp1.DA, emp1.HRA);
        emp1.calculate(emp1.incometax, emp1.GS);
        emp1.print_salary(emp1.basicsalary);
        emp1.print_salary(emp1.basicsalary, emp1.bonus);

        // payment class
        payment pay = new payment();
        pay.makePayment("bhavana", "christ123");
        pay.makePayment(98998989, 1234);
        pay.makePayment(1232222222, 566, "bhavana", "21/8/2022");
        

        // cart class
        cart cart1 = new cart();
        cart cart2 = new cart("Shirts",200);
        cart cart3 = new cart("Pants", 300, 6);

    }
}