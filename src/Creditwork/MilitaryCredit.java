package Creditwork;

public class MilitaryCredit extends BaseCreditManager implements IcredManager {
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandi %10");
    };


}
