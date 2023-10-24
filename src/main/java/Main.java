import org.jbake.app.Oven;

import java.io.File;

public class Main {

    public static final String DEFAULT_SOURCE = "src";
    public static final String DEFAULT_SOURCE_OUTPUT = "src/output";
    public static final boolean IS_CLEAR_CACHE = true;

    public static void main(String[] args) throws Exception {
        File source = new File(DEFAULT_SOURCE);
        File destination = new File(DEFAULT_SOURCE_OUTPUT);
        Oven oven = new Oven(source, destination, IS_CLEAR_CACHE);
        Runner runner = new Runner(oven);
        runner.run();
    }
}
