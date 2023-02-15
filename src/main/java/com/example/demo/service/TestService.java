package com.example.demo.service;

import com.example.demo.vo.StaticDataVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class TestService {
    List<StaticDataVO> staticData = Arrays.asList(new StaticDataVO(1,"value1"), new StaticDataVO(2,"value2"), new StaticDataVO(3, "value3"));

    @Cacheable("staticData")
    public List<StaticDataVO> getStaticData() {
        log.info("getting static data {}", staticData);
        return staticData;
    }
}
