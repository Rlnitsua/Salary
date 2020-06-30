package org.lizbyu.inner.service;

import org.lizbyu.inner.bean.Employee;

public class EmployeeManager implements Manager {
    public synchronized boolean createEmployee(Employee.Type type) {
        return false;
    }

    public synchronized boolean dismissEmployee(long employeeID) {
        return false;
    }

    public Employee queryEmployeeByID(long employeeID) {
        return null;
    }
}
