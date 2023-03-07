public class ServiceStation {
    public void check (Machine machine) {
        System.out.println("Обслуживаем " + machine.getModelName());
        machine.service();
        System.out.println();
    }
}
