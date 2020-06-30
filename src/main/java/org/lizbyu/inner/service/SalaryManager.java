package org.lizbyu.inner.service;

public class SalaryManager implements Manager {
    private final EmployeeManager employeeManager;
    private final AttendanceManager attendanceManager;

    public SalaryManager() {
        employeeManager = (EmployeeManager) SystemService.instance().getManager(EmployeeManager.class);
        attendanceManager = (AttendanceManager) SystemService.instance().getManager(AttendanceManager.class);
    }

    public double settle(long employeeID) {
        int workingDays = attendanceManager.queryWorkingDays(employeeID);
        double salary = employeeManager.queryEmployeeByID(employeeID).getSalary();
        return workingDays * salary;
    }

}
