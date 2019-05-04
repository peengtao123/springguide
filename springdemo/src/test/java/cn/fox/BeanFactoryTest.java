package cn.fox;

import cn.fox.internal.Person;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

public class BeanFactoryTest {
    @Test
    public void getBeanTest() throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:test-config.xml");

        System.out.println(res.getURL());

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);

        Person person = factory.getBean("person",Person.class);
        person.display();
    }

    @Test
    public void getConfigBeansTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Beans.class);
        Person person = applicationContext.getBean("person",Person.class);
        person.display();
        System.out.println(this.getClass().getResource("/").getPath());
    }
}
