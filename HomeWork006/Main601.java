package HomeWork006;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main601 {
    public static void main(String[] args) throws Exception {

        Laptop laptop1 = new Laptop(1, "HUAWEI", 8, 1024, "Intel", "Intel iRISxe",
                "Windows 11", 16.1, 65000);
        Laptop laptop2 = new Laptop(2, "HP", 2, 1024, "Intel", "nvidea 2060",
                "Windows 11", 17.6, 85000);
        Laptop laptop3 = new Laptop(3, "Lenovo", 4, 512, "AMD", "-",
                "без ОС", 14.0, 38000);
        Laptop laptop4 = new Laptop(4, "ИРБИС", 2, 256, "Эльбрус", "-",
                "БазАльт", 16.4, 89000);
        Laptop laptop5 = new Laptop(5, "Macbook", 16, 2048, "Intel Core i5", "-",
                "Mac Oc", 16.0, 135000);
        Laptop laptop6 = new Laptop(6, "Flaptop", 4, 1024, "Intel Core i5", "Intel UHD",
                "Windows 11", 15.5, 46000);
        Laptop laptop7 = laptop4;

        Set<Laptop> unicLaptop = new HashSet<Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
        unicLaptop.add(laptop6);
        unicLaptop.add(laptop7);
        System.out.println(laptop1.equals(laptop6));
        System.out.printf("Уникалных ноутбуков: %d \n", unicLaptop.size());


        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "Модель");
        mapCrit.put(2, "ОЗУ");
        mapCrit.put(3, "Объем ЖД");
        mapCrit.put(4, "Процессор");
        mapCrit.put(5, "Видеокарта");
        mapCrit.put(6, "Операционная система");
        mapCrit.put(7, "Дисплей");
        mapCrit.put(8, "Цена");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: \n 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("Объем ЖД: ");
        int storUser = sc.nextInt();
        System.out.println("Цена");
        int priceUser = sc.nextInt();

        for(Laptop lap: unicLaptop) {
                if ((lap.getRam() >= ramUser) && (lap.getHdd() >= storUser)  && lap.getPrice() >= priceUser) {
                System.out.println(lap.toString());
                }
        }
        sc.close();
        }
}
