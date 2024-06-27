//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        // program unggas.java
        unggas dara = new unggas();
        System.out.println("dara");
        dara.warna = "putih";
        System.out.println("dara bewarna : " + dara.warna);
        dara.suara();
        dara.berjalan();

        System.out.printf("\n");

        BisaTerbang merpati = new BisaTerbang();
        System.out.println("merpati");
        merpati.warna = "abu";
        System.out.println("merpati bewarna : " + merpati.warna);
        merpati.terbang();
        merpati.suara();

        System.out.printf("\n");

        TidakBisaTerbang puyuh = new TidakBisaTerbang();
        System.out.println("puyuh");
        puyuh.warna = "coklat";
        System.out.println("puyuh bewarna : " + puyuh.warna);
        puyuh.terbang();
        puyuh.berjalan();

        System.out.println("--------------------------");
        System.out.printf("\n \n");

        //program user.java
        Mhs mahasiswa1 = new Mhs();
        mahasiswa1.nama = "Billa";
        mahasiswa1.alamat = "Lhokseumawe";
        mahasiswa1.email = "cutbilla@gmail.com";
        mahasiswa1.jenis_kelamin = "Perempuan";
        mahasiswa1.nim = "2022573010085";

        Dosen dosen1 = new Dosen();
        dosen1.nama = "Reza Zulman";
        dosen1.alamat = "Lhokseumawe";
        dosen1.email = "reza@gmail.com";
        dosen1.jenis_kelamin = "Laki-Laki";
        dosen1.nip = "123456789";

        System.out.println("Nama Mahasiswa : "+mahasiswa1.nama+"\nNIM Mahasiswa : "+mahasiswa1.nim+"\nAlamat : " +mahasiswa1.alamat+
                            "\nEmail : "+mahasiswa1.email+"\nJenis Kelamin : "+mahasiswa1.jenis_kelamin);

        System.out.printf("\n");

        System.out.println("Nama Dosen : "+dosen1.nama+"\nNIP Dosen : "+dosen1.nip+"\nAlamat : " +dosen1.alamat+
                "\nEmail : "+dosen1.email+"\nJenis Kelamin : "+dosen1.jenis_kelamin);

        System.out.println("--------------------------");
        System.out.printf("\n \n");

        //program interface Kendaraan.java, Sepeda.java, dan SepedaMotor.java
        Sepeda sepeda1 = new Sepeda();
        System.out.println("Sepeda");
        sepeda1.berjalan();
        sepeda1.berhenti();

        System.out.printf("\n");

        SepedaMotor sepedaMotor1 = new SepedaMotor();
        System.out.println("Sepeda motor");
        sepedaMotor1.berjalan();
        sepedaMotor1.berhenti();
        sepedaMotor1.Klakson();

        System.out.println("--------------------------");
        System.out.printf("\n \n");

        //program abstract employee.java
        NewEmployee karyawan1 = new NewEmployee();
        karyawan1.PrintInfo();
        karyawan1.CompanyInfo();

        System.out.printf("\n");

        OldEmployee karyawan2 = new OldEmployee();
        karyawan2.PrintInfo();
        karyawan2.CompanyInfo();

        System.out.println("--------------------------");
        System.out.printf("\n \n");

        //program abstract ShapeAbstract.java
        ShapeAbstract bulat = new Lingkaran(2);
        PersegiPanjang pp = new PersegiPanjang(2,5);
        System.out.println("Luas Persegi Panjang : "+ pp.calculateArea());
        pp.draw();
        System.out.printf("\n");
        System.out.println("Luas Lingkaran : "+ bulat.calculateArea());
        bulat.draw();

        System.out.println("--------------------------");
        System.out.printf("\n \n");

        //program abstract ShapeInterface.java
        Circle bulat2 = new Circle(2);
        Rectangle pp2 = new Rectangle(2,5);
        System.out.println("Luas Lingkaran : "+ bulat2.calculateArea());
        bulat2.displayInfo();
        bulat2.draw();
        System.out.printf("\n");
        System.out.println("Luas Persegi Panjang : "+ pp2.calculateArea());
        pp2.displayInfo();
        pp2.draw();

        System.out.println("--------------------------");
        System.out.printf("\n \n");

        // Buat objek-objek strategi pembayaran
        PaymentStrategy creditCardPayment = new CreditCard();
        PaymentStrategy paypalPayment = new PayPal();
        PaymentStrategy bankTransferPayment = new BankTransfer();

        // Buat objek keranjang belanja dengan strategi pembayaran yang berbeda-beda
        ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
        ShoppingCart cart2 = new ShoppingCart(paypalPayment);
        ShoppingCart cart3 = new ShoppingCart(bankTransferPayment);

        // Lakukan checkout untuk setiap keranjang belanja
        cart1.checkout(100);
        cart2.checkout(200);
        cart3.checkout(300);
    }
}
