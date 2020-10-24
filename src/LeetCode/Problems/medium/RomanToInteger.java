package LeetCode.Problems.medium;

public class RomanToInteger {

    public static void main(String[] arg0){
        System.out.println(RomanToInteger(60));
    }

    public static String RomanToInteger(int number){
        String res="";
        res = toRoman(number%10,1);
        number/=10;
        int mult=10;
        while (number>0){
            res = toRoman(number%10,mult)+res;
            number/=10;
            mult*=10;
        }
        return res;

    }

    //recibes de number and the multiplayer
    public static String toRoman(int num, int mult){
        if(num==4){
            if (mult==1){
                return "IV";
            }else if(mult == 10){
                return "XL";
            }else {
                return "CD";
            }
        }else if(num==9){
            if (mult==1){
                return "IX";
            }else if(mult == 10){
                return "XC";
            }else {
                return "CM";
            }
        }else {
            return castNoException(num,mult);
        }
    }


    //Cast a free of expection number to Roman
    public static String castNoException(int num,int mult){
        int numbermultiplied= num*mult;
        if(numbermultiplied<5){
            // 1 to 3

            return repeater('I', num);
        }else if (numbermultiplied<10){
            return "V"+repeater('I', num-5);
        } else if (numbermultiplied<50){
            return repeater('X', num);
        }else if (numbermultiplied<100){
            return "L"+ repeater('X', num-(50/10));
        }else if (numbermultiplied<500){
            return repeater('C', num);
        }else if (numbermultiplied<1000) {
            return "D"+repeater('C', num-(500/100));
        }else {
            return repeater('M',num);
        }
    }

    //reapeats as many times is necesary to formulate the string
    public static String repeater(char value,int times){
        String res="";
        for (int i = 0; i < times; i++) {
                res= res+value;
        }
        return res;
    }
}
