abstract class Employee {
    abstract void PrintInfo();

    void CompanyInfo(){
        System.out.println("employee of Billa Company");
    }
}

class NewEmployee extends Employee{
    @Override
    void PrintInfo() {
        String nama = "Cut Billa";
        int umur = 20;
        String gaji = "200 juta";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(gaji);
    }
}

class OldEmployee extends Employee{
    @Override
    void PrintInfo() {
        String nama = "Salsa";
        int umur = 25;
        String gaji = "500 juta";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(gaji);
    }
}

