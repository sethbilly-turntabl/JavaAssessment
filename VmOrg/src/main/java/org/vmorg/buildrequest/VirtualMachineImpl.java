package org.vmorg.buildrequest;

import org.vmorg.domain.Machine;
import org.vmorg.exception.MachineNotCreatedException;
import org.vmorg.exception.UserNotEntitledException;

import java.util.HashMap;
import java.util.Map;

public class VirtualMachineImpl implements VirtualMachineRequestor {

    private Map<String, Integer> machinesCreated = new HashMap<>();
    private int totalFailedBuilds = 0;
    @Override
    public void createNewRequest(Machine machine) throws UserNotEntitledException, MachineNotCreatedException {

    }

    @Override
    public Map<String, Map<String, Integer>> totalBuildsByUserForDay() {
        return null;
    }

    @Override
    public int totalFailedBuildsForDay() {
        return totalFailedBuilds;
    }
}
