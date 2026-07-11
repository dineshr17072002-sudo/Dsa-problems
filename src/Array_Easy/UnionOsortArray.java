package Array_Easy;

import java.util.TreeSet;

public class UnionOsortArray {
    static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2={4,5,1,2,3,6,7};
        TreeSet<Integer>set=new TreeSet<>();
     for(int num:arr1){
         set.add(num);
     }
        for(int num:arr2){
            set.add(num);                       //Tree set
        }
        System.out.println(set);
    }
}
