package com.yuehen.pattern.create.factory.factorymethod;

import com.yuehen.pattern.create.factory.domain.Devops;
import com.yuehen.pattern.create.factory.domain.IEmployee;

public class DevopsFactory implements IEmployeeFactory {
    public IEmployee getEmployee() {
        return new Devops();
    }
}
