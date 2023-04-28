public class Paallikko implements SalaryChain{
        private SalaryChain nextChain;

        @Override
        public void setNextChain(SalaryChain nextChain) {
            this.nextChain = nextChain;
        }

        @Override
        public void raiseSalary(Salary salary) {
            double maxRaise = salary.getSalaryAmnt() + (salary.getSalaryAmnt() * 0.05);
            double minRaise = salary.getSalaryAmnt() + (salary.getSalaryAmnt() * 0.02);
            double raise = salary.getSalaryAmnt() + (salary.getSalaryAmnt() * salary.getRaise());
            if (raise < maxRaise && raise > minRaise){
                salary.setNewSalaryAmnt(raise);
                System.out.println("The raise was approved by Päällikkö, new salary: " + raise);
            } else {
                nextChain.raiseSalary(salary);
            }
        }
    }
