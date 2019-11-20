package com.wzx.it.eurekaservice;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class EurekaserviceApplicationTests {

    @Autowired
    StringEncryptor stringEncryptor;

    @Test
    public void decrypter() {
        log.info("[admin]加密后={}", stringEncryptor.encrypt("admin"));
        log.info("[aSM5t2r6wtNrO0kdwk9Ghw==]解密后={}", stringEncryptor.decrypt("aSM5t2r6wtNrO0kdwk9Ghw=="));
    }

    @Test
    public void testGenUUID(){
        log.info("生成uuid：{}",UUID.randomUUID().toString());
    }

}
