package com.example.deep.daru.controller;

import com.example.deep.daru.dto.TestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class A {
    @GetMapping("/h")
    private ResponseEntity<String> fun(){
        String s= "Hello";
        return ResponseEntity.ok(s);

    }
    @GetMapping("/dto")
    public TestDto fun2(){
        TestDto testDto=new TestDto();
        testDto.setName("Hero");
        testDto.setAddress("Gurgaon");
        testDto.setPhoneNumber(99674523);
        return testDto;
    }
}
