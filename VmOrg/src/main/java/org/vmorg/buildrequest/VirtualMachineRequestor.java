package org.vmorg.buildrequest;

import org.vmorg.domain.Machine;
import org.vmorg.exception.MachineNotCreatedException;
import org.vmorg.exception.UserNotEntitledException;

import java.util.Map;

public interface VirtualMachineRequestor {

    /**
     * Checks user's entitlements, and if appropriate
     * creates a new request for a virtual machine build.
     * @param machine to be created, including hostname
     * and requestor fields
     * @param username of requestor
     * @throws UserNotEntitledException thrown
     * when a user is not entitled to make a request
     * @throws MachineNotCreatedException thrown
     * when a machine build is not successful
     */
    void createNewRequest(Machine machine)
            throws UserNotEntitledException, MachineNotCreatedException;

    /**
     * Reports on the number of successful Windows
     * and Linux machine build requests on a per user basis
     * for today - for cross charging
     *
     * @return A map of users where the value is a map of
     * machine types -> quantity created
     */
    Map<String, Map<String, Integer>> totalBuildsByUserForDay();

    /**
     * Reports on the number of failed request builds
     * for today
     *
     * @return The total number of failed builds for today
     */
    int totalFailedBuildsForDay();
}
