import java.util.HashSet;
import java.util.Set;

public class task_1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("LG", "Windows", 121236, 1000);
        System.out.println(laptop1);
        laptop1.diagonal = 13;
        System.out.println(laptop1.diagonal);
        laptop1.RAM = 10;
        laptop1.hardDrive = 1000;
        laptop1.diagonal = 14.8;
        Laptop laptop2 = new Laptop("apple", "IOS", 121386, 10000);
        laptop2.RAM = 10;
        laptop2.hardDrive = 1000;
        laptop2.diagonal = 14.8;
        Laptop laptop3 = new Laptop("Samsung", "Windows", 521206, 990);
        laptop3.RAM = 10;
        laptop3.hardDrive = 1000;
        laptop3.diagonal = 14.8;
        Laptop laptop4 = new Laptop("LG", "Windows", 121236, 1000);
        laptop4.RAM = 10;
        laptop4.hardDrive = 1000;
        laptop4.diagonal = 14.8;
        Laptop laptop5 = new Laptop("apple", "IOS", 121386, 10000);
        laptop5.RAM = 10;
        laptop5.hardDrive = 1000;
        laptop5.diagonal = 14.8;
        Laptop laptop6 = new Laptop("не знаю", "Окно", 121236, 1200);
        laptop6.RAM = 10;
        laptop6.hardDrive = 1000;
        laptop6.diagonal = 14.8;
        Laptop laptop7 = new Laptop("lenovo", "linux", 126757636, 2500);
        laptop7.RAM = 10;
        laptop7.hardDrive = 1000;
        laptop7.diagonal = 14.8;

        Set<Laptop> data = new HashSet<>();
        data.add(laptop1);
        data.add(laptop2);
        data.add(laptop3);
        data.add(laptop4);
        data.add(laptop5);
        data.add(laptop6);
        data.add(laptop7);

        System.out.println(data);
    }
}
