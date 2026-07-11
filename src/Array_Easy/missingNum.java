package Array_Easy;

public class missingNum {
    static void main(String[] args) {
        int[]arr={1,0,2,4};
        int n= arr.length;
        int total=n*(n+1)/2;
        int actual=0;

        for(int num:arr){
            actual+=num;
        }
        System.out.println("missing num:"+ (total-actual));
    }
}
