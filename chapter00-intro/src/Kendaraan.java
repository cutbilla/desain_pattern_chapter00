public interface Kendaraan {
    void berjalan();

    void berhenti();
}
class Sepeda implements Kendaraan {

    @Override
    public void berjalan() {
        System.out.println("Di kayuh");
    }

    @Override
    public void berhenti() {
        System.out.println("Rem tangan atau berhenti dengan kaki");
    }
}

class SepedaMotor implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Di gas");
    }

    @Override
    public void berhenti() {
        System.out.println("Di rem");
    }

    public void Klakson(){
        System.out.println("bip bip");
    }
}

