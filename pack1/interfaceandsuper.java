// INHERTANCE AND SUPER

import java.util.*;

// employee attendence, 

interface standard{
    void allotment(double var);
    //void display();
}

interface dis extends standard{
    void fullname(StringBuffer fname, StringBuffer lname);
}

class employee implements dis{
    static int tid;
    int empid;
    String f_name;
    String l_name;
    String empname;
    String dob;
    String empaddress;
    long empphno;
    String email;
    String designation;

    public void fullname(StringBuffer f_name, StringBuffer l_name)
    {
        StringBuffer temp=new StringBuffer(f_name);
        temp.append(" ");
        temp.append(l_name);
        empname=temp.toString();
        System.out.println("Name: "+empname);
    }

    public void allotment(double yes){
        if(yes==1.00)
        tid++;
        empid=tid;
    }

    public void display()
    {
        System.out.println("\nEmployee ID: "+empid+
                            "\nEmployee name: "+empname+
                            "\nAddress: "+empaddress+
                            "\nDesignation: "+designation);  
    }

    public void emailalloc(StringBuffer fname, StringBuffer lname)
    {
        StringBuffer std=new StringBuffer("@indianclothing.in");
        StringBuffer emailtemp = new StringBuffer() ;
        emailtemp.append(fname);
        emailtemp.append(lname);
        emailtemp.append(std);
        email=emailtemp.toString().toLowerCase();
        System.out.println("Email ID: " +email);
    }
}

// inheritance to take employee attributes and calculate emp sal

class empsal extends employee implements standard {
    //int empid;
    //String f_name;
    //String l_name;
    String empname;
    double basic;
    double hra; // 40 percent of base salary
    double special_allowance;
    double da; // 50 percent of basic 
    double gross_sal;
    double pf; //12 percent of base 
    double esic; //below 21000, 0.0075 
    double net; 

    public void allotment(double basic){
        hra=0.40*basic;
        special_allowance=0.10*basic;
        da=0.50*basic;
        pf=0.12*basic;
        if(basic<21000){
        esic=0.0075*basic;
        }
    }


    public void calcgrosssal(double basic, double hra, double special_allowance, double da)
    {
        gross_sal=basic+hra+special_allowance+da;
    }
    public void calcnetsal(double pf, double gross_sal)
    {
        net=gross_sal-(pf);
        //System.out.println("The net salary is: "+net);
    }

    

    public void display(StringBuffer fname, StringBuffer lname)
    {
        super.fullname(fname, lname);
        super.emailalloc(fname, lname);
        System.out.print("\nBasic: "+basic+
                            "\nHRA: "+hra+
                            "\nSpecial Allowance: "+special_allowance+
                            "\nDA: "+da+
                            "\nGross Salary: "+gross_sal+
                            "\nPF: "+pf+
                            "\nNet: "+net);  
    }
    
}
public class interfaceandsuper {

    public static void main(String[] a) {
        System.out.println("\n***********Clothing Management System***********");

        double approval=1.00;

        // calculate salary
        employee emp=new employee(); 
        empsal employ = new empsal();
        

        StringBuffer fname=new StringBuffer("Bhavana");
        StringBuffer lname=new StringBuffer("Chowdhary");



        emp.allotment(approval);
        emp.fullname(fname,lname);
        emp.empaddress = "#4, RK Colony, Bangalore";
        emp.designation = "Manager";
        emp.display();

        //emp.emailalloc(fname,lname);
        employ.basic = 21000;
        employ.allotment(employ.basic);
        employ.calcgrosssal(employ.basic, employ.hra, employ.special_allowance, employ.da);
        employ.calcnetsal(employ.pf, employ.gross_sal);
        employ.display(fname, lname);


    }
}
