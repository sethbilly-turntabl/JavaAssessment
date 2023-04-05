package com.vmorg;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.vmorg.build.SystemBuildService;

public class SystemBuildServiceTest {

    @Test
    public void testBuildServiceShouldReturnHostName() {
        SystemBuildService buildService = mock(SystemBuildService.class);
        when(buildService.createNewMachine(anyString())).thenReturn("SomeHostName");
    }
}
