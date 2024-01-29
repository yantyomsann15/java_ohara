package program8;

import java.util.LinkedHashMap;
import java.util.Map;

public class En14 {
    public static void main(String[] args) {
        Map<String, String> Seasons = new LinkedHashMap<>();
        Seasons.put("野菜    :", "季節");
        Seasons.put("キャベツ:", "春");
        Seasons.put("スイカ  :", "夏");
        Seasons.put("ナス    :", "秋");
        Seasons.put("ハクサイ:", "冬");

        for (Map.Entry<String, String> entry : Seasons.entrySet()) {
            System.out.println(entry.getKey() +  entry.getValue());
        }
        
    }
    
}
