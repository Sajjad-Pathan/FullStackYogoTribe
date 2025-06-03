package Yogotribe.FSDAssesment.controller;

import Yogotribe.FSDAssesment.service.PrimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fsd")
public class PrimeController {
    PrimeService service=new PrimeService();
    @GetMapping("/prime/{num}")
    private String primeDefinition(@PathVariable Integer num){
        String result="";
        result=service.primeNmber(num);
        return result;
    }
}
