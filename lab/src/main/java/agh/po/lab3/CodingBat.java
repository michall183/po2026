package main.java.agh.po.lab3;


import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static void main(String[] args) {
    }

    public boolean or35 ( int n){
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean loneTeen(int a, int b) {
        boolean bbool =  ( b >=13 && b <=19);
        boolean abool = (a >= 13 && a <= 19 );

        return (!abool && bbool) || (abool && !bbool);
    }

    public boolean nearHundred(int n) {

        return (n - 100 <= 10 && n - 100 >= -10) || (n -200 <= 10 && n - 200 >= -10);
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++){

            if ((nums[i] == 7 && nums[i+1] == 7) || (nums[i] == 7 && nums[i+2] == 7)){
                return true;
            }
        }
        return false;
    }

    public String middleTwo(String str) {
        int midle = str.length() /2;
        return str.substring(midle-1, midle+1);
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b"))
        {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");

            }
        }
        return map;
    }


    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");

            if (aVal.length() > bVal.length()) {
                map.put("c", aVal);
            }
            else if (bVal.length() > aVal.length()){
                map.put("c", bVal);
            }
            else{
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            String word = strings[i];
            String first = word.charAt(0) + "";
            String last = word.charAt(word.length()-1) + "";

            map.put(first, last);
        }
        return map;
    }



}
