public class Laptop {
    String trademark;
    double diagonal;
    String yearRelease;
    int RAM;
    int hardDrive;
    String OS;
    int serialNumber;
    int price;

    public Laptop(String trademark, String OS, int serialNumber, int price){
        this.trademark = trademark;
        this.OS = OS;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String toString(){
        return "trademark = " + trademark + " OS = " + OS + " serialNumber = "
                + serialNumber + " price = " + price + " ||||||||||||| ";
    }

    public boolean equals(Object laptop){
        Laptop newlaptop = (Laptop) laptop;
        return this.trademark.equals(newlaptop.trademark) && this.price == newlaptop.price;
    }

    public int hashCode(){
        return (int) (this.trademark.hashCode() + this.RAM + this.diagonal + this.hardDrive + this.price);
    }
}

