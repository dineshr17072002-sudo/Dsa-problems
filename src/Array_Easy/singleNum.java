package Array_Easy;

public class singleNum {
    static void main(String[] args) {
        int[]arr={1,0,2,3,3,0,1};
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        System.out.println(xor);
    }
}
