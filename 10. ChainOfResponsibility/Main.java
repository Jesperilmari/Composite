public class Main {
    public static void main(String[] args) {
        SalaryChain salary1 = new LahiEsimies();
        SalaryChain salary2 = new Paallikko();
        SalaryChain salary3 = new ToimitusJohtaja();

        salary1.setNextChain(salary2);
        salary2.setNextChain(salary3);

        Salary salary = new Salary(500, 0.02);
        salary1.raiseSalary(salary);
    }
}
