abstract class ShapeAbstract{
    abstract double calculateArea();

    void draw(){
        System.out.println("Menggambar suatu bentuk");
    }
}

class PersegiPanjang extends ShapeAbstract{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar  = lebar;
    }

    public double calculateArea(){
        return panjang*lebar;
    }

    public void displayInfo(){
        System.out.println("Panjang dari persegi panjang : " + panjang +"\nLebar dari persegi panjang : "+ lebar);
    }
}

class Lingkaran extends ShapeAbstract{
    private double Jari2;

    public Lingkaran(double radius){
        this.Jari2 = radius;
    }

    public double calculateArea(){
        return Math.PI * Jari2 * Jari2;
    }
    public void displayInfo(){
        System.out.println("Jari-jari dari lingkaran : " + Jari2);
    }
}
