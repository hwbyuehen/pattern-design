package com.yuehen.pattern.create.factory.abstractfactory;

import com.yuehen.pattern.create.factory.domain.IEmployee;

public interface EmployeeFactory {
    IEmployee getDeveloper();
    IEmployee getDevops();
    IEmployee getTesters();
}
