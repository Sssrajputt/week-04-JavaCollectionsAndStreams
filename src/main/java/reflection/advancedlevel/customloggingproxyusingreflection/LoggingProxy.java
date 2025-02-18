package reflection.advancedlevel.customloggingproxyusingreflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxy {

    public static <T> T createProxy(T target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();

        return (T) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // Log the method name
                System.out.println("Method " + method.getName() + " is called");

                // Execute the original method
                return method.invoke(target, args);
            }
        });
    }
}
