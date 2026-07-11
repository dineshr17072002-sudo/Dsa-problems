package PatternPrint;

public class lookAndsay {
    public static void main(String[] args) {
        int n=5;
        String s="1";
        System.out.println(s);

        for(int i=1;i<n;i++){
            String s1=""  ;
          char a=s.charAt(0);
          int c=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)!=s.charAt(j-1)){
                    s1+= c+""+a;
                    c=1;
                    a=s.charAt(j);
                }else{
                    c++;
                }
            }
            s1+= c+""+a;
            System.out.println(s1);
            s=s1;
        }


    }
}

