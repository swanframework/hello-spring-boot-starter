package org.zongf.learn.hello;

/**
 * @author: zongf
 * @created: 2020-01-12
 * @since 1.0
 */
public class HelloService {

    // 使用配置文件, 不能自动注入
    private HelloProperties helloProperties;

    public void sayHello(String name){
        System.out.println("版本号:" + helloProperties.getVersion());
        System.out.println("http代理:" + helloProperties.getHttpProxy().getIp() + ":" + helloProperties.getHttpProxy().getPort());
        System.out.println("http代理:" + helloProperties.getHttpsProxy().getIp() + ":" + helloProperties.getHttpsProxy().getPort());
        System.out.println("hello, " + name);
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

}
