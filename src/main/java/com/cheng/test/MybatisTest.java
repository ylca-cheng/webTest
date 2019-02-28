package com.cheng.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cheng.domain.User;
import com.cheng.service.intf.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class MybatisTest {

	private static Logger logger = LoggerFactory.getLogger(MybatisTest.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private UserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        List<User> users = userService.findAll();  
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName()); 
        for(User user : users) {
        	logger.info(JSON.toJSONString(user));  
        }
    }  
}
