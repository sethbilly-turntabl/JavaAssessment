package org.vmorg.domain;

public class Server extends Machine {

    private String distributionName;
    private int majorNumber;
    private String kernelVersion;
    private String adminTeam;

    public Server(String hostName, int cpus, int hdd, int ram, String requester,
            String distributionName, int majorNumber, String kernelVersion, String adminTeam) {
        super(hostName, cpus, hdd, ram, requester);
        this.distributionName = distributionName;
        this.majorNumber = majorNumber;
        this.kernelVersion = kernelVersion;
        this.adminTeam = adminTeam;
    }

    public String getDistributionName() {
        return distributionName;
    }

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    public int getMajorNumber() {
        return majorNumber;
    }

    public void setMajorNumber(int majorNumber) {
        this.majorNumber = majorNumber;
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public String getAdminTeam() {
        return adminTeam;
    }

    public void setAdminTeam(String adminTeam) {
        this.adminTeam = adminTeam;
    }

    @Override
    public String toString() {
        return "Server{" +
                "distributionName='" + distributionName + '\'' +
                ", majorNumber=" + majorNumber +
                ", kernelVersion='" + kernelVersion + '\'' +
                ", adminTeam='" + adminTeam + '\'' +
                '}';
    }
}
