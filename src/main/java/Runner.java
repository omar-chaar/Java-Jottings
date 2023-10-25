import org.jbake.app.Oven;

public class Runner {
    private final Oven oven;

    public Runner(Oven oven) {
        this.oven = oven;
    }

    public void run() {
        oven.bake();
    }
}
