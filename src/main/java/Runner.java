import org.jbake.app.JBakeException;
import org.jbake.app.Oven;

public class Runner {
    private final Oven oven;

    public Runner(Oven oven) {
        this.oven = oven;
    }

    public void run() {
        try {
            oven.setupPaths();
            oven.bake();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
