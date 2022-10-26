package Creditwork;

public abstract class BaseCreditManager implements IcredManager {
    @Override
    public void calculate() {};

    @Override
    public void save() {
        System.out.println("Kredi Kydeildi");

    }
}
