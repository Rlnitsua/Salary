package org.lizbyu.inner.bean;

public class Employee {
    /**
     * The unique id of employee. It'll not change and repeat.
     */
    public long employeeID = -1;

    public enum Type {
        DEFAULT, HOURLY, COMMISSIONED, SALARIED
    }

    /**
     * type of employee
     */
    public Type employeeType = Type.DEFAULT;

    public enum WorkingState {
        NOT_EMPLOYED, WORKING, ON_LEAVE
    }

    /**
     * working state of employee
     */
    public WorkingState workingState = WorkingState.NOT_EMPLOYED;

    /**
     * salary of employee
     */
    public double salary = 0;

    /**
     * timestamp of entry. Salary starts from this date.
     */
    public long entryTime = 0;

    /**
     * timestamp of leaving. Salary will stop from this date.
     */
    public long leaveTime = 0;

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

    public Type getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(Type employeeType) {
        this.employeeType = employeeType;
    }

    public WorkingState getWorkingState() {
        return workingState;
    }

    public void setWorkingState(WorkingState workingState) {
        this.workingState = workingState;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
                ", salary=" + salary +
                ", entryTime=" + entryTime +
                ", leaveTime=" + leaveTime +
                ", address='" + address + '\'' +
                '}';
    }
}
