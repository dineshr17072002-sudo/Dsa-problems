package DynamicProgram;

public class Knapsack {
    public static void main(String[] args){
        int[] values={60,100,120};
        int[] weight={10,20,30};
        int capacity= 50;
        double ans=method(values,weight,capacity);
        System.out.println(ans);
    }

    static double method(int[] values,int[] weight,int capacity){
        double profit=0;
        double[] ratio=new double[values.length];
        for (int i=0;i< values.length;i++){
            ratio[i]= (double) values[i]/weight[i];
        }
        //buble sort(3 variable swapping)
        for(int i=0;i< values.length-1;i++){
            for(int j=0;j< values.length-i-1;j++){
                if(ratio[j]<ratio[j+1]){
                    double temp=ratio[j];
                    ratio[j]=ratio[j+1];
                    ratio[j+1]=temp;

                    int t1=values[j];
                    values[j]=values[j+1];
                    values[j+1]=t1;

                    t1=weight[j];
                    weight[j]=weight[j+1];
                    weight[j+1]=t1;

                }

            }
        }

        int i=0;
        while (capacity!=0 && i<values.length){
            if(weight[i]<=capacity){
                profit+=values[i];
                capacity-=weight[i];
            }else{
                profit+=(double) capacity/weight[i]*values[i];
                capacity=0;
            }
            i++;
        }
        return profit;
    }
}
