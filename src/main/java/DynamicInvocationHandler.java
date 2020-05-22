import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

public class DynamicInvocationHandler implements InvocationHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(DynamicInvocationHandler.class);

    private Object target;


    public DynamicInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        LOGGER.info("Invoked method:{}", method.getName());

        if(o instanceof Map) LOGGER.info("object is a Map type");

        Object result = method.invoke(target,objects);


        return result;
    }
}
