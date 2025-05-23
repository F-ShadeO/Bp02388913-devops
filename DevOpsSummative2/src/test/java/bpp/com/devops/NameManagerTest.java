package bpp.com.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameManagerTest {

    private NameManager testObject;

    @BeforeEach
    public void setup() {
        testObject = new NameManager();
    }

    @Test
    public void testCreateName() {

        String name = testObject.createName();

        assertNotNull(name, "Name should not be null");
        assertEquals(2, name.trim().split("\\s+").length, "Name should contain exactly two words");

    }

}
