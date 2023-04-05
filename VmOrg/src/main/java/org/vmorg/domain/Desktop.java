package org.vmorg.domain;

public class Desktop extends Machine {

    private String buildNumber;
    private int version;

    public Desktop(String hostName, int cpus, int hdd, int ram, String requester,String builderNumber, int version) {
        super(hostName, cpus, hdd, ram, requester);
        this.buildNumber = builderNumber;
        this.version = version;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
