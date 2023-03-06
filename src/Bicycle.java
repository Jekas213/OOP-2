public class Bicycle extends Machine implements ServiceStation {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void serviceStation() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
    }
}