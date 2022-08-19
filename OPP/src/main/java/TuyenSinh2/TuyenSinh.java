package TuyenSinh2;
import java.util.ArrayList;
import java.util.List;

public class TuyenSinh{
    List<ThiSinh> listThiSinh;
    List<KhoiA> listA;
    List<KhoiB> listB;
    List<KhoiC> listC;

    public TuyenSinh() {
        this.listThiSinh = new ArrayList<>();
        this.listA = new ArrayList<>();
        this.listB = new ArrayList<>();
        this.listC = new ArrayList<>();
    }

    public List<ThiSinh> getListThiSinh() {
        return listThiSinh;
    }

    public void setListThiSinh(List<ThiSinh> listThiSinh) {
        this.listThiSinh = listThiSinh;
    }

    public List<KhoiA> getListA() {
        return listA;
    }

    public void setListA(List<KhoiA> listA) {
        this.listA = listA;
    }

    public List<KhoiB> getListB() {
        return listB;
    }

    public void setListB(List<KhoiB> listB) {
        this.listB = listB;
    }

    public List<KhoiC> getListC() {
        return listC;
    }

    public void setListC(List<KhoiC> listC) {
        this.listC = listC;
    }

    public void addThiSinh(ThiSinh ts){
        listThiSinh.add(ts);
    }

    public void addThiSinhA(ThiSinh ts, KhoiA a){
        listThiSinh.add(ts);
        listA.add(a);
    }

    public void addThiSinhB(ThiSinh ts, KhoiB b){
        listThiSinh.add(ts);
        listB.add(b);
    }
    public void addThiSinhC(ThiSinh ts, KhoiC c){
        listThiSinh.add(ts);
        listC.add(c);
    }
    //tạo danh sách 10 sinh viên các khôi
    public void DS_SinhvienKhoiA(){
        this.addThiSinhA(new ThiSinh(1,"Nguyen A","HN","A"),new KhoiA(9,8,7));
        this.addThiSinhA(new ThiSinh(2,"Nguyen","HN","A"),new KhoiA(9,8,7));
        this.addThiSinhA(new ThiSinh(3,"Van","HN","A"),new KhoiA(7,6,7));
        this.addThiSinhA(new ThiSinh(4,"Hoa","HN","A"),new KhoiA(6,5,6));
        this.addThiSinhA(new ThiSinh(5,"Hue","TB","A"),new KhoiA(9,8,7));
        this.addThiSinhA(new ThiSinh(6,"Duc A","HN","A"),new KhoiA(5,3,4));
        this.addThiSinhA(new ThiSinh(7,"Tram A","TB","A"),new KhoiA(4,2,2));
        this.addThiSinhA(new ThiSinh(8," Khang","HP","A"),new KhoiA(8,8,8));
        this.addThiSinhA(new ThiSinh(9,"Tu Hoa","HN","A"),new KhoiA(7.8,8,8.7));
        this.addThiSinhA(new ThiSinh(10,"Thanh","HN","A"),new KhoiA(9,8,7));
    }
    public void DS_SinhvienKhoiB(){
        this.addThiSinhB(new ThiSinh(111,"Nguyen B","HN","B"),new KhoiB(9,8,7));
        this.addThiSinhB(new ThiSinh(222,"BBB Nguyen","HN","B"),new KhoiB(9,8.5,7));
        this.addThiSinhB(new ThiSinh(322,"B Van","HN","B"),new KhoiB(4,5,6));
        this.addThiSinhB(new ThiSinh(422,"B Hoa","HN","B"),new KhoiB(6,5,6));
        this.addThiSinhB(new ThiSinh(225,"B Hue","TB","B"),new KhoiB(9,8.5,8));
        this.addThiSinhB(new ThiSinh(622,"B Duc A","HN","B"),new KhoiB(5,3,4));
        this.addThiSinhB(new ThiSinh(722,"B Tram A","TB","B"),new KhoiB(4,2,2));
        this.addThiSinhB(new ThiSinh(8222," B Khang","HP","B"),new KhoiB(8,9.5,8));
        this.addThiSinhB(new ThiSinh(922,"B Tu Hoa","HN","B"),new KhoiB(7.8,8,8.7));
        this.addThiSinhB(new ThiSinh(1022,"B Thanh","HN","B"),new KhoiB(10.0,9,10));
    }
    public void DS_SinhvienKhoiC(){
        this.addThiSinhC(new ThiSinh(133,"Nguyen C","HN","C"),new KhoiC(9,8,7));
        this.addThiSinhC(new ThiSinh(332,"CCCC Nguyen","HN","C"),new KhoiC(9,8,7));
        this.addThiSinhC(new ThiSinh(333,"CC Van","HN","C"),new KhoiC(6,6,7));
        this.addThiSinhC(new ThiSinh(433,"CC Hoa","HN","C"),new KhoiC(6,5,6));
        this.addThiSinhC(new ThiSinh(335,"CC Hue","TB","C"),new KhoiC(7,8.5,7));
        this.addThiSinhC(new ThiSinh(336,"CC Duc A","HN","C"),new KhoiC(5,3,4));
        this.addThiSinhC(new ThiSinh(337,"CC Tram A","TB","C"),new KhoiC(4,2,2));
        this.addThiSinhC(new ThiSinh(338,"CCC Khang","HP","C"),new KhoiC(8,8,8));
        this.addThiSinhC(new ThiSinh(339,"CC Tu Hoa","HN","C"),new KhoiC(7.8,8,8.7));
        this.addThiSinhC(new ThiSinh(3310,"CCC Thanh","HN","C"),new KhoiC(9,10,9));
    }
  
}

