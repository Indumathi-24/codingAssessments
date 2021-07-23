package com.revature;
class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	Employee() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeApp {

	
	Employee getEmployeeInfo(String str) {
		

 /*  given string    -   "abc@4356-uuuii#98000"   ;
    name =abc,  ssn=4326,  dept=uuuii, sal=98
    Cretae Employee Object with above details and return MEployee Object*/
               
               String n1=new String();
               String  ss=new String();
               String d1=new String();
               String sal=new String();
               int a=str.indexOf("@");
               n1=str.substring(0, a);
               int b=str.indexOf("-");
               ss=str.substring(a+1, b);
               int c=str.indexOf("#");
               d1=str.substring(b+1, c);
               int d=str.indexOf("-");
               sal=str.substring(c+1);
               int amount=Integer.parseInt(sal);
               Employee e1=new Employee();
				e1.name=n1;
				e1.dept=d1;
				e1.ssn=ss;
				e1.salary=amount;
				return e1;
				
}
	
	String getEmployeeLevel(Employee e) {

/* 
    in a given employee if ssn is - 1 to 10 employee level is L1
if ssn is - 61 to 120 employee level is L2
if ssn is - 121 to 180 employee level is L3
else L4
rteurn the given level"
        
*/      
		String level=null;
		int no=Integer.parseInt(e.ssn);
        if(no>=1 && no<=10) {
        	level= "L1";
        }
        else if(no>=61 && no<=120) {
        	level= "L2";
        }
        else if(no>=121 && no<=180) {
        	level= "L3";
        }
        else {
        	level= "L4";
        }
		return level;	
	}
	public static void main(String[] args) {
		EmployeeApp e=new EmployeeApp();
		System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println(e.getEmployeeLevel(new Employee("abc","4356","uuuii",9889)));
		
	}
}
 

