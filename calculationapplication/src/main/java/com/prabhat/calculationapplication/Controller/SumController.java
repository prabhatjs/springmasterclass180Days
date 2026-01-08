package com.prabhat.calculationapplication.Controller;
import com.prabhat.calculationapplication.DTO.SumDTO;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class SumController {
   // Using Query Parameters (Most Common)
    @GetMapping("/sum")
public int addFun(@RequestParam int a, @RequestParam int b) {
        return a+b;
    }
    //DTO (Data Transfer Object)
    @PostMapping("/sum2")
public int getSum(@RequestBody SumDTO dto) {
        return dto.getA()+dto.getB();

}
//Using Path Variables
@GetMapping("/Sum3/{a}/{b}")
    public int getSum3(@PathVariable int a, @PathVariable int b) {
        return a+b;
}

}
