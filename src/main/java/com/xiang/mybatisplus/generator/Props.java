package com.xiang.mybatisplus.generator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Props {

    private  String name;

    //创建Properties对象
    Properties pro = new Properties();

    public Props() {

    }

    public Props(String name) {
        System.out.println(name);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\idea\\ideaworks\\mybatis-plus\\src\\main\\resources\\generator.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            pro.load(fis);//读取 配置 文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getStr(String name){
        return pro.getProperty(name);
    }

}
