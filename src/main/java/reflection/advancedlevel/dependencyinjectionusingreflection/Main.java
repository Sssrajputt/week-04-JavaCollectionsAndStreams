package reflection.advancedlevel.dependencyinjectionusingreflection;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // Create the DI container
        DIContainer diContainer = new DIContainer();

        // Register the classes
        diContainer.register(ServiceA.class);
        diContainer.register(ServiceB.class);

        // Inject dependencies
        diContainer.injectDependencies();

        // Get the instance of ServiceB and use it
        ServiceB serviceB = diContainer.getInstance(ServiceB.class);
        serviceB.execute();
    }
}
