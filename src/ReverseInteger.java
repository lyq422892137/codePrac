import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseInteger {
    public int reverse(int x) {
        long result;
        if (x >= (Math.pow(2, 31) - 1) || x <= -Math.pow(2, 31)) {
            result = 0;
        } else {
            String str = Integer.toString(x);
            String sign = new String();
            int length = str.length();
            int flag = 0;
            Pattern pattern = Pattern.compile("[0-9]*$");
            Matcher isNum = pattern.matcher(str);
            if (!isNum.matches()) {
                sign = str.substring(0, 1);
                str = str.substring(1, length);
                flag = 1;
            }
            str = new StringBuffer(str).reverse().toString();
            if (str.split("")[0].equals("0")) {
                str = str.substring(1, str.length());
            }
            if (flag == 1) {
                str = sign + str;
            }
            if (str.equals("")) {
                result = 0;
            } else
                result = Long.parseLong(str);
            if (result >= Math.pow(2, 31) - 1 || result <= -Math.pow(2, 31)) {
                result = 0;
            }
        }
        return (int) result;
    }
}
