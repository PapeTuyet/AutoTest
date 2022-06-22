import org.junit.Test;
import java.util.Arrays;
import static org.apache.commons.lang3.ArrayUtils.add;

public class Bai1 {
    public static boolean locSoNgTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    @Test
    public static void main(String[] args) {
        //Giả thiết
        int[] arrNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 90, 12, 13};
        Integer[] expected = {2, 3, 5, 7, 13};

        Integer[] listSoNgTo = new Integer[0];

        for (int i = 0; i < arrNumber.length; i++)
            if (locSoNgTo(arrNumber[i])) {
                listSoNgTo = add(listSoNgTo,arrNumber[i]);
            }
        System.out.println("List số nguyên tố là " + Arrays.toString(listSoNgTo));

        //Kiểm tra
        if (Arrays.equals(expected, listSoNgTo))
            System.out.println("List số nguyên tố trùng với expect");
        else
            System.out.println("List số nguyên tố KHÔNG trùng với expect");
    }
}
