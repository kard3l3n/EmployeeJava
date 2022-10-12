package javaapplication1;

public class Employee {
    
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
    this.name=name;
    this.salary=salary;
    this.workHours=workHours;
    this.hireYear=hireYear;

    }
    public double tax(){
	if(salary<1000){
            System.out.println("1000 tl'den aşağısına vergi uygulanamaz");
        }
	else if(salary>1000){
		salary+=salary*(3/100);

	}
        return salary;

    }
    public double bonus(){
        if(workHours>40){
            int bonusHours;
            bonusHours=workHours-40;
            salary+=bonusHours*30;
            
        }
        else{
            System.out.println("fazla çalışmadığınız için ücret ödenmeyecektir");
            
            
        }
        return salary;
    }
        
    public double raiseSalary(){
	int thisYear=2021;
	this.tax();
        this.bonus();
	if((thisYear-hireYear)<10){
		salary=salary+(salary*(5))/100;
	}
        else if((thisYear-hireYear)>9 && (thisYear-hireYear)<20){
		salary=salary+(salary*(10))/100;
	}
        else if((thisYear-hireYear)>19){
		salary=salary+(salary*(15))/100;
                
	}
       
	return salary;
    }
    
    public String toString(){
        String deger="Employee name:"+name+" \n"+"Salary:"+salary+"\n"+"Work Hours:"+workHours+"\n"+"Hire Year:"+hireYear;
        return deger;

    }

    
}
