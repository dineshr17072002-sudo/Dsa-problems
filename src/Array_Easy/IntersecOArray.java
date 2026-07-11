package Array_Easy;

import java.util.HashSet;

public class IntersecOArray {
    static void main(String[] args) {
        int[]arr1={1,3,4,5,5,7};
        int[]arr2={8,3,4,9,0,7};

        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();

        for(int n:arr1){
            set.add(n);
        }
        for(int n:arr2){
            if(set.contains(n)){
                result.add(n);
            }

        }
        System.out.println(result);
    }
}
