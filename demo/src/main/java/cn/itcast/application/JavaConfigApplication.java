package cn.itcast.application;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "cn.itcast.service")
public class JavaConfigApplication {


    @Bean  // <bean id="" class="">
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
