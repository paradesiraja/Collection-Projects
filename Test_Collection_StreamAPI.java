package raja;
import java.util.*;
import java.util.stream.Collectors;
public class Test_Collection_StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Employee> al=new ArrayList<>();
 
          al.add(new Employee(101,"Raja","Infosys",5000));
          al.add(new Employee(102,"Brahma","TechMahindra",10000));
          al.add(new Employee(103,"Jaggu","TCS",20000));
          al.add(new Employee(104,"Anand","Capgemini",25000));
          System.out.println(al);
          
  // #1:       
         /* al.stream()
          .forEach(System.out::print);
          System.out.println();*/
    //#2:
          al.stream()
          .filter(ele->ele.getEmp_Name().toUpperCase().startsWith("A"))
          .forEach(System.out::print);
          System.out.println();
    //#3:
          al.stream()
          .filter(ele->ele.getCompany().toLowerCase().startsWith("i"))
          .forEach(System.out::print);
          System.out.println();
    //#4:
          al.stream()
          .filter(ele->ele.getEmp_Salary()>=20000)
          .forEach(System.out::print);
          System.out.println();
     //#5:
          boolean anyMatch=al.stream()
        		  .anyMatch(ele->ele.getEmp_Salary()>20000);
        		  if(anyMatch)
        			  System.out.println("\nEmployee is Found");
        		  else
        			  System.out.println("Employee not found");
          System.out.println();
     //#6:
          boolean allMatch=al.stream()
        		  .allMatch(ele->ele.getEmp_Salary()>15000);
          if(allMatch)
			  System.out.println("\nEmployee is Found");
		  else
			  System.out.println("Employee not found");
  System.out.println();
  //#7:
            al.stream()
            .map(ele->ele.getEmp_ID())
            .forEach(System.out::println);
            System.out.println();
  //#8:
            List<Double> SalaryList=al.stream()
            		.map(ele->ele.getEmp_Salary())
            		.collect(Collectors.toList());
            System.out.println(SalaryList);
            		System.out.println();
            		
            		al.stream()
            		.filter(ele->ele.getEmp_Salary()<20000)
            		.forEach(System.out::print);
            		System.out.println();
            		
            		
            		al.stream()
            		.map(ele->ele.getEmp_Salary())
            		.forEach(System.out::println);
            		
	}

}
