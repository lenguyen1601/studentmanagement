import java.io.Serializable;
import java.util.Scanner;

public class Sinh_Vien extends nguoi implements Serializable {

    private double diemthi;

    public double getDiemthi() {
        return diemthi;
    }

    public void setDiemthi(double diemthi) {
        if (diemthi>10||diemthi<0)
            diemthi=0;

        this.diemthi = diemthi;
    }

    public Sinh_Vien() {
    }
    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("Điểm thi THPT: ");
        diemthi=sc.nextDouble();
        if (diemthi>10||diemthi<0)
            diemthi=0;
        sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Điểm thi THPT: "+diemthi);
    }

}
