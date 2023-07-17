import java.util.Random;

public class Ogrenci {

    private int no;
    private String isim;
    private String soyisim;
    private String sınıf;
    private double not1, not2, not3;

    public Ogrenci(String isim, String soyisim){
        this.isim = isim;
        this.soyisim = soyisim;

        Random random = new Random();
        int randomNumber = random.nextInt(1000) + 1;
        this.no = randomNumber;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    public void setNot(double not1) {
        this.not1 = not1;
    }

    public void setNot(double not1, double not2) {
        this.not1 = not1;
        this.not2 = not2;
    }

    public void setNot(double not1, double not2, double not3) {
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }

    public int getNo() {
        return no;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public String getSınıf() {
        return sınıf;
    }

    public double getNot1() {
        return not1;
    }

    public double getNot2() {
        return not2;
    }

    public double getNot3() {
        return not3;
    }
}
