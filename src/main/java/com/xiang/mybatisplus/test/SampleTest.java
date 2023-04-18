package com.xiang.mybatisplus.test;

import com.xiang.mybatisplus.mbg.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class SampleTest {

    @Autowired
    private RoleMapper userMapper;

  /*  @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Student> userList = userMapper.selectList(null);
System.out.println(("----- selectAll method test ------"));
        userList.forEach(System.out::println);
    }*/

}
