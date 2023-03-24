import org.jbake.app.JBakeException;
import org.jbake.app.Oven;

import javax.naming.ConfigurationException;
import java.io.File;

public class Runner {
    public static void main(String [] args){
        try {
            File source = new File("src/jbake-source");
            File destination = new File("src/output");
            Oven oven = new Oven(source, destination, true);
            oven.setupPaths();
            oven.bake();
        } catch (ConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (JBakeException e) {
            System.out.println(e.getMessage());
            // do something with exception here
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
