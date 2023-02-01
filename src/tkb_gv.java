import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class tkb_gv implements Serializable {
    private ArrayList<tkb> ds_tkb_gv;
    private String ma_GV;

    public String getMa_GV() {
        return ma_GV;
    }

    public void setMa_GV(String ma_GV) {
        this.ma_GV = ma_GV;
    }

    public ArrayList<tkb> getDs_tkb_gv() {
        return ds_tkb_gv;
    }

    public void setDs_tkb_gv(ArrayList<tkb> ds_tkb_gv) {
        this.ds_tkb_gv = ds_tkb_gv;
    }

    public void xuat_ds_GV()
    {
        Collections.sort(ds_tkb_gv, new Comparator<tkb>() {
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
        System.out.println("THỜI KHÓA BIỂU GIẢNG VIÊN");
        for (int i=0;i<ds_tkb_gv.size();i++)
            System.out.println((i+1)+". "+ds_tkb_gv.get(i).getMahocphan()+"\t"+ds_tkb_gv.get(i).getNhomhocphan()+"\t"+ds_tkb_gv.get(i).getTenhocphan()+"\t"+ds_tkb_gv.get(i).getTinchi()+"\t"+ds_tkb_gv.get(i).getMahocphan()+"\t"+ds_tkb_gv.get(i).getThu()+"\t"+ds_tkb_gv.get(i).getTietString()+"\t");
    }
}
