package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {
    /*Bài 1: hãy viết method nhận vào một chuỗi qua tham số. hãy trả ra danh sách các ký tự xuất hiện nhiều
    hơn 1 lần.*/
    public Character[] Kytu(String data) {
        int dem = 0;
        List<Character> listkytu = new ArrayList<>();
        data = data.toLowerCase().trim();
        data = data.replaceAll("\\s+","");

        char[] Data = data.toCharArray();

        for (int i = 0; i < Data.length; i++) {
            for (int j = i ; j < Data.length; j++){
                if (Data[i] == Data[j])
                    dem++;
            }
            if (dem > 1 ) {
                listkytu.add(Data[i]);
            }
            dem = 0;
        }
        //lọc các ký tự bị trùng
        List<Character> listkytus = new ArrayList<>();
        for (int i = 0; i < listkytu.size(); i++) {
            if(!listkytus.contains(listkytu.get(i))){ //contains đã tồn tại hay chưa
                listkytus.add(listkytu.get(i));
            }
        }
        System.out.println(listkytus);
        return listkytus.toArray(new Character[0]);
    }
    @Test
    public void Test_Kytuxuathien(){
        String input = "abcaB C d EE ";
        Character[] expceted = {'a','b','c','e'};
        Character[]  actual = Kytu(input);
        Assert.assertArrayEquals(expceted,actual);
    }
    /*Bài 2: hãy viết method nhận vào một chuỗi số. hãy tính tổng chác chữ số có trong chuỗi.*/
    public Integer sum_ChuoiSo(String chuoi) {
        Integer Sum = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            Sum = Sum + Integer.parseInt(String.valueOf(chuoi.charAt(i)));
            //    System.out.println(chuoi.charAt(i));
        }
        //System.out.println(Sum);
        return Sum;
    }

    @Test
    public void Test_SumChuoiSo() {
        String chuoiSo = "1412";
        Integer expected = 8;
        Integer actual = sum_ChuoiSo(chuoiSo);
        Assert.assertEquals(expected, actual);
    }

    /*Bài 4: Hãy viết method nhận vào 1 chuỗi bất kỳ, hãy viết giải thuật đảo ngược chuỗi này.*/
    public String DaoNguoc(String chuoi) {
        String Nguoc = "";
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            Nguoc = Nguoc + chuoi.charAt(i);
        }

        return Nguoc;
    }

    @Test
    public void Test_chuoiNguoc() {
        String chuoi = "abCD 236";
        String expected = "632 DCba";
        String actual = DaoNguoc(chuoi);
        Assert.assertEquals(expected, actual);
    }

    /*Bài 5: hãy viết method nhập vào 1 chuỗi. Hãy viết giải thuật kiểm tra xem chuỗi này có phải là alphanumber
     hay ko.
    */
    public boolean Alphanumber(String data) {
        boolean kq = false;
        char[] data1 = data.toCharArray();
        for (int i = 0; i < data.length(); i++){
            if (Character.isDigit(data1[i]))
                return true;
        }
        return false;
    }
    @Test
    public void Test_alphanmumber(){
        String input = "abc 5 2";
        boolean expected = true;
        boolean actual = Alphanumber(input);
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }
    /*Bài 6: Hãy viết method nhận vào chuỗi là họ và tên của một người. Hãy viết giải thuật chuẩn hóa họ và tên,
    (chữ cái đầu tiên của tên, họ và tên đệm viết hoa, còn các ký tự khác viết hoa. )*/
    public  String chuanHoa(String data){
        String chuanhoa = data.trim().toLowerCase();
        chuanhoa = chuanhoa.replaceAll("\\s+"," ");
        String[] temp = chuanhoa.split(" ");
        chuanhoa = "";
        for (int i = 0; i < temp.length ; i++) {
            chuanhoa += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1) // náº¿u tempt[i] khÃ´ng pháº£i tá»« cuá»‘i cÃ¹ng
                chuanhoa+=" ";   // cá»™ng thÃªm má»™t khoáº£ng tráº¯ng
        }
        return chuanhoa;
    }
    @Test
    public void Test_chuanHoa(){
        String input = "  ngUyen van a";
        String expected = "Nguyen Van A";
        String actual = chuanHoa(input);
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }
    /*Bài 7: Hãy viết method nhậ vào một chuỗi bất kỳ.
     */
    public String[] demKyTu(String data) {
        int dem = 0;
        List<Integer> solan = new ArrayList<>();
        List<Character> listkytu = new ArrayList<>();
        data = data.toLowerCase().trim();
        data = data.replaceAll("\\s+","");

        char[] Data = data.toCharArray();

        for (int i = 0; i < Data.length; i++) {
            for (int j = i ; j < Data.length; j++){
                if (Data[i] == Data[j])
                    dem++;
            }
            if (dem > 0 ) {
                listkytu.add(Data[i]);
                solan.add(dem);
            }
            dem = 0;
        }
        //lá»c cÃ¡c kÃ½ tá»± bá»‹ trÃ¹ng
        List<Character> listkytus = new ArrayList<>();
        List<Integer> solans = new ArrayList<>();
        List<String> thongke = new ArrayList<>();
        for (int i = 0; i < listkytu.size(); i++) {
            if(!listkytus.contains(listkytu.get(i))){ //contains Ä‘Ã£ tá»“n táº¡i hay chÆ°a
                listkytus.add(listkytu.get(i));
                solans.add(solan.get(i));
                thongke.add(String.valueOf(listkytus.get(i)));
                thongke.add(solan.get(i).toString());
            }
        }

        System.out.println(solans);
        System.out.println(listkytus);

        return thongke.toArray(new String[0]);
    }
    @Test
    public void Test_demKyTu(){
        String input = "abcaB";
        String[] expceted = {"a","2","b","2","c","1"};
        String[]  actual = demKyTu(input);
        Assert.assertArrayEquals(expceted,actual);
    }
}
