package com.yuehen.pattern.create.factory.simplefactory;

import com.yuehen.pattern.create.factory.domain.Developer;
import com.yuehen.pattern.create.factory.domain.Devops;
import com.yuehen.pattern.create.factory.domain.IEmployee;
import com.yuehen.pattern.create.factory.domain.Testers;

public class SimpleFactory {
    public IEmployee getEmployee(String name) {
        if ("开发人员".equals(name)) {
            return new Developer();
        } else if ("测试人员".equals(name)) {
            return new Testers();
        } else if ("运维工程师".equals(name)) {
            return new Devops();
        } else {
            System.err.println("不存在");
            return null;
        }
    }
}
