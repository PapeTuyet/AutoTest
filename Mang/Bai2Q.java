package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class biatap1 {
    /*Bài 1: Hãy viết method nhận vào một mảng các số nguyên bất kỳ, hãy viết giải thuật lọc ra cá số nguyên tố có
    trong mảng (sử dụng method check snt đã viết ở bài trước). Viết test method cho method này
     */
    public boolean checkSoNgTo(int n){
        //List<Integer> lstSoChan = new ArrayList<>();
        int kq = 1;
        int i=2;
        while (i<2){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    public Integer[] laSoNgTo(int [] arrNumber){
        List<Integer> listSoNgTo = new ArrayList<>();
        for(int i=0; i<arrNumber.length;i++){
            if(checkSoNgTo(arrNumber[i]) == true){
                listSoNgTo.add(arrNumber[i]);
                System.out.println(arrNumber[i] + ",");
            }
        }
        return listSoNgTo.toArray(new Integer[0]);
    }
    @Test
    public void Test_DaySoNgTo() {
        int[] arrNumber = {9, 2, 7, 5, 76, 35, 77, 29, 49, 8, 239, 23, 13};
        Integer[] expected = {2,7,5,29,239,23, 13};
        Integer[] actual = this.laSoNgTo(arrNumber);
    }
    /*Baì 2: hãy viết method nhập vào 2 mảng bất kỳ , hãy lọc ra danh sách các số nguyên xuất hiện ở cả 2 mảng này.
     Viết test method cho methoed vừa viết*/

    public Integer[] laSoNguyen(String[] arr1, String[] arr2){
        List<Integer> listSoNguyen = new ArrayList<>();
        int j;
        for(int i=0; i< arr1.length; i++){
            for(j=0; j<arr2.length; j++){
                if(isNg(arr1[i]) == true && isNg(arr2[j])== true && arr1[i].equals(arr2[j])==true)
                {
                    System.out.println("i = " + arr1[i] + "j + " + arr2[j]);
                    listSoNguyen.add(Integer.valueOf(arr1[i]));
                }
            }
        }
        return listSoNguyen.toArray(new Integer[0]);
    }
    public boolean isNg(String a){
        try{
            int so = Integer.valueOf(a);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @Test
    public void Test_SoNg(){
        String arr1[] = {"0","7","8","t","9","6j","8.7"};
        String arr2[] = {"11","7","2","t","9","6j","8.7","0"};
        Integer[] expected = {0,7,9};
        Integer[] actual = this.laSoNguyen(arr1,arr2);
        Assert.assertEquals(expected,actual);
    }
}
