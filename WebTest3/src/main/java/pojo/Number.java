package pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number {
    private Integer num;

    public Number() {
    }

    public Number(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<Integer> getfactors(Integer num){
        List<Integer> factors = new ArrayList<>();

        for (int i = 1 ; i <= Math.sqrt(num);i++){
            if ( num % i == 0 ){
                factors.add(i);
                int n = num / i;
                if (n != i){
                    factors.add(n);
                }
            }
        }

        Collections.sort(factors);
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(new Number().getfactors(50));
        System.out.println(new Number().getfactors(100));
    }
}
