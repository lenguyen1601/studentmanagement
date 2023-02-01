import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class truong  extends nguoi implements Serializable {

    static Scanner sc = new Scanner(System.in);
    private final String mon1 = "Kinh tế chính trị Mác - Lênin";
    private final String mon2 = "Đồ họa máy tính";
    private final String mon3 = "Hệ điều hành";
    private final String mon4 = "Lập trình Java căn bản";
    private final String mon5 = "Giáo dục thể chất 3";
    private final String mon6 = "Phân tích và thiết kế giải thuật";
    private final String mon7 = "Trí tuệ nhân tạo";
    private final String mon8 = "Pháp luật đại cương";

    private final String mon9 = "Lập trình C/C++ cơ bản";
    private final String mon10 = "Tiếng anh chuyên ngành";
    private final String mon11 = "Mạng máy tính";
    private final String mon12 = "Java nâng cao";
    private final String mon13 = "Giáo dục thể chất 4";
    private final String mon14 = "Cơ sở dữ liệu";
    private final String mon15 = "Truyền và bảo mật thông tin";
    private final String mon16 = "Thiết kế và lập trình web";

    private  String Tai_khoan;

    private ArrayList<String> dsmon;

    private ArrayList<tkb> tkb_nha_truong;
    private ArrayList<tkb> tkb_dki_gv;

    private ArrayList<tkb_sv> tkb_SV;
    private ArrayList<tkb_gv> tkb_GV;

    private ArrayList<Diem> ds_ktctDiem;
    private ArrayList<Diem> ds_dhmtDiem;
    private ArrayList<Diem> ds_hdhDiem;
    private ArrayList<Diem> ds_javaDiem;
    private ArrayList<Diem> ds_gdtcDiem;
    private ArrayList<Diem> ds_ptvgtDiem;
    private ArrayList<Diem> ds_ttntDiem;
    private ArrayList<Diem> ds_pldcDiem;

    private ArrayList<Diem> ds_laptrinhCDiem;
    private ArrayList<Diem> ds_TACNDiem;
    private ArrayList<Diem> ds_mangmaytinhDiem;
    private ArrayList<Diem> ds_JavanangcaoDiem;
    private ArrayList<Diem> ds_gdtc4Diem;
    private ArrayList<Diem> ds_CSDLDiem;
    private ArrayList<Diem> ds_BaomatttDiem;
    private ArrayList<Diem> ds_ThietkewebDiem;

    private ArrayList<giang_vien> ds_giang_vien;
    private ArrayList<Sinh_Vien> ds_sinh_vien;


    private String matkhau;

    public void setTai_khoan(String tai_khoan) {
        Tai_khoan = tai_khoan;
    }

    public String getTai_khoan() {
        return Tai_khoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getMon1() {
        return mon1;
    }

    public String getMon2() {
        return mon2;
    }

    public String getMon3() {
        return mon3;
    }

    public String getMon4() {
        return mon4;
    }

    public String getMon5() {
        return mon5;
    }

    public String getMon6() {
        return mon6;
    }

    public String getMon7() {
        return mon7;
    }

    public String getMon8() {
        return mon8;
    }

    public String getMon9() {
        return mon9;
    }

    public String getMon10() {
        return mon10;
    }

    public String getMon11() {
        return mon11;
    }

    public String getMon12() {
        return mon12;
    }

    public String getMon13() {
        return mon13;
    }

    public String getMon14() {
        return mon14;
    }

    public String getMon15() {
        return mon15;
    }

    public String getMon16() {
        return mon16;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        truong.sc = sc;
    }

    public ArrayList getDsmon() {
        return dsmon;
    }

    public void setDsmon(ArrayList dsmon) {
        this.dsmon = dsmon;
    }

    public ArrayList<tkb> getTkb_nha_truong() {
        return tkb_nha_truong;
    }

    public void setTkb_nha_truong(ArrayList<tkb> tkb_nha_truong) {
        this.tkb_nha_truong = tkb_nha_truong;
    }


    public ArrayList<Diem> getDs_ktctDiem() {
        return ds_ktctDiem;
    }

    public void setDs_ktctDiem(ArrayList<Diem> ds_ktctDiem) {
        this.ds_ktctDiem = ds_ktctDiem;
    }

    public ArrayList<Diem> getDs_dhmtDiem() {
        return ds_dhmtDiem;
    }

    public void setDs_dhmtDiem(ArrayList<Diem> ds_dhmtDiem) {
        this.ds_dhmtDiem = ds_dhmtDiem;
    }

    public ArrayList<Diem> getDs_hdhDiem() {
        return ds_hdhDiem;
    }

    public void setDs_hdhDiem(ArrayList<Diem> ds_hdhDiem) {
        this.ds_hdhDiem = ds_hdhDiem;
    }

    public ArrayList<Diem> getDs_javaDiem() {
        return ds_javaDiem;
    }

    public void setDs_javaDiem(ArrayList<Diem> ds_javaDiem) {
        this.ds_javaDiem = ds_javaDiem;
    }

    public ArrayList<Diem> getDs_gdtcDiem() {
        return ds_gdtcDiem;
    }

    public void setDs_gdtcDiem(ArrayList<Diem> ds_gdtcDiem) {
        this.ds_gdtcDiem = ds_gdtcDiem;
    }

    public ArrayList<Diem> getDs_ptvgtDiem() {
        return ds_ptvgtDiem;
    }

    public void setDs_ptvgtDiem(ArrayList<Diem> ds_ptvgtDiem) {
        this.ds_ptvgtDiem = ds_ptvgtDiem;
    }

    public ArrayList<Diem> getDs_ttntDiem() {
        return ds_ttntDiem;
    }

    public void setDs_ttntDiem(ArrayList<Diem> ds_ttntDiem) {
        this.ds_ttntDiem = ds_ttntDiem;
    }

    public ArrayList<Diem> getDs_pldcDiem() {
        return ds_pldcDiem;
    }

    public void setDs_pldcDiem(ArrayList<Diem> ds_pldcDiem) {
        this.ds_pldcDiem = ds_pldcDiem;
    }

    public ArrayList<Diem> getDs_laptrinhCDiem() {
        return ds_laptrinhCDiem;
    }

    public void setDs_laptrinhCDiem(ArrayList<Diem> ds_laptrinhCDiem) {
        this.ds_laptrinhCDiem = ds_laptrinhCDiem;
    }

    public ArrayList<Diem> getDs_TACNDiem() {
        return ds_TACNDiem;
    }

    public void setDs_TACNDiem(ArrayList<Diem> ds_TACNDiem) {
        this.ds_TACNDiem = ds_TACNDiem;
    }

    public ArrayList<Diem> getDs_mangmaytinhDiem() {
        return ds_mangmaytinhDiem;
    }

    public void setDs_mangmaytinhDiem(ArrayList<Diem> ds_mangmaytinhDiem) {
        this.ds_mangmaytinhDiem = ds_mangmaytinhDiem;
    }

    public ArrayList<Diem> getDs_JavanangcaoDiem() {
        return ds_JavanangcaoDiem;
    }

    public void setDs_JavanangcaoDiem(ArrayList<Diem> ds_JavanangcaoDiem) {
        this.ds_JavanangcaoDiem = ds_JavanangcaoDiem;
    }

    public ArrayList<Diem> getDs_gdtc4Diem() {
        return ds_gdtc4Diem;
    }

    public void setDs_gdtc4Diem(ArrayList<Diem> ds_gdtc4Diem) {
        this.ds_gdtc4Diem = ds_gdtc4Diem;
    }

    public ArrayList<Diem> getDs_CSDLDiem() {
        return ds_CSDLDiem;
    }

    public void setDs_CSDLDiem(ArrayList<Diem> ds_CSDLDiem) {
        this.ds_CSDLDiem = ds_CSDLDiem;
    }

    public ArrayList<Diem> getDs_BaomatttDiem() {
        return ds_BaomatttDiem;
    }

    public void setDs_BaomatttDiem(ArrayList<Diem> ds_BaomatttDiem) {
        this.ds_BaomatttDiem = ds_BaomatttDiem;
    }

    public ArrayList<Diem> getDs_ThietkewebDiem() {
        return ds_ThietkewebDiem;
    }

    public void setDs_ThietkewebDiem(ArrayList<Diem> ds_ThietkewebDiem) {
        this.ds_ThietkewebDiem = ds_ThietkewebDiem;
    }

    public ArrayList<giang_vien> getDs_giang_vien() {
        return ds_giang_vien;
    }

    public void setDs_giang_vien(ArrayList<giang_vien> ds_giang_vien) {
        this.ds_giang_vien = ds_giang_vien;
    }

    public ArrayList<Sinh_Vien> getDs_sinh_vien() {
        return ds_sinh_vien;
    }

    public void setDs_sinh_vien(ArrayList<Sinh_Vien> ds_sinh_vien) {
        this.ds_sinh_vien = ds_sinh_vien;
    }



    public ArrayList<tkb_sv> getTkb_SV() {
        return tkb_SV;
    }

    public void setTkb_SV(ArrayList<tkb_sv> tkb_SV) {
        this.tkb_SV = tkb_SV;
    }

    public ArrayList<tkb_gv> getTkb_GV() {
        return tkb_GV;
    }

    public void setTkb_GV(ArrayList<tkb_gv> tkb_GV) {
        this.tkb_GV = tkb_GV;
    }

    public void init()
    {
        ArrayList Dsmonhoc=new ArrayList();
        Dsmonhoc.add(mon1);
        Dsmonhoc.add(mon2);
        Dsmonhoc.add(mon3);
        Dsmonhoc.add(mon4);
        Dsmonhoc.add(mon5);
        Dsmonhoc.add(mon6);
        Dsmonhoc.add(mon7);
        Dsmonhoc.add(mon8);
        Dsmonhoc.add(mon9);
        Dsmonhoc.add(mon10);
        Dsmonhoc.add(mon11);
        Dsmonhoc.add(mon12);
        Dsmonhoc.add(mon13);
        Dsmonhoc.add(mon14);
        Dsmonhoc.add(mon15);
        Dsmonhoc.add(mon16);

        ArrayList<Diem> Ds_ktctDiem=new ArrayList<>();
        ArrayList<Diem> Ds_dhmtDiem=new ArrayList<>();
        ArrayList<Diem> Ds_hdhDiem=new ArrayList<>();
        ArrayList<Diem> Ds_javaDiem=new ArrayList<>();
        ArrayList<Diem> Ds_gdtcDiem=new ArrayList<>();
        ArrayList<Diem> Ds_ptvgtDiem=new ArrayList<>();
        ArrayList<Diem> Ds_ttntDiem=new ArrayList<>();
        ArrayList<Diem> Ds_pldcDiem=new ArrayList<>();

        ArrayList<Diem> Ds_laptrinhCDiem=new ArrayList<>();
        ArrayList<Diem> Ds_TACNDiem=new ArrayList<>();
        ArrayList<Diem> Ds_mangmaytinhDiem=new ArrayList<>();
        ArrayList<Diem> Ds_JavanangcaoDiem=new ArrayList<>();
        ArrayList<Diem> Ds_gdtc4Diem=new ArrayList<>();
        ArrayList<Diem> Ds_CSDLDiem=new ArrayList<>();
        ArrayList<Diem> Ds_BaomatttDiem=new ArrayList<>();
        ArrayList<Diem> Ds_thietkeweb=new ArrayList<>();

        Ds_ktctDiem.add(null);
        Ds_dhmtDiem.add(null);
        Ds_hdhDiem.add(null);
        Ds_javaDiem.add(null);
        Ds_gdtcDiem.add(null);
        Ds_ptvgtDiem.add(null);
        Ds_ttntDiem.add(null);
        Ds_pldcDiem.add(null);

        Ds_laptrinhCDiem.add(null);
        Ds_TACNDiem.add(null);
        Ds_mangmaytinhDiem.add(null);
        Ds_JavanangcaoDiem.add(null);
        Ds_gdtc4Diem.add(null);
        Ds_CSDLDiem.add(null);
        Ds_BaomatttDiem.add(null);
        Ds_thietkeweb.add(null);
        ArrayList<Diem> Ds_ThietkewebDiem=new ArrayList<>();
        Ds_ThietkewebDiem.add(null);

//        tkb_GV1.add(null);
        ArrayList<giang_vien> Ds_giang_vien=new ArrayList<>();
        ArrayList<Sinh_Vien> Ds_sinh_vien=new ArrayList<>();
        Ds_giang_vien.add(null);
        Ds_sinh_vien.add(null);

        ArrayList<tkb_sv> tkb_SV1=new ArrayList<>();
        ArrayList<tkb_gv> tkb_GV1=new ArrayList<>();
        ArrayList<tkb> tkb_nt=new ArrayList<>();
        ArrayList<tkb> Tkb_dki_gv=new ArrayList<>();
        tkb_nt.add(new tkb());
        Tkb_dki_gv.add(new tkb());
        tkb_SV1.add(new tkb_sv());
        tkb_GV1.add(new tkb_gv());


        tkb_dki_gv=Tkb_dki_gv;
        tkb_SV=tkb_SV1;
        tkb_GV=tkb_GV1;
        tkb_nha_truong=tkb_nt;

        dsmon=Dsmonhoc;
        ds_sinh_vien=Ds_sinh_vien;
        ds_giang_vien=Ds_giang_vien;

        ds_ktctDiem=Ds_ktctDiem;
        ds_dhmtDiem=Ds_dhmtDiem;
        ds_hdhDiem=Ds_hdhDiem;
        ds_javaDiem=Ds_javaDiem;
        ds_gdtcDiem=Ds_gdtcDiem;
        ds_ptvgtDiem=Ds_ptvgtDiem;
        ds_ttntDiem=Ds_ttntDiem;
        ds_pldcDiem=Ds_pldcDiem;

        ds_laptrinhCDiem=Ds_laptrinhCDiem;
        ds_TACNDiem=Ds_TACNDiem;
        ds_mangmaytinhDiem=Ds_mangmaytinhDiem;
        ds_JavanangcaoDiem=Ds_JavanangcaoDiem;
        ds_gdtc4Diem=Ds_gdtc4Diem;
        ds_CSDLDiem=Ds_CSDLDiem;
        ds_BaomatttDiem=Ds_BaomatttDiem;
        ds_ThietkewebDiem=Ds_ThietkewebDiem;
    }

    public void Quen_mat_khau(String tk)
    {
        int tmp=0;
        if (getTai_khoan().equals(tk))
        {
            setMatkhau(getTai_khoan());
        }
        ArrayList<Sinh_Vien> ds_sv=ds_sinh_vien;
        for (int i=1;i<ds_sinh_vien.size();i++)
        {
            if (ds_sinh_vien.get(i).getMa().equals(tk))
            {
                Sinh_Vien sv=ds_sv.get(i);
                sv.setMatkhau(sv.getMa());
                ds_sv.set(i, sv);
                ds_sinh_vien=ds_sv;
                break;
            }
        }
        ArrayList<giang_vien> ds_gv=ds_giang_vien;
        for (int i=1;i<ds_giang_vien.size();i++)
        {
            if (ds_giang_vien.get(i).getMa().equals(tk))
            {
                giang_vien gv=ds_gv.get(i);
                gv.setMatkhau(gv.getMa());
                ds_gv.set(i, gv);
                ds_giang_vien=ds_gv;
                break;
            }
        }
    }
    public int check_dn_SV(String tk,String mk)
    {
        boolean check=true;
        for (int i=1;i<ds_sinh_vien.size();i++)
        {
            if (tk.equals(ds_sinh_vien.get(i).getMa()))
            {
                if (mk.equals(ds_sinh_vien.get(i).getMatkhau()))
                {
                    check=false;
                    return i;
                }
                if (check==false)
                    break;
            }
        }
        return -1;
    }
    public int check_dn_GV(String tk,String mk)
    {
        boolean check=true;
        for (int i=1;i<ds_giang_vien.size();i++)
        {
            if (tk.equals(ds_giang_vien.get(i).getMa()))
            {
                if (mk.equals(ds_giang_vien.get(i).getMatkhau()))
                {
                    check=false;
                    return i;
                }
                if (check==false)
                    break;
            }
        }
        return -1;
    }
    public boolean dang_nhap(String tk,String mk)
    {
        boolean check=true;
        if(tk.equals(getTai_khoan()))
        {
            if (mk.equals(getMatkhau()))
            {
                check=false;
                return true;
            }
        }
        return false;
    }
    public Sinh_Vien Nhap_thong_tin_sinh_vien()
    {
        Sinh_Vien sv=new Sinh_Vien();
        sv.nhap();
        return sv;
    }
    public void Tao_thong_tin_Sinh_Vien()
    {
        int luachon=0;
        ArrayList<Sinh_Vien> dssv=ds_sinh_vien;
        while (true)
        {
            System.out.println("1. Thêm thông tin sinh viên.");
            System.out.println("2. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==2)
                break;
            else
            if (luachon==1){
                boolean check=true;
                Sinh_Vien sv=Nhap_thong_tin_sinh_vien();
                for (int i=1;i<dssv.size();i++)
                    if (dssv.get(i).getMa().equals(sv.getMa())){
                        check=false;

                        break;
                    }
                if(check) {
                    if (ds_giang_vien.size()>1)
                        for (int i = 1; i < ds_giang_vien.size(); i++)
                            if (ds_giang_vien.get(i).getMa().equals(sv.getMa())) {
                                check = false;
                                break;
                            }
                }
                if (check)
                    dssv.add(sv);
                else
                    System.out.println("Tài khoản tồn tài!!!");
            }
            else
                System.out.println("Lỗi cú pháp!!!");
        }
        ds_sinh_vien=dssv;
    }
    public void Xuat_ds_thong_tin_SV()
    {
        for (int i=1;i<ds_sinh_vien.size();i++)
            ds_sinh_vien.get(i).xuat();
    }
    public giang_vien Nhap_thong_tin_giang_vien()
    {
        giang_vien gv=new giang_vien();
        gv.nhap();
        return gv;
    }
    public void Tao_thong_tin_Giang_Vien()
    {
        int luachon=0;
        ArrayList<giang_vien> dsgv=ds_giang_vien;
        while (true)
        {
            System.out.println("1. Thêm thông tin giảng viên.");
            System.out.println("2. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==2)
                break;
            else
            if (luachon==1){
                boolean check=true;
                giang_vien gv=Nhap_thong_tin_giang_vien();
                if (dsgv.size()>0)
                {
                    for (int i=1;i<dsgv.size();i++)
                        if (dsgv.get(i).getMa().equals(gv.getMa())){
                            check=false;
                            System.out.println("Mã tồn tại!!!");
                            break;
                        }
                }
                if (check)
                {
                    if (ds_sinh_vien.size()>1)
                        for (int i=1;i<ds_sinh_vien.size();i++)
                            if (ds_sinh_vien.get(i).getMa().equals(gv.getMa())){
                                check=false;
                                System.out.println("Mã tồn tại!!!");
                                break; }
                }
                if (check)
                    dsgv.add(gv);
            }
            else
                System.out.println("Lỗi cú pháp!!!");
        }
        ds_giang_vien=dsgv;
    }
    public void Xuat_ds_thong_tin_GV()
    {
        for (int i=1;i<ds_giang_vien.size();i++)
            ds_giang_vien.get(i).xuat();
    }
    public void Xuat_thong_tin_SV(int i)
    {
        ds_sinh_vien.get(i).xuat();
    }
    public void Xuat_thong_tin_GV(int i)
    {
        ds_giang_vien.get(i).xuat();
    }
    public void Doi_mat_khau_SV(int i)
    {
        Sinh_Vien sv=ds_sinh_vien.get(i);
        sc.nextLine();
        System.out.print("Nhập mật khẩu mới: ");
        sv.setMatkhau(sc.nextLine());
        ds_sinh_vien.set(i,sv);
    }
    public void Doi_mat_kau_GV(int i)
    {
        giang_vien gv=ds_giang_vien.get(i);
        System.out.print("Nhập mật khẩu mới: ");
        sc.nextLine();
        gv.setMatkhau(sc.nextLine());
        ds_giang_vien.set(i,gv);
    }
    public void Xuat_TKB_SV(int i)
    {
        for (int j=1;j<tkb_SV.size();j++)
        {
            if (tkb_SV.get(j).getMa_SV().equals(ds_sinh_vien.get(i).getMa()))
            {
                tkb_SV.get(j).xuat_ds_SV();
                break;
            }
        }
    }
    public void Xuat_TKB_GV(int i)
    {
        for (int j=1;j<tkb_GV.size();j++)
        {
            if (tkb_GV.get(j).getMa_GV().equals(ds_giang_vien.get(i).getMa()))
            {
                tkb_GV.get(j).xuat_ds_GV();
                break;
            }
        }
    }
    public tkb Nhap_thong_tin_mon_hoc(int i)
    {
        tkb Tkb=new tkb();
        Tkb.setTenhocphan(dsmon.get(i));
        Tkb.nhap();
        return Tkb;
    }
    public Diem them_ds_lop(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_sinh_vien.get(i).getHoten());
        diem.setMa_sv(ds_sinh_vien.get(i).getMa());
        return diem;
    }
    public void Tao_thong_tin_mon_hoc()
    {
        ArrayList ds_luachon=new ArrayList();
        int luachon=0;
        ds_luachon.add(0);
        ArrayList<tkb> ds_tkb=tkb_nha_truong;
        while (true)
        {
            for (int i=0;i<dsmon.size();i++)
                System.out.println((i+1)+". "+dsmon.get(i));
            System.out.println("0. Kết thúc.");
            System.out.print("Nhập sự lựa chọn: ");
            luachon=sc.nextInt();

            if (luachon==0)
                break;

            if (ds_luachon.indexOf(luachon)==-1)
            {
                if (luachon>16)
                    System.out.println("Lỗi cú pháp!!!");
                else
                {
                    ds_luachon.add(luachon);
                    ds_tkb.add(Nhap_thong_tin_mon_hoc((luachon-1)));
                }
            }
        }
        tkb_nha_truong=ds_tkb;
    }

    public void tao_tkb_SV(int j)
    {
        ArrayList<Diem> Ds_ktctDiem = ds_ktctDiem;
        ArrayList<Diem> Ds_dhmtDiem = ds_dhmtDiem;
        ArrayList<Diem> Ds_hdhDiem = ds_hdhDiem;
        ArrayList<Diem> Ds_javaDiem = ds_javaDiem;
        ArrayList<Diem> Ds_gdtcDiem = ds_gdtcDiem;
        ArrayList<Diem> Ds_ptvgtDiem = ds_ptvgtDiem;
        ArrayList<Diem> Ds_ttntDiem = ds_ttntDiem;
        ArrayList<Diem> Ds_pldcDiem = ds_pldcDiem;

        ArrayList<Diem> Ds_laptrinhCDiem = ds_laptrinhCDiem;
        ArrayList<Diem> Ds_TACNDiem = ds_TACNDiem;
        ArrayList<Diem> Ds_mangmaytinhDiem = ds_mangmaytinhDiem;
        ArrayList<Diem> Ds_JavanangcaoDiem = ds_JavanangcaoDiem;
        ArrayList<Diem> Ds_gdtc4Diem = ds_gdtc4Diem;
        ArrayList<Diem> Ds_CSDLDiem = ds_CSDLDiem;
        ArrayList<Diem> Ds_BaomatttDiem = ds_BaomatttDiem;
        ArrayList<Diem> Ds_thietkeweb = ds_ThietkewebDiem;

        ArrayList<tkb> ds_mon_day = tkb_dki_gv;
        ArrayList<tkb> tkb_nt = tkb_nha_truong;

        boolean check2 = true;
        ArrayList<tkb> Tkb = null;
        tkb_sv Tkb_sv=null;
        int z=0;
        for (int i = 1; i < tkb_SV.size(); i++){
            if (tkb_SV.get(i).getMa_SV().equals(ds_sinh_vien.get(j).getMa()))
            {
                Tkb = tkb_SV.get(i).getDs_tkb_sv();
                Tkb_sv=tkb_SV.get(i);
                z=i;
                check2 = false;
                break;
            }
        }
        if (check2)
        {
            Tkb=new ArrayList<>();
            Tkb_sv=new tkb_sv();
        }


        ArrayList<tkb_sv> Tkb_SV=tkb_SV;

        ArrayList ds_lua_chon=new ArrayList();

        int luachon=0;
        ds_lua_chon.add(0);
        while (true)
        {
            boolean check = true;
            boolean check1 = true;
            System.out.println();
            for (int i=1;i<tkb_nt.size();i++)
            {
                System.out.print(i+".\t");
                tkb_nt.get(i).xuat();
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=tkb_nt.size()){
                System.out.println("Lỗi cú pháp!!!");
                continue;
            }
            if (ds_lua_chon.indexOf(luachon)==-1) {
                if (check2)
                    Tkb.add(tkb_nt.get(luachon));
                else
                {
                    for (int i=0;i<Tkb.size();i++)
                    {
                        if (Tkb.get(i).getTenhocphan().equals(tkb_nt.get(luachon).getTenhocphan()))
                        {
                            check1=false;
                            break;
                        }
                    }
                    if (check1)
                    {
                        Tkb.add(tkb_nt.get(luachon));
                        ds_lua_chon.add(luachon);
                    }

                }

                if (check1)
                switch (luachon) {
                    case 1:
                        for (int i=1;i<Ds_ktctDiem.size();i++) {
                            if (Ds_ktctDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_ktctDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 2:
                        for (int i=1;i<Ds_dhmtDiem.size();i++) {
                            if (Ds_dhmtDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_dhmtDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 3:
                        for (int i=1;i<Ds_hdhDiem.size();i++) {
                            if (Ds_hdhDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_hdhDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 4:
                        for (int i=1;i<Ds_javaDiem.size();i++) {
                            if (Ds_javaDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_javaDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 5:
                        for (int i=1;i<Ds_gdtcDiem.size();i++) {
                            if (Ds_gdtcDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_gdtcDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 6:
                        for (int i=1;i<Ds_ptvgtDiem.size();i++) {
                            if (Ds_ptvgtDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_ptvgtDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 7:
                        for (int i=1;i<Ds_ttntDiem.size();i++) {
                            if (Ds_ptvgtDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_ttntDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 8:
                        for (int i=1;i<Ds_pldcDiem.size();i++) {
                            if (Ds_pldcDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_pldcDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 9:
                        for (int i=1;i<Ds_laptrinhCDiem.size();i++) {
                            if (Ds_laptrinhCDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_laptrinhCDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 10:
                        for (int i=1;i<Ds_TACNDiem.size();i++) {
                            if (Ds_TACNDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_TACNDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 11:
                        for (int i=1;i<Ds_mangmaytinhDiem.size();i++) {
                            if (Ds_mangmaytinhDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_mangmaytinhDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 12:
                        for (int i=1;i<Ds_JavanangcaoDiem.size();i++) {
                            if (Ds_JavanangcaoDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_JavanangcaoDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 13:
                        for (int i=1;i<Ds_gdtc4Diem.size();i++) {
                            if (Ds_gdtc4Diem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_gdtc4Diem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 14:
                        for (int i=1;i<Ds_CSDLDiem.size();i++) {
                            if (Ds_CSDLDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_CSDLDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 15:
                        for (int i=1;i<Ds_BaomatttDiem.size();i++) {
                            if (Ds_BaomatttDiem.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_BaomatttDiem.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;
                    case 16:
                        for (int i=1;i<Ds_thietkeweb.size();i++) {
                            if (Ds_thietkeweb.get(i).getTen_sv().equals(ds_sinh_vien.get(j).getHoten())) {
                                check = false;
                                break;
                            }
                        }
                        if (check)
                            Ds_thietkeweb.add(them_ds_lop(j));
                        for (int i=1;i<ds_mon_day.size();i++)
                        {
                            if (ds_mon_day.get(i).getTenhocphan().equals(dsmon.get(luachon-1)))
                            {
                                check1=false;
                                break;
                            }
                        }
                        if (check1)
                            ds_mon_day.add(tkb_nt.get(luachon));
                        break;

                }
            }
        }
        Tkb_sv.setDs_tkb_sv(Tkb);
        Tkb_sv.setMa_SV(ds_sinh_vien.get(j).getMa());
        if (check2)
            Tkb_SV.add(Tkb_sv);
        else
            Tkb_SV.set(z,Tkb_sv);
        tkb_SV=Tkb_SV;
        tkb_dki_gv=ds_mon_day;
        ds_ktctDiem=Ds_ktctDiem;
        ds_dhmtDiem=Ds_dhmtDiem;
        ds_hdhDiem=Ds_hdhDiem;
        ds_javaDiem=Ds_javaDiem;
        ds_gdtcDiem=Ds_gdtcDiem;
        ds_ptvgtDiem=Ds_ptvgtDiem;
        ds_ttntDiem=Ds_ttntDiem;
        ds_pldcDiem=Ds_pldcDiem;

        ds_laptrinhCDiem=Ds_laptrinhCDiem;
        ds_TACNDiem=Ds_TACNDiem;
        ds_mangmaytinhDiem=Ds_mangmaytinhDiem;
        ds_JavanangcaoDiem=Ds_JavanangcaoDiem;
        ds_gdtc4Diem=Ds_gdtc4Diem;
        ds_CSDLDiem=Ds_CSDLDiem;
        ds_BaomatttDiem=Ds_BaomatttDiem;
        ds_ThietkewebDiem=Ds_thietkeweb;

    }
    public void xuat_tkb_SV()
    {
        for (int i=1;i<tkb_SV.size();i++)
        {
            tkb_SV.get(i).xuat_ds_SV();
        }

    }
    public void tao_tkb_GV(int j)
    {
        int luachon=0;
        ArrayList ds_lua_chon=new ArrayList();
        ArrayList<tkb> Tkb=null;
        boolean check=true;
        int z=0;
        for (int i=1;i<tkb_GV.size();i++)
        {
            if (tkb_GV.get(i).getMa_GV().equals(ds_giang_vien.get(j).getMa()))
            {
                check=false;
                Tkb=tkb_GV.get(i).getDs_tkb_gv();
                z=i;
                break;
            }
        }
        ds_lua_chon.add(0);
        if (check)
            Tkb=new ArrayList<>();
        ArrayList<tkb_gv> Tkb_gv=tkb_GV;
        while (true)
        {
            for (int i=1;i<tkb_dki_gv.size();i++)
                System.out.println((i)+". "+tkb_dki_gv.get(i).getMahocphan()+"\t"+tkb_dki_gv.get(i).getNhomhocphan()+"\t"+tkb_dki_gv.get(i).getTenhocphan()+"\t"+tkb_dki_gv.get(i).getTinchi()+"\t"+tkb_dki_gv.get(i).getMahocphan()+"\t"+tkb_dki_gv.get(i).getThu()+"\t"+tkb_dki_gv.get(i).getTietString()+"\t");
            System.out.println("0. Kết thúc.");
            System.out.print("Nhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=tkb_dki_gv.size())
                continue;
            if (ds_lua_chon.indexOf(luachon)==-1)
            {
                boolean check1=true;
                ds_lua_chon.add(luachon);
                if (check)
                    Tkb.add(tkb_dki_gv.get(luachon));
                else
                {
                    for (int i=0;i<Tkb.size();i++)
                    {
                        if (Tkb.get(i).getTenhocphan().equals(tkb_dki_gv.get(luachon).getTenhocphan()))
                        {
                            check1=false;
                            break;
                        }
                    }
                    if (check1)
                        Tkb.add(tkb_dki_gv.get(luachon));
                }
            }
        }
        tkb_gv tkb__gv=new tkb_gv();
        tkb__gv.setMa_GV(ds_giang_vien.get(j).getMa());
        tkb__gv.setDs_tkb_gv(Tkb);
        if (check)
            Tkb_gv.add(tkb__gv);
        else
            Tkb_gv.add(z,tkb__gv);
        tkb_GV=Tkb_gv;
    }
    public void ds_lop_cac_mon()
    {
        for (int i=1;i< ds_dhmtDiem.size();i++)
            ds_dhmtDiem.get(i).xuat_ds();
    }
    public void xuat_tkb_GV()
    {
        for (int i=1;i<tkb_dki_gv.size();i++)
        {
            System.out.println((i)+". "+tkb_dki_gv.get(i).getMahocphan()+"\t"+tkb_dki_gv.get(i).getNhomhocphan()+"\t"+tkb_dki_gv.get(i).getTenhocphan()+"\t"+tkb_dki_gv.get(i).getTinchi()+"\t"+tkb_dki_gv.get(i).getMahocphan()+"\t"+tkb_dki_gv.get(i).getThu()+"\t"+tkb_dki_gv.get(i).getTietString()+"\t");
        }
    }
    public Diem nhap_Diem_DHMT(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_dhmtDiem.get(i).getTen_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_DHMT()
    {
        boolean check=true;
        ArrayList<Diem> Ds_dhmt=ds_dhmtDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< ds_dhmtDiem.size();i++)
            {
                System.out.println(i+". "+ds_dhmtDiem.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=ds_dhmtDiem.size())
                continue;
            Ds_dhmt.set(luachon,nhap_Diem_DHMT(luachon));
        }
        ds_dhmtDiem=Ds_dhmt;
    }
    public Diem nhap_Diem_KTCT(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_ktctDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_ktctDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_KTCT()
    {
        boolean check=true;
        ArrayList<Diem> Ds_ktctDiem=ds_ktctDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_ktctDiem.size();i++)
            {
                System.out.println(i+". "+Ds_ktctDiem.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_ktctDiem.size())
                continue;
            Ds_ktctDiem.set(luachon,nhap_Diem_KTCT(luachon));
        }

        ds_ktctDiem=Ds_ktctDiem;
    }

    public Diem nhap_Diem_HDH(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_hdhDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_hdhDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_HDH()
    {
        ArrayList<Diem> Ds_hdh=ds_hdhDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_hdh.size();i++)
            {
                System.out.println(i+". "+Ds_hdh.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_hdh.size())
                continue;
            Ds_hdh.set(luachon,nhap_Diem_HDH(luachon));
        }
        ds_hdhDiem=Ds_hdh;
    }
    public Diem nhap_Diem_Java(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_javaDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_javaDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_Java()
    {
        ArrayList<Diem> Ds_java=ds_javaDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_java.size();i++)
            {
                System.out.println(i+". "+Ds_java.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_java.size())
                continue;
            Ds_java.set(luachon,nhap_Diem_Java(luachon));
        }
        ds_javaDiem=Ds_java;
    }
    public Diem nhap_Diem_GDTC(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_gdtcDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_gdtcDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_GDTC()
    {
        ArrayList<Diem> ds_gdtc=ds_gdtcDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< ds_gdtc.size();i++)
            {
                System.out.println(i+". "+ds_gdtc.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=ds_gdtc.size())
                continue;
            ds_gdtc.set(luachon,nhap_Diem_GDTC(luachon));
        }
        ds_gdtcDiem=ds_gdtc;
    }
    public Diem nhap_Diem_PTTKGT(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_ptvgtDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_ptvgtDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_PTTKGT()
    {
        ArrayList<Diem> ds_pttk=ds_ptvgtDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< ds_pttk.size();i++)
            {
                System.out.println(i+". "+ds_pttk.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=ds_pttk.size())
                continue;
            ds_pttk.set(luachon,nhap_Diem_PTTKGT(luachon));
        }
        ds_ptvgtDiem=ds_pttk;
    }
    public Diem nhap_Diem_TTNT(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_ttntDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_ttntDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_TTNT()
    {
        ArrayList<Diem> ds_ttnt=ds_ttntDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< ds_ttnt.size();i++)
            {
                System.out.println(i+". "+ds_ttnt.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=ds_ttnt.size())
                continue;
            ds_ttnt.set(luachon,nhap_Diem_TTNT(luachon));
        }
        ds_ttntDiem=ds_ttnt;
    }
    public Diem nhap_Diem_PLDC(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_pldcDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_pldcDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_PLDC()
    {
        ArrayList<Diem> Ds_pldcDiem=ds_pldcDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_pldcDiem.size();i++)
            {
                System.out.println(i+". "+Ds_pldcDiem.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_pldcDiem.size())
                continue;
            Ds_pldcDiem.set(luachon,nhap_Diem_PLDC(luachon));
        }
        ds_pldcDiem=Ds_pldcDiem;
    }
    public Diem nhap_Diem_LaptrinhC(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_laptrinhCDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_laptrinhCDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_LaptrinhC()
    {
        ArrayList<Diem> Ds_laptrinhC=ds_laptrinhCDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_laptrinhC.size();i++)
            {
                System.out.println(i+". "+Ds_laptrinhC.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_laptrinhC.size())
                continue;
            Ds_laptrinhC.set(luachon,nhap_Diem_LaptrinhC(luachon));
        }
        ds_laptrinhCDiem=Ds_laptrinhC;
    }
    public Diem nhap_Diem_TACN(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_TACNDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_TACNDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_TACN()
    {
        ArrayList<Diem> Ds_TACN=ds_TACNDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_TACN.size();i++)
            {
                System.out.println(i+". "+Ds_TACN.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_TACN.size())
                continue;
            Ds_TACN.set(luachon,nhap_Diem_TACN(luachon));
        }
        ds_TACNDiem=Ds_TACN;
    }
    public Diem nhap_Diem_MMT(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_mangmaytinhDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_mangmaytinhDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_MMT()
    {
        ArrayList<Diem> Ds_MMT=ds_mangmaytinhDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_MMT.size();i++)
            {
                System.out.println(i+". "+Ds_MMT.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_MMT.size())
                continue;
            Ds_MMT.set(luachon,nhap_Diem_MMT(luachon));
        }
        ds_mangmaytinhDiem=Ds_MMT;
    }
    public Diem nhap_Diem_JavaNC(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_JavanangcaoDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_JavanangcaoDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_JavaNC()
    {
        ArrayList<Diem> Ds_javanc=ds_JavanangcaoDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_javanc.size();i++)
            {
                System.out.println(i+". "+Ds_javanc.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_javanc.size())
                continue;
            Ds_javanc.set(luachon,nhap_Diem_JavaNC(luachon));
        }
        ds_JavanangcaoDiem=Ds_javanc;
    }
    public Diem nhap_Diem_GDTC4(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_gdtc4Diem.get(i).getTen_sv());
        diem.setMa_sv(ds_gdtc4Diem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_GDTC4()
    {
        ArrayList<Diem> Ds_gdtc4=ds_gdtc4Diem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_gdtc4.size();i++)
            {
                System.out.println(i+". "+Ds_gdtc4.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_gdtc4.size())
                continue;
            Ds_gdtc4.set(luachon,nhap_Diem_GDTC4(luachon));
        }
        ds_gdtc4Diem=Ds_gdtc4;
    }
    public Diem nhap_Diem_CSDL(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_CSDLDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_CSDLDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_CSDL()
    {
        ArrayList<Diem> Ds_csdl=ds_CSDLDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_csdl.size();i++)
            {
                System.out.println(i+". "+Ds_csdl.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_csdl.size())
                continue;
            Ds_csdl.set(luachon,nhap_Diem_CSDL(luachon));
        }
        ds_CSDLDiem=Ds_csdl;
    }
    public Diem nhap_Diem_BMTT(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_BaomatttDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_BaomatttDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_BMTT()
    {
        ArrayList<Diem> Ds_BMTT=ds_BaomatttDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_BMTT.size();i++)
            {
                System.out.println(i+". "+Ds_BMTT.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_BMTT.size())
                continue;
            Ds_BMTT.set(luachon,nhap_Diem_BMTT(luachon));
        }
        ds_BaomatttDiem=Ds_BMTT;
    }
    public Diem nhap_Diem_Web(int i)
    {
        Diem diem=new Diem();
        diem.setTen_sv(ds_ThietkewebDiem.get(i).getTen_sv());
        diem.setMa_sv(ds_ThietkewebDiem.get(i).getMa_sv());
        diem.nhap();
        return diem;
    }
    public void Nhap_diem_mon_Web()
    {
        ArrayList<Diem> Ds_web=ds_ThietkewebDiem;
        int luachon=0;
        while (true)
        {
            for (int i=1;i< Ds_web.size();i++)
            {
                System.out.println(i+". "+Ds_web.get(i).getTen_sv());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>=Ds_web.size())
                continue;
            Ds_web.set(luachon,nhap_Diem_Web(luachon));
        }
        ds_ThietkewebDiem=Ds_web;
    }
    //    public void Xuat_danh_sach_Mon_KTCT()
//    {
//        for (int i=1;i<ds_ktctDiem.size();i++)
//            System.out.println(ds_ktctDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_DHMT()
//    {
//        for (int i=1;i<ds_dhmtDiem.size();i++)
//            System.out.println(ds_dhmtDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_HDH()
//    {
//        for (int i=1;i<ds_hdhDiem.size();i++)
//            System.out.println(ds_hdhDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_JavaCB()
//    {
//        for (int i=1;i<ds_javaDiem.size();i++)
//            System.out.println(ds_javaDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_GDTC()
//    {
//        for (int i=1;i<ds_gdtcDiem.size();i++)
//            System.out.println(ds_gdtcDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_PTTKGT()
//    {
//        for (int i=1;i<ds_ptvgtDiem.size();i++)
//            System.out.println(ds_ptvgtDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_TTNT()
//    {
//        for (int i=1;i<ds_ttntDiem.size();i++)
//            System.out.println(ds_ttntDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_PLDC()
//    {
//        for (int i=1;i<ds_pldcDiem.size();i++)
//            System.out.println(ds_pldcDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_LaptrinhC()
//    {
//        for (int i=1;i<ds_laptrinhCDiem.size();i++)
//            System.out.println(ds_laptrinhCDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_TACN()
//    {
//        for (int i=1;i<ds_TACNDiem.size();i++)
//            System.out.println(ds_TACNDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_MMT()
//    {
//        for (int i=1;i<ds_mangmaytinhDiem.size();i++)
//            System.out.println(ds_mangmaytinhDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_JavaNC()
//    {
//        for (int i=1;i<ds_JavanangcaoDiem.size();i++)
//            System.out.println(ds_JavanangcaoDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_GDTC4()
//    {
//        for (int i=1;i<ds_gdtc4Diem.size();i++)
//            System.out.println(ds_gdtc4Diem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_CSDL()
//    {
//        for (int i=1;i<ds_CSDLDiem.size();i++)
//            System.out.println(ds_CSDLDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_BMTT()
//    {
//        for (int i=1;i<ds_BaomatttDiem.size();i++)
//            System.out.println(ds_BaomatttDiem.get(i).xuat());
//    }
//    public void Xuat_danh_sach_Mon_web()
//    {
//        for (int i=1;i<ds_ThietkewebDiem.size();i++)
//            System.out.println(ds_ThietkewebDiem.get(i).xuat());
//    }
    public void Nhap_diem(int i)
    {
        int luachon=0,z=0;
        for (int j=1;j<tkb_GV.size();j++)
        {
            if (ds_giang_vien.get(i).getMa().equals(tkb_GV.get(j).getMa_GV()))
            {
                i=j;
                break;
            }
        }
        ArrayList<tkb> Tkb_GV=tkb_GV.get(i).getDs_tkb_gv();
        while (true)
        {
            System.out.println("NHẬP ĐIỂM: ");
            for (int j=0;j<Tkb_GV.size();j++)
            {
                System.out.println((j+1)+". "+Tkb_GV.get(j).getTenhocphan());
            }
            System.out.println("0. Kết thúc.");
            System.out.print("\nNhập sự lựa chọn: ");
            luachon=sc.nextInt();
            if (luachon==0)
                break;
            if (luachon<0||luachon>Tkb_GV.size())
                continue;
            for (int j=0;j<dsmon.size();j++)
            {
                if (Tkb_GV.get(luachon-1).getTenhocphan().equals(dsmon.get(j)))
                {
                    z=j+1;
                    System.out.println(z);
                    break;
                }
            }
            switch (z)
            {

                case 1:
                    System.out.println("lele");
                    Nhap_diem_mon_KTCT();

                    break;
                case 2:
                    Nhap_diem_mon_DHMT();
                    break;
                case 3:
                    Nhap_diem_mon_HDH();
                    break;
                case 4:
                    Nhap_diem_mon_Java();
                    break;
                case 5:
                    Nhap_diem_mon_GDTC();
                    break;
                case 6:
                    Nhap_diem_mon_PTTKGT();
                    break;
                case 7:
                    Nhap_diem_mon_TTNT();
                    break;
                case 8:
                    Nhap_diem_mon_PLDC();
                    break;
                case 9:
                    Nhap_diem_mon_LaptrinhC();
                    break;
                case 10:
                    Nhap_diem_mon_TACN();
                    break;
                case 11:
                    Nhap_diem_mon_MMT();
                    break;
                case 12:
                    Nhap_diem_mon_JavaNC();
                    break;
                case 13:
                    Nhap_diem_mon_GDTC4();
                    break;
                case 14:
                    Nhap_diem_mon_CSDL();
                    break;
                case 15:
                    Nhap_diem_mon_BMTT();
                    break;
                case 16:
                    Nhap_diem_mon_Web();
                    break;
                default:
                    break;
            }
        }
    }

    public void Ket_qua_hoc_tap(int i)
    {
        int luachon=0,z=0,tmp=i;
        for (int j=1;j<tkb_SV.size();j++)
        {
            if (ds_sinh_vien.get(i).getMa().equals(tkb_SV.get(j).getMa_SV()))
            {
                z=j;
                break;
            }
        }
        ArrayList<tkb> Tkb_SV=tkb_SV.get(z).getDs_tkb_sv();

        System.out.println("\nKẾT QUẢ HỌC TẬP:");
        for (int j=0;j<Tkb_SV.size();j++)
        {
            for (z=0;z<dsmon.size();z++)
                if (Tkb_SV.get(j).getTenhocphan().equals(dsmon.get(z)))
                {
                    luachon=z+1;
                    System.out.print(dsmon.get(z)+"\t");
                    switch (luachon)
                    {
                        case 1:
                            for (i=1;i<ds_ktctDiem.size();i++)
                            {
                                if (ds_ktctDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_ktctDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            for (i=1;i<ds_dhmtDiem.size();i++)
                            {
                                if (ds_dhmtDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_dhmtDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 3:
                            for (i=1;i<ds_hdhDiem.size();i++)
                            {
                                if (ds_hdhDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_hdhDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 4:
                            for (i=1;i< ds_javaDiem.size();i++)
                            {
                                if (ds_javaDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_javaDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 5:
                            for (i=1;i< ds_gdtcDiem.size();i++)
                            {
                                if (ds_gdtcDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_gdtcDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 6:
                            for (i=1;i< ds_ptvgtDiem.size();i++)
                            {
                                if (ds_ptvgtDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_ptvgtDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 7:
                            for (i=1;i< ds_ttntDiem.size();i++)
                            {
                                if (ds_ttntDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_ttntDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 8:
                            for (i=1;i< ds_pldcDiem.size();i++)
                            {
                                if (ds_pldcDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_pldcDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 9:
                            for (i=1;i< ds_laptrinhCDiem.size();i++)
                            {
                                if (ds_laptrinhCDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_laptrinhCDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 10:
                            for (i=1;i< ds_TACNDiem.size();i++)
                            {
                                if (ds_TACNDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_TACNDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 11:
                            for (i=1;i< ds_mangmaytinhDiem.size();i++)
                            {
                                if (ds_mangmaytinhDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_mangmaytinhDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 12:
                            for (i=1;i< ds_JavanangcaoDiem.size();i++)
                            {
                                if (ds_JavanangcaoDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_JavanangcaoDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 13:
                            for (i=1;i< ds_gdtc4Diem.size();i++)
                            {
                                if (ds_gdtc4Diem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_gdtc4Diem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 14:
                            for (i=1;i< ds_CSDLDiem.size();i++)
                            {
                                if (ds_CSDLDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_CSDLDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 15:
                            for (i=1;i< ds_BaomatttDiem.size();i++)
                            {
                                if (ds_BaomatttDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_BaomatttDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        case 16:
                            for (i=1;i< ds_ThietkewebDiem.size();i++)
                            {
                                if (ds_ThietkewebDiem.get(i).getMa_sv().equals(ds_sinh_vien.get(tmp).getMa()))
                                {
                                    ds_ThietkewebDiem.get(i).xuat_theo_SV();
                                    break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                }
        }
    }
}

