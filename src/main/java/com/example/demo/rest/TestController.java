package com.example.demo.rest;

import com.example.demo.service.TestService;
import com.example.demo.vo.StaticDataVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/rest/api/v1/test")
public class TestController {
    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public List<StaticDataVO> getStaticData() {
        log.info("returning data from service");
        return testService.getStaticData();
    }
}
