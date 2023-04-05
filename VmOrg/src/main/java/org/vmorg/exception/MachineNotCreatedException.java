package org.vmorg.exception;

import org.vmorg.domain.Machine;

public class MachineNotCreatedException extends Exception {

    public MachineNotCreatedException() {
        super("An error occurred Machine Build not successful");
    }
}
