public class Employee {
	
	String name;
	int salary;
	int workHours;
	int hireYear;
	int toplam;
	
	Employee(String name,int salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		this.toplam=1;
	}
	
	double tax() {
		if(salary<1000) {
			return 0;
		}else {
			return salary*0.03;
		}
	}
	
	double bonus() {
		if(workHours>40) {
			return ((workHours-40)*30);
		}else {
			return 0;
		}
	}
	
	double raiseSalary() {
		int a=2021-hireYear;
		
		if(a<10) {
			return this.salary*0.05;
		}else if(a>9 && a<20) {
			return this.salary*0.1;
		}else if(a>19) {
			return this.salary*0.15;
		}else {
			return this.salary;
		}
		
	}
	
	public String toString(){
		
		System.out.println("Ad�: "+this.name);
        System.out.println("Maa��: "+this.salary);
        System.out.println("Haftal�k �al��ma Saati: "+this.workHours);
        System.out.println("��e Ba�lang�� Y�l�: "+this.hireYear);
        System.out.println("Vergiler: "+tax());
        System.out.println("Primler: "+bonus());
        System.out.println("Maa� Art���: "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile maa�: "+(this.salary-tax()+bonus()));
        System.out.println("Toplam maa�: "+(this.salary-tax()+bonus()+raiseSalary()));
        System.out.println("***************************************************");
		return "";
        		
	}
}
