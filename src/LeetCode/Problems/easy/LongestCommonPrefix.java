package LeetCode.Problems.easy;

public class LongestCommonPrefix {

    public static void main(String[] arg0){
        System.out.println(longestcommonprefix(new String[]{"ab", "a"}));
    }

    public static String longestcommonprefix(String[] strs){
        if(strs ==null || strs.length==0)
            return "";
        int min=200;
        int minindex=0;
        //for to check minimum length and minimum string index
        for (int i = 0; i < strs.length ; i++) {
            if(strs[i].length()< min){
                min= strs[i].length();
                minindex=i;
            }
        }

        StringBuilder sm= new StringBuilder();
        //For to go around the smallest word in the array
        for (int i = 0; i < strs[0].length(); i++) {
            char letter= strs[0].charAt(i);
            // for to check for the character letter in every word of the array strs
            for (int j = 0; j < strs.length; j++) {
                if(j>strs[j].length()-1){
                    return sm.toString();
                }
                if(letter != strs[j].charAt(i)){

                    return sm.toString();
                }
            }
            sm.append(letter);
        }

        return sm.toString();
    }
}
