package reflection.advancedlevel.customloggingproxyusingreflection;

public class Main {
    public static void main(String[] args) {
        // Create an instance of GreetingImpl
        Greeting greeting = new GreetingImpl();

        // Create a logging proxy for the Greeting instance
        Greeting proxy = LoggingProxy.createProxy(greeting);

        // Call the sayHello method on the proxy
        proxy.sayHello();
    }
}
