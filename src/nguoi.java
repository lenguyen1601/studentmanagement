
import java.io.Serializable;
import java.util.Scanner;

public class nguoi  implements  Serializable{
    protected String ma;
    protected String matkhau;
    protected String hoten;
    protected String ngaysinh;
    protected String diachi;
    protected String Quequan;
    protected String gioitinh ;
    protected String cmndString;
    protected String EmailString;
    protected String sdtString;

    public nguoi()  {
    }

    public String getSdtString() {
        return sdtString;
    }

    public void setSdtString(String sdtString) {
        this.sdtString = sdtString;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getQuequan() {
        return Quequan;
    }

    public void setQuequan(String Quequan) {
        this.Quequan = Quequan;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmndString() {
        return cmndString;
    }

    public void setCmndString(String cmndString) {
        this.cmndString = cmndString;
    }

    public String getEmailString() {
        return EmailString;
    }

    public void setEmailString(String EmailString) {
        this.EmailString = EmailString;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
//        protected String ma;
        System.out.print("Nhập mã(tên đăng nhập): ");
        ma=sc.nextLine();
//        protected String hoten;
        System.out.print("Nhập mật khẩu: ");
        matkhau=sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoten=sc.nextLine();
//        protected String ngaysinh;
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        ngaysinh=sc.nextLine();

//        protected String diachi;
        System.out.print("Nhập địa chỉ: ");
        diachi=sc.nextLine();
//        protected String Quequan;
        System.out.print("Nhập quê quán: ");
        Quequan=sc.nextLine();
//        protected String gioitinh ;
        System.out.print("Nhập giới tính: ");
        gioitinh=sc.nextLine();
//        protected String cmndString;
        System.out.print("Nhập cmnd: ");
        cmndString=sc.nextLine();
//        protected String EmailString;
        System.out.print("Nhập email: ");
        EmailString=sc.nextLine();
//        protected String sdtString;
        System.out.print("Nhập sđt: ");
        sdtString=sc.nextLine();
    }
    public void xuat()
    {
//        protected String ma;
        System.out.println("Mã: "+ma);
//        protected String hoten;
        System.out.println("Họ và tên: "+hoten);
//        protected String ngaysinh;
        System.out.println("Ngày sinh: "+ngaysinh);
//        protected String diachi;
        System.out.println("Địa chỉ: "+diachi);
//        protected String Quequan;
        System.out.println("Quê quán: "+Quequan);
//        protected String gioitinh ;
        System.out.println("Giới tính: "+gioitinh);
//        protected String cmndString;
        System.out.println("CMND: "+cmndString);
//        protected String EmailString;
        System.out.println("Email: "+EmailString);
//        protected String sdtString;
        System.out.println("SĐT: "+sdtString);
    }
}
