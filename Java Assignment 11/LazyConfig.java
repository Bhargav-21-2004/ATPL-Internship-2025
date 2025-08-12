import java.util.Optional;
import java.util.function.Supplier;

public class LazyConfig {
    public static void main(String[] args) {
        Optional<String> configValue = Optional.empty();
        Supplier<String> loadConfig = () -> {
            System.out.println("Loading configuration...");
            return "Configuration Loaded.";
        };
        String Result = configValue.orElseGet(loadConfig);
        System.out.println("final result:"+Result);
    }
}