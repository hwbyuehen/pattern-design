package com.yuehen.pattern.create.factory.factorymethod;

import com.yuehen.pattern.create.factory.domain.IEmployee;
import com.yuehen.pattern.create.factory.domain.Testers;

public class TestersFactory implements IEmployeeFactory {
    public IEmployee getEmployee() {
        return new Testers();
    }
}
