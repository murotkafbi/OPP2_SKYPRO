public class Bicycle extends WheeledTransport implements Serviceable {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосепеда");
    }

    @Override
    public void check() {
        updateTyre();

    }
}

