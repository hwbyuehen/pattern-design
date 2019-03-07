package com.yuehen.pattern.create.factory.abstractfactory;

import com.yuehen.pattern.create.factory.domain.TencentDeveloper;
import com.yuehen.pattern.create.factory.domain.TencentDevops;
import com.yuehen.pattern.create.factory.domain.TencentTesters;
import com.yuehen.pattern.create.factory.domain.IEmployee;

public class TencentEmployeeFactory implements EmployeeFactory {
    public IEmployee getDeveloper() {
        return new TencentDeveloper();
    }

    public IEmployee getDevops() {
        return new TencentDevops();
    }

    public IEmployee getTesters() {
        return new TencentTesters();
    }
}
