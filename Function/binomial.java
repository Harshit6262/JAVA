package Function;

public class binomial {
    public static int fact(int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static int BinCoef(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int BinCoef = fact_n/ (fact_r * fact_nmr);
        return BinCoef;
    }
    public static void main (String[] args){
        System.out.println(BinCoef(5, 2));
    }
    
}
