public class ToimitusJohtaja implements SalaryChain{
        private SalaryChain nextChain;

        @Override
        public void setNextChain(SalaryChain nextChain) {
            this.nextChain = nextChain;
        }

        @Override
        public void raiseSalary(Salary salary) {
            double minRaise = salary.getSalaryAmnt() + (salary.getSalaryAmnt() * 0.05);
            double raise = salary.getSalaryAmnt() + (salary.getSalaryAmnt() * salary.getRaise());
            if (raise >= minRaise){
                salary.setNewSalaryAmnt(raise);
                System.out.println("The raise was approved by Toimitusjohtaja, new salary: " + raise);
            } else {
                nextChain.raiseSalary(salary);
            }
        }
    }
