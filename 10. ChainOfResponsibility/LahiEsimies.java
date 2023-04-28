public class LahiEsimies implements SalaryChain{
    private SalaryChain nextChain;

    @Override
    public void setNextChain(SalaryChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void raiseSalary(Salary salary) {
        double maxRaise = salary.getSalaryAmnt() + (salary.getSalaryAmnt() * 0.02);
        double raise = salary.getSalaryAmnt() + (salary.getSalaryAmnt() * salary.getRaise());
        if (raise <= maxRaise){
            salary.setNewSalaryAmnt(raise);
            System.out.println("The raise was approved by Lähiesimies, new salary: " + raise);
        } else {
             nextChain.raiseSalary(salary);
        }
    }
}
