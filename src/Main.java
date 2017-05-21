import java.io.IOException;
import binaryGap.Solution;

/**
 * Created by AnShafs on 05/20/2017.
 */
public class Main {
        public static void main(String[] args) throws IOException {
            Solution gap = new Solution();
            int res = gap.solution(1024);
            System.out.println(Integer.toString(res));
        }
}
