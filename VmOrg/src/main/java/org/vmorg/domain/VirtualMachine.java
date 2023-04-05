package org.vmorg.domain;

public abstract class VirtualMachine {

    private String hostName;
    private int cpus;
    private int hdd;
    private int ram;

    public VirtualMachine(String hostName, int cpus, int hdd, int ram) {
        this.hostName = hostName;
        this.cpus = cpus;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getCpus() {
        return cpus;
    }

    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
