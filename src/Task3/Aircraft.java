package Task3;
public class Aircraft {
    private String model;
    private int capacity;

    public Aircraft(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    // Методи для редагування даних про літака
    public void editModel(String newModel) {
        this.model = newModel;
    }

    public void editCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }

    public String getModel() {
        return this.model;
    }
    public int getCapacity() {
        return this.capacity;
    }

    // Інші методи та геттери/сеттери, які можуть бути потрібні
}
