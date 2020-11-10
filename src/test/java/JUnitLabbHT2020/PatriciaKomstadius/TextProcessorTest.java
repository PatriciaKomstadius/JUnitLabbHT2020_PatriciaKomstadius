package JUnitLabbHT2020.PatriciaKomstadius;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextProcessorTest {

    @DisplayName("Test: textToUpperCase i TextProcessor-klassen")
    @Test
    void testTextToUpperCase(){
        TextProcessor text = new TextProcessor();
        assertEquals("JAVA", TextProcessor.textToUpperCase("java"));

    }
    @DisplayName("Testar textBackwards i TextProcessor-klassen")
    @Test
    void testTextBackwards(){
        TextProcessor text = new TextProcessor();
        assertEquals("avaj", TextProcessor.textBackwards("java"));
    }

}


