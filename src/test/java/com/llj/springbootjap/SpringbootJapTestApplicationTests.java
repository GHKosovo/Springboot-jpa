package com.llj.springbootjap;

import com.llj.springbootjap.entity.User;
import com.llj.springbootjap.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
@SpringBootTest()
class SpringbootJapTestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        //userService.addUser(new User(6,"Tom","男","1995-03-23"));
        User user = userService.getUser(1);
        Assert.isNull(user,"user为空");

        System.out.printf("Test\n");
        //userService.printUser();
    }

}
