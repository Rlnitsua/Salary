package org.lizbyu.inner.bean;

public class Employee {
    /**
     * The unique id of employee. It'll not change and repeat.
     */
    public long employeeID;

    /**
     * Hourly type : 0
     * Commissioned : 1
     * Salaried : 2
     */
    public int employeeType;

    /**
     * not employed or resigned : -1
     * working : 0
     * on leave : 1
     */
    public int workingState;

    /**
     * timestamp of entry. Salary starts from this date.
     */
    public long entryTime;

    /**
     * timestamp of leaving. Salary will stop from this date.
     */
    public long leaveTime;

    /**
     * address of employee
     */
    public String address;

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getWorkingState() {
        return workingState;
    }

    public void setWorkingState(int workingState) {
        this.workingState = workingState;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public long getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(long leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeType=" + employeeType +
                ", workingState=" + workingState +
                ", entryTime=" + entryTime +
                ", leaveTime=" + leaveTime +
                ", address='" + address + '\'' +
                '}';
    }
}
