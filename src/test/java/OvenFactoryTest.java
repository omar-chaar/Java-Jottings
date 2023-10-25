import org.jbake.app.Oven;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class OvenFactoryTest {

    @Test
    void whenCreateOvenIsCalledThenOvenIsCreated(){
        Oven oven = OvenFactory.createOven();
        assertNotNull(oven);
    }

    @Test
    void whenCreateOvenIsCalledWithParametersThenOvenIsCreatedWithParameters(){
        String expectedSource = "src";
        String expectedOutput = "src\\output";

        Oven oven = OvenFactory.createOven(new File(expectedSource), new File(expectedOutput), true);

        assertEquals(expectedSource, oven.getUtensils().getConfiguration().getSourceFolder().getPath(), "Source folder is not set correctly");
        assertEquals(expectedOutput, oven.getUtensils().getConfiguration().getDestinationFolder().getPath(), "Destination folder is not set correctly");
        assertTrue(oven.getUtensils().getConfiguration().getClearCache(), "Clear cache is not set correctly");
    }

}