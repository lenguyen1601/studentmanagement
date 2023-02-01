
import java.io.Serializable;
import java.util.Scanner;

public class Diem implements Serializable{
    private String ten_sv;
    private double diemchuyencann;
    private double diemgiuaky;
    private double diemcuoiky;
    private String ma_sv;

    static Scanner sc=new Scanner(System.in);

    public Diem() {
    }

    public Diem(double diemchuyencann, double diemgiuaky, double diemcuoiky) {
        this.diemchuyencann = diemchuyencann;
        this.diemgiuaky = diemgiuaky;
        this.diemcuoiky = diemcuoiky;
    }

    public double getDiemchuyencann() {
        return diemchuyencann;
    }

    public void setDiemchuyencann(double diemchuyencann) {
        if(diemchuyencann>10||diemchuyencann<0)
            diemchuyencann=0;
        this.diemchuyencann = diemchuyencann;
    }

    public double getDiemgiuaky() {
        return diemgiuaky;
    }

    public void setDiemgiuaky(double diemgiuaky) {
        if(diemgiuaky<0||diemgiuaky>10)
            diemgiuaky=0;
        this.diemgiuaky = diemgiuaky;
    }

    public double getDiemcuoiky() {
        return diemcuoiky;
    }

    public void setDiemcuoiky(double diemcuoiky) {
        if(diemcuoiky<0||diemcuoiky>10)
            diemcuoiky=0;
        this.diemcuoiky = diemcuoiky;
    }

    public String getTen_sv() {
        return ten_sv;
    }

    public void setTen_sv(String ten_sv) {
        this.ten_sv = ten_sv;
    }

    public String getMa_sv() {
        return ma_sv;
    }

    public void setMa_sv(String ma_sv) {
        this.ma_sv = ma_sv;
    }

    public void nhap()
    {
        int luachon=0;
        while (true)
        {
            System.out.println("\n1. Nhập điểm chuyên cần. ");
            System.out.println("2. Nhập điểm giữa kì. ");
            System.out.println("3. Nhập điểm cuối kì. ");
            System.out.println("0. Thoát nhập điểm.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            switch (luachon)
            {
                case 1:
                    System.out.print("Nhập điểm chuyên cần: ");
                    diemchuyencann=sc.nextDouble();
                    if(diemchuyencann>10||diemchuyencann<0)
                    diemchuyencann=0;
                    break;
                case 2:
                    System.out.println("Nhập điểm giữa kì: ");
                    diemgiuaky=sc.nextDouble();
                    if(diemgiuaky<0||diemgiuaky>10)
                        diemgiuaky=0;
                    break;
                case 3:
                    System.out.print("Nhập điểm cuối kì: ");
                    diemcuoiky=sc.nextDouble();
                    if(diemcuoiky<0||diemcuoiky>10)
                        diemcuoiky=0;
                    break;
                default:
                    System.out.println("Xin vui lòng nhập lại sự lựa chọn");
            }
        }
    }
    public double getDiemheso10()
    {
        return getDiemchuyencann()*0.2+getDiemgiuaky()*0.3+getDiemcuoiky()*0.5;
    }
    public String getDiemheso4()
    {
        String s = "";
        if(getDiemheso10()<4)
            s="F";
        else
        if(getDiemheso10()<5)
            s="D";
        else
        if(getDiemheso10()<5.5)
            s="D+";
        else
        if(getDiemheso10()<6.5)
            s="C";
        else
        if(getDiemheso10()<7)
            s="C+";
        else
        if(getDiemheso10()<8)
            s="B";
        else
        if(getDiemheso10()<8.5)
            s="B+";
        else
        if(getDiemheso10()<9)
            s="A";
        else
        if(getDiemheso10()<=10)
            s="A+";
        return s;
    }
    public void xuat_ds()
    {
        System.out.println(ten_sv);
    }
    public void xuat_theo_SV()
    {
        System.out.println( getDiemchuyencann()+"\t"+getDiemgiuaky()+"\t"+getDiemcuoiky()+"\t"+getDiemheso10()+"\t"+getDiemheso4());
    }
//    public String xuat_theo_SV()
//    {
//        return getDiemchuyencann()+"\t"+getDiemgiuaky()+"\t"+getDiemcuoiky()+"\t"+getDiemheso10()+"\t"+getDiemheso4();
//    }
}
