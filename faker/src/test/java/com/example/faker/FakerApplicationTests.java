package com.example.faker;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.faker.shanshan.ShanShanShaBi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FakerApplicationTests {

    @Autowired
    private ShanShanShaBi shanShanShaBi;

    @Test
    public void contextLoads() {
        String result = shanShanShaBi.shanshansolo();
        System.out.println(result);
    }

}
