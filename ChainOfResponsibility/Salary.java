public class Salary {
    private double salaryAmnt;
    private double raise;

    public Salary(double salaryAmnt, double raise){
        this.salaryAmnt = salaryAmnt;
        this.raise = raise;
    }
    public double getSalaryAmnt(){
        return this.salaryAmnt;
    }
    public double getRaise(){
        return this.raise;
    }
    public double setNewSalaryAmnt(double newSalary){
        salaryAmnt = newSalary;
        return newSalary;
    }
}
