import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static truong tr=new truong();
    public static void menu_Truong()
    {
        int luachon=0;
        while (true)
        {
            System.out.println("1. Tạo tài khoản và thông tin Sinh Viên.");
            System.out.println("2. Tạo tài khoản và thông tin Giảng Viên.");
            System.out.println("3. Xuất thông tin Sinh Viên.");
            System.out.println("4. Xuất thông tin Giảng Viên.");
            System.out.println("5. Tạo thông tin môn học.");
            System.out.println("6. Đổi mật khẩu");
            System.out.println("0. Kết thúc.");
            System.out.print("Nhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            switch (luachon)
            {
                case 1:
                    tr.Tao_thong_tin_Sinh_Vien();
                    break;
                case 2:
                    tr.Tao_thong_tin_Giang_Vien();
                    break;
                case 3:
                    tr.Xuat_ds_thong_tin_SV();
                    break;
                case 4:
                    tr.Xuat_ds_thong_tin_GV();
                    break;
                case 5:
                    tr.Tao_thong_tin_mon_hoc();
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Nhập mật khẩu mới: ");
                    tr.setMatkhau(sc.nextLine());
                    break;
                default:
                    System.out.println("Lỗi cú pháp!!!");
                    break;
            }
        }
    }
    public static void menu_sinh_vien(int i)
    {
        int luachon=0;
        while (true)
        {
            System.out.println("1. Thông tin sinh viên.");
            System.out.println("2. Đổi mật khẩu.");
            System.out.println("3. Đăng kí môn học.");
            System.out.println("4. Thời khóa biểu.");
            System.out.println("5. Kết quả học tập.");
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            sc.nextLine();
            if (luachon==0)
                break;
            switch(luachon)
            {
                case 1:
                    tr.Xuat_thong_tin_SV(i);
                    break;
                case 2:
                    tr.Doi_mat_khau_SV(i);
                    break;
                case 3:
                    tr.tao_tkb_SV(i);
                    break;
                case 4:
                    tr.Xuat_TKB_SV(i);
                    break;
                case 5:
                    tr.Ket_qua_hoc_tap(i);
                    break;
                default:
                    System.out.println("Lỗi cú pháp!!!");
                    break;

            }
        }
    }
    public static void menu_GV(int i)
    {
        int luachon=0;
        while (true)
        {
            System.out.println("1. Thông tin giảng viên.");
            System.out.println("2. Đổi mật khẩu.");
            System.out.println("3. Đăng kí môn dạy.");
            System.out.println("4. Thời khóa biểu");
            System.out.println("5. Nhập điểm môn dạy");
//            System.out.println("6. Xuất danh sách lớp");
            System.out.println("0. Kết thúc");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            sc.nextLine();
            if (luachon==0)
                break;
            switch (luachon)
            {
                case 1:
                    tr.Xuat_thong_tin_GV(i);
                    break;
                case 2:
                    tr.Doi_mat_kau_GV(i);
                    break;
                case 3:
                    tr.tao_tkb_GV(i);
                    break;
                case 4:

                    tr.Xuat_TKB_GV(i);
                    break;
                case 5:
                    tr.Nhap_diem(i);
                    break;
//                case 6:
//                    tr.Xuat()
//                    break;
                default:
                    break;
            }
        }
    }
    public static void dang_nhap()
    {
        String tk,mk;
        boolean check1=true,check2=true,check3=true;
        System.out.print("Nhập tài khoản: ");
        tk=sc.nextLine();
        System.out.print("Nhập mật khẩu: ");
        mk=sc.nextLine();
      if (tr.dang_nhap(tk,mk)==false&&tr.check_dn_SV(tk,mk)==-1&&tr.check_dn_GV(tk,mk)==-1)
      {
          System.out.println("Tài khoản hoặc mật khẩu sai!!!");
      }
      else
      {
          if (tr.dang_nhap(tk,mk))
          {
              menu_Truong();
          }
          if (tr.check_dn_GV(tk,mk)!=-1)
              menu_GV(tr.check_dn_GV(tk,mk));
          if (tr.check_dn_SV(tk,mk)!=-1)
              menu_sinh_vien(tr.check_dn_SV(tk,mk));
      }
    }
    public static void main(String[] args) {
        int luachon=0;
        tr.init();
        System.out.println("Khởi tạo dữ liệu(có/không): ");
        String str=null;
        str=sc.nextLine().toLowerCase();
        if (str.equals("có"))
        {
            System.out.println("Tạo tài khoản quản lí:");
            System.out.print("Nhập tài khoản: ");
            tr.setTai_khoan(sc.nextLine());
            System.out.print("Nhập mật khẩu: ");
            tr.setMatkhau(sc.nextLine());
            tr.init();
            menu_Truong();
        }

        else
        {
            Object data= null;
            try {
                data = docghifile1.docfile("test.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            tr=(truong) data;
        }
        while (true)
        {
            System.out.println("1. Đăng nhập.");
            System.out.println("2. Quên mật khẩu.");
            System.out.println("0. Kết thúc.");
            System.out.print("Nhập sự lựa chọn: ");
            luachon=sc.nextInt();
            sc.nextLine();
            if (luachon==1)
                dang_nhap();
            else if (luachon==2)
            {
                String tk = null;
                System.out.print("Nhập tài khoản: ");
                tk=sc.nextLine();
                tr.Quen_mat_khau(tk);
            }

            else if (luachon==0)
            {
                docghifile1.ghifile(tr,"test.txt");
                break;
            }

            else
                System.out.println("Lỗi cú pháp!!!");
        }

    }
}
