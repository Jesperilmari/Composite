public interface SalaryChain {
    void setNextChain(SalaryChain nextChain);

    void raiseSalary(Salary salary);
}
