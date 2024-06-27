public class unggas {
    public String warna;

    public void berjalan() {
        System.out.println("berjalan");
    }

    public void suara() {
        System.out.println("berkicau");
    }
}
    class BisaTerbang extends unggas {
    public void terbang(){
        System.out.println("terbang tinggi");
    }
}
    class TidakBisaTerbang extends unggas {
    public void terbang(){
        System.out.println("loncat");
    }
}




