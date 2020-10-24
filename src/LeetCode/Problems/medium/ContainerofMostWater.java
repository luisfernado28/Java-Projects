package LeetCode.Problems.medium;

public class ContainerofMostWater {

    public static void main(String[] arg0){

        System.out.println(containerOfWater(new int[]{4,3,2,1,4}));
    }

    public static int containerOfWater(int[] points){
        int max=0, pointeri=0,pointerf=points.length;
        while (pointeri< pointerf){
            int newCap= Math.abs(points[pointerf]-points[pointeri]) * (pointerf-pointeri);
            max= Math.max(max,newCap);
            if(points[pointeri]<=points[pointerf])
                pointeri++;
            else
                pointerf--;
        }
        return max;
    }
}
