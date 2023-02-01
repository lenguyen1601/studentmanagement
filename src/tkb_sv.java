import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class tkb_sv implements Serializable {
    private ArrayList<tkb> ds_tkb_sv;
    private String ma_SV;

    public String getMa_SV() {
        return ma_SV;
    }

    public void setMa_SV(String ma_SV) {
        this.ma_SV = ma_SV;
    }

    public ArrayList<tkb> getDs_tkb_sv() {
        return ds_tkb_sv;
    }

    public void setDs_tkb_sv(ArrayList<tkb> ds_tkb_sv) {
        this.ds_tkb_sv = ds_tkb_sv;
    }




    public void xuat_ds_SV()
    {
        Collections.sort(ds_tkb_sv, new Comparator<tkb>() {
            @Override
            public int compare(tkb o1, tkb o2) {
                if (o1.getThu()< o2.getThu())
                    return -1;
                else  if (o1.getThu()> o2.getThu())
                    return 1;
                else
                    return 0;
            }
        });
        System.out.println("THỜI KHÓA BIỂU SINH VIÊN");
        for (int i=0;i<ds_tkb_sv.size();i++)
            System.out.println((i+1)+". "+ds_tkb_sv.get(i).getMahocphan()+"\t"+ds_tkb_sv.get(i).getNhomhocphan()+"\t"+ds_tkb_sv.get(i).getTenhocphan()+"\t"+ds_tkb_sv.get(i).getTinchi()+"\t"+ds_tkb_sv.get(i).getThu()+"\t"+ds_tkb_sv.get(i).getTietString()+"\t");
    }
}
