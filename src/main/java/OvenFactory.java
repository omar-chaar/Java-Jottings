import org.jbake.app.Oven;

import java.io.File;

public class OvenFactory {
    public static final String DEFAULT_SOURCE = "src";
    public static final String DEFAULT_SOURCE_OUTPUT = "src/output";
    public static final boolean IS_CLEAR_CACHE = true;

    public static Oven createOven() throws Exception {
        return createOven(new File(DEFAULT_SOURCE), new File(DEFAULT_SOURCE_OUTPUT), IS_CLEAR_CACHE);
    }

    public static Oven createOven(File source, File destination, boolean isClearCache) throws Exception {
        return new Oven(source, destination, isClearCache);
    }

}
