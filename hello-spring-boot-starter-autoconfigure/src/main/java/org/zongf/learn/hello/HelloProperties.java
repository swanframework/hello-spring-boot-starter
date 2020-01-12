package org.zongf.learn.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// 定义application中可配置的属性, 前缀为hello
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private String version;

    @NestedConfigurationProperty
    private HttpProxyProperties httpProxy;

    @NestedConfigurationProperty
    private HttpProxyProperties httpsProxy;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public HttpProxyProperties getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(HttpProxyProperties httpProxy) {
        this.httpProxy = httpProxy;
    }

    public HttpProxyProperties getHttpsProxy() {
        return httpsProxy;
    }

    public void setHttpsProxy(HttpProxyProperties httpsProxy) {
        this.httpsProxy = httpsProxy;
    }
}
