public class Car {
    String model;
    String type;
    String color;
    float volume;

    void printInfo() {
        System.out.printf("Марка: %s\n" + "Модель: %s\n" + "Цвет: %s\n" + "Объем двигателя: %.1f\n", model, type, color, volume);
    }

}
