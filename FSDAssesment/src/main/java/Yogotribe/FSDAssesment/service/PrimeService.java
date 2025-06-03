package Yogotribe.FSDAssesment.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {

    public String primeNmber(int num){
        if(num<=0){
            return "Number should be greater than 0";
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }

}
