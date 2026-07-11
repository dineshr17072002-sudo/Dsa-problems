package Array_Easy;

import java.util.HashSet;

public class ContainsDup {
    static void main(String[] args) {
        int[]arr={1,2,3 ,3,4,5};
        HashSet<Integer>set=new HashSet<>();
        for(int n:arr){
            if(set.contains(n)){
                System.out.println(true);           //hashset
                return;
            }
            set.add(n);
        }
        System.out.println(false);
    }
}
/* hastset<>set  for (int n:ar) if(set.contains(n)) sout true else false
 rteun
 set.add(n)
 */