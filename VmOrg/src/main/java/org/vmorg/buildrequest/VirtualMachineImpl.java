package org.vmorg.buildrequest;

import org.vmorg.auth.AuthorisingService;
import org.vmorg.build.SystemBuildService;
import org.vmorg.domain.Machine;
import org.vmorg.exception.MachineNotCreatedException;
import org.vmorg.exception.UserNotEntitledException;

import java.util.HashMap;
import java.util.Map;

public class VirtualMachineImpl implements VirtualMachineRequestor {

    private Map<String, Map<String, Integer>> dailyMachinesCreated;
    private AuthorisingService  authorisingService;
    private SystemBuildService systemBuildService;
    private int totalFailedBuilds;

    public VirtualMachineImpl(AuthorisingService authorisingService, SystemBuildService systemBuildService) {
        this.authorisingService = authorisingService;
        this.systemBuildService = systemBuildService;
        dailyMachinesCreated = new HashMap<>();
        totalFailedBuilds = 0;
    }
    @Override
    public void createNewRequest(Machine machine) throws UserNotEntitledException, MachineNotCreatedException {
        if(!authorisingService.isAuthorised(machine.getRequester())) {
            //user is not entitled, and we do not anything with is just logged
            throw new UserNotEntitledException();
        }
        if(systemBuildService.createNewMachine(machine) == null || systemBuildService.createNewMachine(machine) == "") {
            ++totalFailedBuilds;
            throw new MachineNotCreatedException();
        }

    }

    @Override
    public Map<String, Map<String, Integer>> totalBuildsByUserForDay() {
        return dailyMachinesCreated;
    }

    @Override
    public int totalFailedBuildsForDay() {
        return totalFailedBuilds;
    }

}
