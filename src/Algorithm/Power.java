package Algorithm;

public class Power {
    public int a_pow_b (int a, int b){
        if(b == 0){
            return 1;
        }
        int half_result = a_pow_b(a,b/2);
        if(b%2 == 0){
            return half_result* half_result;
        }else{
            return half_result*half_result*a;
        }

    }
}
