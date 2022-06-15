import org.junit.Assert;
import org.junit.Test;

public class Bai2 {
    boolean checkNguyenTo(int n){
        if(n<2){
            return false;
        }else {
            for(int i =2;i<=Math.sqrt(n);i++){
                if(n % i == 0)
                    return false;
            }
        }
        return true;
    }
    @Test
    public void Test_checkNguyenTo() {
        // Gia thiet
        int n = 7;

        boolean expected = true;
        // Thuc hien
        boolean actual = this.checkNguyenTo(n);
        // Kiem tra
        Assert.assertEquals(expected, actual);
    }
}
