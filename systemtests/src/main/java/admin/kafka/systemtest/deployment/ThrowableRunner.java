package admin.kafka.systemtest.deployment;

@FunctionalInterface
public interface ThrowableRunner {
    void run() throws Exception;
}