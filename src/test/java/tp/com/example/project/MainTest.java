
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMainOutput() {
        // Arrange
        Main main = new Main();

        // Act
        String result = main.getMessage();

        // Assert
        assertEquals("Hello, Jenkins!", result);
    }
    @Test
    public void testMainOutputWithDifferentMessage() {
        // Arrange
        Main main = new Main();

        // Act
        String result = main.getMessage("Welcome to the test!");

        // Assert
        assertEquals("Welcome to the test!", result);
    }
}