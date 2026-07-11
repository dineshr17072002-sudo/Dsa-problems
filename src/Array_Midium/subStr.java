package Array_Midium;

import java.util.Scanner;

public class subStr {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         int n=str.length();

    for(int i=0;i<n;i++){
        for (int j=i+1;j<n;j++){
            System.out.println(str.substring(i,j));
        }

    }}
}
