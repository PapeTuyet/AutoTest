import org.junit.Assert;
import org.junit.Test;


public class Bai1 {
    /*
    Bài 1: Viết method nhận vào một số nguyên qua tham số.
    Hãy tính tổng các số nhỏ hơn số đó. Viết testmethod cho method vừa viết
     */
    public int Tong(int n)
    {
        int Tong = 0;
        for (int i = 0; i <n; i++) {
            Tong = Tong + i;
        }
        System.out.println (Tong);
        return Tong;
    }
    @Test
    public void Test_Tong () {
        // Gia thiet
        int n = 6;

        int expected = 15;
        // Thuc hien
        int actual= this.Tong(n);
        // Kiem tra
        Assert.assertEquals(expected,actual);
    }
}
