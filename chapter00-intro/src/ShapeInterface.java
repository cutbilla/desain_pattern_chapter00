public interface ShapeInterface {
    double calculateArea();

    void draw();
}

class Rectangle implements ShapeInterface{
    private double panjang;
    private double lebar;

    public Rectangle (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;

    }
    public double calculateArea(){
        return panjang*lebar;
    }
    public void draw(){
        System.out.println("Menggambar sebuah Persegi Panjang");
    }
    public void displayInfo(){
        System.out.println("Panjang dari persegi panjang : " + panjang +"\nLebar dari persegi panjang : "+ lebar);
    }
}
class Circle implements ShapeInterface {
    private double Jari2;

    public Circle(double radius){
        this.Jari2 = radius;
    }

    public double calculateArea(){
        return Math.PI * Jari2 * Jari2;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar sebuah lingkaran");
    }

    public void displayInfo(){
        System.out.println("Jari-jari dari lingkaran : " + Jari2);
    }
}
