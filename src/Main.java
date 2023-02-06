public class Main {
    public static void main(String[] args) {
        
        Case pcCase = new Case(119.99);
        iComponent cpu = new Cpu(550.00);
        iComponent gpu = new Gpu(560.00);
        MotherBoard motherBoard = new MotherBoard(99.99);
        iComponent networkCard = new NetworkCard(29.99);
        iComponent psu = new Psu(79.99);
        iComponent ram = new Ram(129.99);
        iComponent ssd = new Ssd(99.99);

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(gpu);
        motherBoard.addComponent(networkCard);
        motherBoard.addComponent(ram);
        motherBoard.addComponent(ssd);

        System.out.println(motherBoard.GetPrice());

        pcCase.addComponent(psu);
        pcCase.addComponent(motherBoard);
       
        System.out.println(pcCase.GetPrice());

    }
}