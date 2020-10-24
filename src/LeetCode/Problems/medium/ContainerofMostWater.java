package LeetCode.Problems.medium;

public class ContainerofMostWater {

    public static void main(String[] arg0){

        System.out.println(containerOfWater(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int containerOfWater(int[] points){
        int max=0, pointeri=0,pointerf=points.length-1;
        while (pointeri< pointerf){
            int newCap= Math.min(points[pointerf],points[pointeri]) * (pointerf-pointeri);
            max= Math.max(max,newCap);
            if(points[pointeri]<=points[pointerf])
                pointeri++;
            else
                pointerf--;
        }
        return max;
    }
}
