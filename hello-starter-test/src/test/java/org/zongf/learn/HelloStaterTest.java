package org.zongf.learn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zongf.learn.hello.HelloService;

@SpringBootTest
class HelloStaterTest {

    @Autowired
    private HelloService helloService;

    @Test
    void sayHello() {
        helloService.sayHello("zhangsan");
    }

}
