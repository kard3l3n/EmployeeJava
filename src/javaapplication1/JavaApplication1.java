package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Employee name:");
        Scanner nameSrc= new Scanner(System.in); 
        String name=nameSrc.nextLine();
        
        System.out.println("Employee salary:");
        Scanner salarySrc= new Scanner(System.in); 
        double salary=salarySrc.nextDouble();
        
        System.out.println("Employee work hour:");
        Scanner workHourSrc= new Scanner(System.in); 
        int workHour=workHourSrc.nextInt();
        
        System.out.println("Employee hire year:");
        Scanner hireYearSrc= new Scanner(System.in); 
        int hireYear=hireYearSrc.nextInt();
        
        
        
        System.out.println("*************************");
        
        
        
        
        Employee employee1=new Employee(name,salary,workHour,hireYear);
        employee1.raiseSalary();
        System.out.println(employee1.toString());
    }
    
}
