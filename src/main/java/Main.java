import org.jbake.app.Oven;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File source = new File("src");
        File destination = new File("src/output");
        Oven oven = new Oven(source, destination, true);
        Runner runner = new Runner(oven);
        runner.run();
    }

}
