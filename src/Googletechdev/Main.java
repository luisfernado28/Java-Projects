package Googletechdev;

public class Main {
    public static void main(String[] args) {
        int[] nums={1, 2, 1, 1, 3};
        int value1=nums[0];
        int value2=nums[nums.length-1];
        int length=1;
        int newLenght=0;
        
        for(int i = 0; i< nums.length-1 ; i++){
            if (nums[i]==value2){
                length = (nums.length-i);
                i=nums.length+1;
            }
        }

        for(int i = (nums.length-1); i> 0 ; i--){
            if (nums[i]==value1){
                newLenght = i+1;

                if(newLenght>length){
                    length=newLenght;
                }
                i=-1;
            }
        }
        System.out.println(length);
    }
}
