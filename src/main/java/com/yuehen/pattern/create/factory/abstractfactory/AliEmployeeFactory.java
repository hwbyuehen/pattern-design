package com.yuehen.pattern.create.factory.abstractfactory;

import com.yuehen.pattern.create.factory.domain.AliDeveloper;
import com.yuehen.pattern.create.factory.domain.AliDevops;
import com.yuehen.pattern.create.factory.domain.AliTesters;
import com.yuehen.pattern.create.factory.domain.IEmployee;

public class AliEmployeeFactory implements EmployeeFactory {
    public IEmployee getDeveloper() {
        return new AliDeveloper();
    }

    public IEmployee getDevops() {
        return new AliDevops();
    }

    public IEmployee getTesters() {
        return new AliTesters();
    }
}
