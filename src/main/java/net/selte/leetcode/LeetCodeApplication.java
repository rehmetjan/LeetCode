package net.selte.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@MapperScan("net.selte.leetcode.mapper")
@SpringBootApplication
public class LeetCodeApplication {
    public static void main(String[] args) {
        log.info("LeetCodeApplication Started Successfully");
        SpringApplication.run(LeetCodeApplication.class, args);
    }
}
