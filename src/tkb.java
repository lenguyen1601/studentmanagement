
import java.io.Serializable;
import java.util.Scanner;

public class tkb implements Serializable,Cloneable{
    private int thu=0;
    private String tietString="";
    private int tinchi=0;
    private String mahocphan ;
    private String tenhocphan;
    private String nhomhocphan;

    static Scanner sc=new Scanner(System.in);

    public String getNhomhocphan() {
        return nhomhocphan;
    }

    public void setNhomhocphan(String nhomhocphan) {
        this.nhomhocphan = nhomhocphan;
    }

    public String getTenhocphan() {
        return tenhocphan;
    }

    public void setTenhocphan(String tenhocphan) {
        this.tenhocphan = tenhocphan;
    }

    public String getMahocphan() {
        return mahocphan;
    }

    public void setMahocphan(String mahocphan) {
        this.mahocphan = mahocphan;
    }

    public int getTinchi() {
        return tinchi;
    }

    public void setTinchi(int tinchi) {
        this.tinchi = tinchi;
    }

    public int getThu() {
        return thu;
    }

    public void setThu(int thu) {
        this.thu = thu;
    }

    public String getTietString() {
        return tietString;
    }
    public void setTietString(String tietString) {
        this.tietString = tietString;
    }


    public tkb Coppy()
    {
        try {
            return (tkb) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã học phần: ");
        mahocphan=sc.nextLine();
        System.out.print("Nhập nhóm học phần: ");
        nhomhocphan=sc.nextLine();
        System.out.print("Nhập số tín chỉ: ");
        tinchi=sc.nextInt();
        System.out.print("Nhập thứ: ");
        thu=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tiết: ");
        tietString=sc.nextLine();
    }
    public void xuat()
    {
        System.out.println(mahocphan+"\t"+nhomhocphan+"\t"+tenhocphan+"\t"+thu+"\t"+tietString);
    }
}
