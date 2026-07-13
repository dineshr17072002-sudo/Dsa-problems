package Array_Midium;

import java.util.ArrayList;

public class Rearrange {
    public static void main(String[] args) {
     int[]arr={2,-6,9,-7,4,-9,-1,6};
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int num:arr){
            if(num>0){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }
        //REARRANGE AN ARRAY
        int n=pos.size();
        for(int i=0;i<n;i++){
            arr[2*i]= pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
