package Array_Midium;
import java.util.ArrayList;
import java.util.Collections;
public class Leader {
        public static void main(String[] args) {

            int[] arr = {16,17,4,3,5,2};

            ArrayList<Integer> leaders = new ArrayList<>();

            int maxRight = arr[arr.length - 1];   //LAST ELEMENT ALWAYS LEADER

            leaders.add(maxRight);

            for(int i = arr.length - 2; i >= 0; i--){

                if(arr[i] >= maxRight){

                    maxRight = arr[i];
                    leaders.add(maxRight);
                }
            }

            Collections.reverse(leaders);

            System.out.println(leaders);
        }
    }

