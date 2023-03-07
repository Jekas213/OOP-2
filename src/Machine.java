public class Machine {
    private String modelName;
    private int wheelsCount;

    public Machine(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку: " + wheelsCount + " штук(и)");
    }

    public void service (){
        updateTyre();
    }
}
