package Array_Easy;

public class cons1S {
    static void main(String[] args) {
        int count=0;
        int max=0;
        int []arr={1,2,6,4,4,4,4,3,4,4,4,0,7,4};
        int n=arr.length;
        int target=4;
        for(int i=0;i<n;i++){

            if(target==arr[i]){                                             //intmax=o,int c=0 int target=x
                                                                            //for(int i to n) if(arr[i]==tar c++ max=math.max(max,c)
                count++;                                                    //else c=0,
                max=Math.max(max,count);
            }else {
                count=0;
            }
        }
        System.out.println(max);
    }
}
