import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;
import java.util.Map;

public class DemoJdkDynamicProxy {
    private static final Logger logger = LoggerFactory.getLogger(DemoJdkDynamicProxy.class);

    public static void main(String[] args) {

        Map proxyInstance = (Map) Proxy.newProxyInstance(
                DemoJdkDynamicProxy.class.getClassLoader(),
                new Class[]{Map.class},
                new DynamicInvocationHandler()
        );

        proxyInstance.put("hello", "world");
        
    }
}
