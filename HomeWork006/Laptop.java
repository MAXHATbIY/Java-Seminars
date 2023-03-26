// Подумать над структурой класса Ноутбук для магазина техники -
// выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий
// (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев -
// сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие
// по условиям.

package HomeWork006;

import java.util.*;
public class Laptop {
    private int id;
    private String model;
    private int ram;
    private int hdd;
    private String processor;
    private String videoCard;
    private String operatingSystem;
    private Double display;
    private int price;

    public Laptop(int id, String model, int ram, int hdd,
                 String processor, String videoCard, String operatingSystem,
                 Double display, int price) {
                    this.id = id;
                    this.model = model;
                    this.ram = ram;
                    this.hdd = hdd;
                    this.processor = processor;
                    this.videoCard = videoCard;
                    this.operatingSystem = operatingSystem;
                    this.display = display;
                    this.price = price;
                 }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideoCard(){
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Double getDisplay() {
        return display;
    }

    public void setDisplay(Double display) {
        this.display = display;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && ram == laptop.ram && hdd == laptop.hdd
                && Objects.equals(model, laptop.model) && Objects.equals(processor, laptop.processor)
                && Objects.equals(videoCard, laptop.videoCard) && Objects.equals(operatingSystem, laptop.operatingSystem)
                && Objects.equals(display, laptop.display);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, model);
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "id: " + id +
                ", Модель: " + model +
                ", ОЗУ: " + ram +
                ", Объем ЖД: " + hdd +
                ", Процессор: " + processor +
                ", Видеокарта: " + videoCard +
                ", Операционная система: " + operatingSystem +
                ", Дисплей: " + display +
                ", Цена: " + price +
                '}';
    }

    
}
