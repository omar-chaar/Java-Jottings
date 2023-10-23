import org.jbake.app.Oven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class RunnerTest {
    private Oven oven;
    private Runner runner;

    @BeforeEach
    void setUp() {
        oven = mock(Oven.class);
        runner = new Runner(oven);
    }

    @Test
    public void whenRunIsCalledThenSetupPathsIsCalled() {
        runner.run();
        verify(oven).setupPaths();
    }

    @Test
    public void whenRunIsCalledThenBakeIsCalled() {
        runner.run();
        verify(oven).bake();
    }
}