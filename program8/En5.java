package program8;

import java.util.Arrays;
import java.util.List;

public class En5 {
        public static void main(String[] args) {
            List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
            int sum = 0;

            for (int value : integerList) {
                sum += value;
            }
            
            // 合計を出力
            System.out.println("合計値は:" + sum + "です。");

            double avarage = (double) sum / integerList.size();
            System.out.println("平均値は:" + avarage + "です。");

        }
    
}
