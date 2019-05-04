package cn.fox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {
    @Value("${driverClassName}")
    private String driverClassName;
    private String url;
    private String userName;
    private String passWord;
}
