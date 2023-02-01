import java.io.Serializable;
import java.util.Scanner;

public class giang_vien extends nguoi implements Serializable {

    private String hoc_van;

    public String getHoc_van() {
        return hoc_van;
    }

    giang_vien(){}

    public void setHoc_van(String hoc_van) {
        this.hoc_van = hoc_van;
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập học vấn: ");
        hoc_van=sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Họ vấn: "+hoc_van);
    }
}
