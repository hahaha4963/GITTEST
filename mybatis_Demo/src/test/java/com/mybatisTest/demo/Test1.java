package com.mybatisTest.demo;


import com.zf.dao.IUserDao;
import com.zf.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test1 {

    public static void main(String[] args) throws Exception {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlsessionfacatory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //使用工厂生产 sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //使用sqlsession创建代理对象
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        //使用代理对象执行方法
        List<User> list = mapper.findAll();
        list.forEach(user -> System.out.println(user));
        //关闭资源
        sqlSession.close();
        in.close();
    }
}
