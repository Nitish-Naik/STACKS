import java.util.*;
import java.util.stream.Stream;
public class LargestNumber {
    public static String largestNumber(int[] nums) {
        List<String> strNum = new ArrayList<>();
        for(int i : nums) {
            strNum.add(String.valueOf(i));
        }

        strNum.sort((str1, str2) -> (str2+str1).compareTo(str1+str2));

        if("0".equals(strNum.get(0))) {
            return "0";
        }

        return String.join("", strNum);
    }

    public static List<Integer> lexicalOrder(int n) {
        List<String> a = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            a.add(Integer.toString(i));
        }
        Collections.sort(a);
        System.out.println(a);
        List<Integer> b = new ArrayList<>();
        for(int i=0; i<n; i++) {
            b.add(Integer.parseInt(a.get(i)));
        }
        return b;
    }
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>(lexicalOrder(13));
        System.out.println(ans);
    }
}
