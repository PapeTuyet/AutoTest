import org.junit.Assert;
import org.junit.Test;

public class Bai3 {
    boolean checkNguyenTo(int n) {
        if (n < 2) {
            return false;
        } else
        {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
    public int checkNT2chuso ()
    {
        int dem = 0;
        for (int i=10; i<= 99; i ++)
        {
            if (checkNguyenTo(i)==true) {
                dem = dem + 1;
            }
        }
        System.out.println(dem);
        return dem;
        }

    @Test
    public void Test_checkNT2chuso() {
        // Gia thiet
       // int dem =0;
        int expected = 21 ;
        // Thuc hien
        int actual = this.checkNT2chuso();
        // Kiem tra
        Assert.assertEquals(expected, actual);
    }
}
