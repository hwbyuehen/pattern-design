package com.yuehen.pattern.create.factory.factorymethod;

import com.yuehen.pattern.create.factory.domain.Developer;
import com.yuehen.pattern.create.factory.domain.IEmployee;

public class DeveloperFactory implements IEmployeeFactory {
    public IEmployee getEmployee() {
        return new Developer();
    }
}
