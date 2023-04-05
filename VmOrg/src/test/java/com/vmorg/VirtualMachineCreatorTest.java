package com.vmorg;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.vmorg.auth.AuthorisingService;
import org.vmorg.build.SystemBuildService;
import org.vmorg.buildrequest.VirtualMachineImpl;

public class VirtualMachineCreatorTest {

    @Mock
    AuthorisingService authorisingService;

    @Mock
    SystemBuildService systemBuildService;

    @Mock
    VirtualMachineImpl virtualMachine;

    @BeforeEach
    public void setup() {
        virtualMachine = new VirtualMachineImpl(authorisingService, systemBuildService);
    }


}
