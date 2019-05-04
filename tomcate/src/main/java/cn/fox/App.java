package cn.fox;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import java.io.File;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    private int port = 8080;
    public void start() throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir(".");

//        tomcat.getService().addConnector();

        tomcat.addWebapp("",System.getProperty("user.dir")+ File.separator +"a");
        tomcat.getServer();
        tomcat.start();
        tomcat.getServer().await();
    }

    public static void main(String[] args) throws Exception {
        App starter = new App();
        starter.start();
    }
}
