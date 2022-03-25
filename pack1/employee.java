package pack1;

public class employee {
        public int employee_id;
        public String first_name;
        public String last_name;
        public String designation;
        public int age;
        public String email;
        public long phone_no;
        public String address;
        public int basicsalary;
        public float DA;
        public float HRA;
        public float incometax;
        public float GS;
        public double bonus;
    
    
        /*employee(int employee_id, String first_name,String last_name,String designation, long phone_no, int age, String email, String address)
        {
            System.out.println("****Employee Class****");
            // this.employee_id=employee_id;
            // this.first_name=first_name;
            // this.last_name=last_name;
            // this.phone_no=phone_no;
            // this.age=age;
            // this.email=email;
            // this.address=address;
            // this.designation=designation;
        }
    
        void display()
        {
            // System.out.println(" Id "+this.employee_id);
            // System.out.println(" First Name : "+this.first_name);
            // System.out.println(" Last Name : "+this.last_name);
            // System.out.println(" Phone No  : "+this.phone_no);
            // System.out.println(" Age :  "+this.age);
            // System.out.println(" Email : "+this.email);
            // System.out.println(" Address : "+this.address);
            // System.out.println(" Designation : "+this.designation);
        }*/
    
        public void calculate(int basicsalary, Double bonus)  //calculating all the parameters
         {
            float HRA=(float) ((0.1)*basicsalary);
            float DA= (float)((0.73)*basicsalary);
            System.out.println("HRA:"+ HRA);
            System.out.println("DA:"+ DA);
            System.out.println("Bonus:"+ bonus);
         }
    
         public void calculate(int basicsalary, float DA, float HRA)
         {
            float GS=basicsalary+DA+HRA;
            float incometax=(float) (0.3*GS);
            System.out.println("GS:"+ GS);
            System.out.println("Income tax:"+ incometax);
         }
    
         public void calculate(float incometax, float GS)
         {
            float netsalary=(GS-incometax);
            System.out.println("Net salary:"+ netsalary);
         }
    
         public void print_salary(int basicsalary)
         {
             System.out.println("Salary without bonus:" + basicsalary);
         }
    
         public void print_salary(int basicsalary,double bonus)
         {
             System.out.println("Salary with bonus:" + (basicsalary+bonus));
         }
    
    }

