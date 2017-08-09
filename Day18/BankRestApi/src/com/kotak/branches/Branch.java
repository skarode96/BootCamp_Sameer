package com.kotak.branches;

import org.springframework.stereotype.Repository;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Branch {
    long ifsc;
    String location;
    String manager;
    String serviceType;
    int employeeStrength;


    public Branch() {
    }

    public Branch(long ifsc, String location, String manager, String serviceType, int employeeStrength) {
        this.ifsc = ifsc;
        this.location = location;
        this.manager = manager;
        this.serviceType = serviceType;
        this.employeeStrength = employeeStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        if (ifsc != branch.ifsc) return false;
        if (employeeStrength != branch.employeeStrength) return false;
        if (location != null ? !location.equals(branch.location) : branch.location != null) return false;
        if (manager != null ? !manager.equals(branch.manager) : branch.manager != null) return false;
        return serviceType != null ? serviceType.equals(branch.serviceType) : branch.serviceType == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (ifsc ^ (ifsc >>> 32));
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        result = 31 * result + (serviceType != null ? serviceType.hashCode() : 0);
        result = 31 * result + employeeStrength;
        return result;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "ifsc=" + ifsc +
                ", location='" + location + '\'' +
                ", manager='" + manager + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", employeeStrength=" + employeeStrength +
                '}';
    }

    public long getIfsc() {
        return ifsc;
    }

    public void setIfsc(long ifsc) {
        this.ifsc = ifsc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getEmployeeStrength() {
        return employeeStrength;
    }

    public void setEmployeeStrength(int employeeStrength) {
        this.employeeStrength = employeeStrength;
    }
}
