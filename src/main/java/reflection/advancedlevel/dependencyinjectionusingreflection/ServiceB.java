package reflection.advancedlevel.dependencyinjectionusingreflection;

public class ServiceB {
    @Inject
    private ServiceA serviceA;

    public void execute() {
        serviceA.performAction();
        System.out.println("ServiceB Execution Completed");
    }
}
