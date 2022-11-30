public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours,int hireYear){
         this.name = name;
         this.salary = salary;
         this.workHours = workHours;
         this.hireYear = hireYear;

    }
    double tax(){
        double tax = 0;
        if(this.salary > 10000){
            tax =  -this.salary * 0.03;
        }
        return tax;
    }

    public int bonus( ) {
        if (this.workHours > 40) {
           return (this.workHours-40)*30;
        }
        return 0;
    }
    double raiseSalary() {
        double raise = 0;
        if ((2021 - this.hireYear) > 19){
            raise = this.salary * 0.15;
        }
        if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20){
            raise = this.salary * 0.10;
        }
        else {
            raise = this.salary * 0.09;
        }
        return raise;
    }
    void toPrint() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Weekly hour of work : " + this.workHours);
        System.out.println("Starting date: " + this.hireYear);
        System.out.println("Taxes: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Raise Salary: " + raiseSalary());
        System.out.println("Net Salary: " + (salary + bonus() + raiseSalary()));
        System.out.println("Gross Salary: " + (salary+ bonus()+raiseSalary()+tax()));
        System.out.println("-----------------------------");
    }
}


