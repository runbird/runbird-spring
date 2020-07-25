package com.scy.spring;

import com.scy.spring.beans.Student;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 类名： SpringClient <br>
 * 描述：TODO <br>
 * 创建日期： 2020/7/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SpringClient {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);

        beanDefinitionReader.loadBeanDefinitions(resource);

        Student student = (Student) defaultListableBeanFactory.getBean("student");

        System.out.println(student.toString());
    }
}
