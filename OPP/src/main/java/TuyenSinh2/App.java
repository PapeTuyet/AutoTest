package TuyenSinh2;

import org.example.TuyenSinh;

/**
 Bài 3: Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C.
 Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức ưu tiên.
 Thí sinh thi khối A thi các môn: Toán, Lý, Hoá. Trong đó Toán có hệ số 2 các môn khác có hệ số 1
 Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh. Trong đó Hoá có hệ số 2 các môn khác có hệ số 1
 Thí sinh thi khối C thi các môn: Văn, Sử, Địa. Trong đó Văn có hệ số 2 các ôn khác có hệ số 1.
 Yêu cầu 1: Xây dựng các lớp để quản lý các thi sinh dự thi đại học.
 Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:
 * Thêm mới thí sinh.
 * Thực hiện tạo 1 danh sách gồm 10 sinh viên các khối.
 * Đưa ra danh sách các thí sinh trúng tuyển. Có điểm Trung bình các môn thi theo hệ số >=6

 */
public class App 
{
    public static void main( String[] args )
    {
        org.example.TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.DS_SinhvienKhoiA();
        tuyenSinh.DS_SinhvienKhoiB();
        tuyenSinh.DS_SinhvienKhoiC();
        tuyenSinh.DSTS_TrungTuyen();
    //    tuyenSinh.DSTS();
    }
}
