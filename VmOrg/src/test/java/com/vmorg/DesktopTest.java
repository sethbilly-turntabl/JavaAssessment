package com.vmorg;
import junit.framework.*;
import org.junit.jupiter.api.Test;
import org.vmorg.domain.Desktop;
import org.vmorg.domain.Machine;
import static org.junit.jupiter.api.Assertions.*;

public class DesktopTest extends TestCase {


    @Test
    public void testCanNotCreateMachineWithoutHostName(){
        assertThrows(IllegalArgumentException.class, ()-> new Desktop("", 2, 80, 16,
                "21H2", 11));
    }

    @Test
    public void testCanCreateDesktopMachine() {
        Machine newDesktop = new Desktop("host", 2, 80, 16,
                "21H2", 11);
        assertEquals(2, newDesktop.getCpus());
    }

}
