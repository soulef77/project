
import tp.com.example.project.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import tp.com.example.project.Main;
import tp.com.example.project.Main;
import org.springframework.boot.test.context.SpringBootTest;


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