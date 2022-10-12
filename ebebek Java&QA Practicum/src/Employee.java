public class Employee {
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {

        return this.salary<1000?0:this.salary*0.03;
    }


    public double bonus() {

        double bonus = 0;

        if (workHours > 40) {
            bonus = (this.workHours - 40) * 30;
            return bonus;

        }
        return bonus;
    }

    public double raiseSalary() {

        int year = 2021;
        double rise = 0;

        if (year - this.hireYear < 10) {
            return rise += this.salary * 0.05;
        } else if (year - this.hireYear > 9 && year - this.hireYear < 20) {
            return rise += this.salary * 0.10;
        } else return rise += this.salary * 0.15;
    }

    @Override
    public String toString(){

        double bonusTaxSalary=this.salary+bonus()-tax();
        double totalSalary=this.salary+bonus()+raiseSalary()-tax();

        return "Name: " + this.name + "\nSalary: " + this.salary + "\nWorking hour: " + this.workHours + "\nHire year: "
                + this.hireYear + "\nTax: " + tax() + "\nBonus: " + bonus() + "\nSalary raise: " + raiseSalary() +
                "\nSalary with tax and bonus: " + bonusTaxSalary + "\nTotal salary: " + totalSalary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
