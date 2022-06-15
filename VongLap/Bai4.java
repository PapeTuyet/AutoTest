import org.junit.Assert;
import org.junit.Test;

public class Bai4 {
    private static int Fibonaci(int n)
    {
        int f0 = 0, f1 = 1, fn = 1;
        if(n<0) {
            return -1;
        }
        else if((n==0)||(n==1)) {
            return n;
        }
        else {
            for(int i=2; i<n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        System.out.println (fn);
        return fn;
    }
    @Test
    public void Test_Fibonaci () {
        // Gia thiet
        int n = 4;

        int expected = 3;
        // Thuc hien
        int actual= this.Fibonaci(n);
        // Kiem tra
        Assert.assertEquals(expected,actual);
    }
}

