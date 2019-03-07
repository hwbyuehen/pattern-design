package com.yuehen.pattern.create.factory;

import com.yuehen.pattern.create.factory.abstractfactory.AliEmployeeFactory;
import com.yuehen.pattern.create.factory.abstractfactory.EmployeeFactory;
import com.yuehen.pattern.create.factory.abstractfactory.TencentEmployeeFactory;
import com.yuehen.pattern.create.factory.domain.Developer;
import com.yuehen.pattern.create.factory.domain.Devops;
import com.yuehen.pattern.create.factory.domain.IEmployee;
import com.yuehen.pattern.create.factory.domain.Testers;
import com.yuehen.pattern.create.factory.factorymethod.DeveloperFactory;
import com.yuehen.pattern.create.factory.factorymethod.DevopsFactory;
import com.yuehen.pattern.create.factory.factorymethod.IEmployeeFactory;
import com.yuehen.pattern.create.factory.factorymethod.TestersFactory;
import com.yuehen.pattern.create.factory.simplefactory.SimpleFactory;

public class FactoryTest {

    public static void main(String[] args) {
        //1普通创建
        IEmployee employee11 = new Developer();
        IEmployee employee12 = new Devops();
        IEmployee employee13 = new Testers();
        printEmployee("1普通创建", new IEmployee[]{employee11, employee12, employee13});

        //2简单工厂模式
        SimpleFactory simpleFactory = new SimpleFactory();
        IEmployee employee21 = simpleFactory.getEmployee("开发人员");
        IEmployee employee22 = simpleFactory.getEmployee("测试人员");
        IEmployee employee23 = simpleFactory.getEmployee("运维工程师");
        printEmployee("2简单工厂模式", new IEmployee[]{employee21, employee22, employee23});

        //3工厂方法模式
        IEmployeeFactory employeeFactory1 = new DeveloperFactory();
        IEmployeeFactory employeeFactory2 = new DevopsFactory();
        IEmployeeFactory employeeFactory3 = new TestersFactory();
        IEmployee employee31 = employeeFactory1.getEmployee();
        IEmployee employee32 = employeeFactory2.getEmployee();
        IEmployee employee33 = employeeFactory3.getEmployee();
        printEmployee("3工厂方法模式", new IEmployee[]{employee31, employee32, employee33});

        //4抽象工厂模式
        EmployeeFactory employeeFactory41 = new AliEmployeeFactory();
        EmployeeFactory employeeFactory42 = new TencentEmployeeFactory();
        IEmployee employee41 = employeeFactory41.getDeveloper();
        IEmployee employee42 = employeeFactory41.getDevops();
        IEmployee employee43 = employeeFactory41.getTesters();
        IEmployee employee44 = employeeFactory42.getDeveloper();
        IEmployee employee45 = employeeFactory42.getDevops();
        IEmployee employee46 = employeeFactory42.getTesters();
        printEmployee("4抽象工厂模式", new IEmployee[]{employee41, employee42, employee43, employee44, employee45, employee46});
    }

    private static void printEmployee(String printStr, IEmployee[] args) {
        System.out.println("=================================");
        System.out.println(printStr);
        for (IEmployee employee : args) {
            System.out.println(employee);
        }
        System.out.println("=================================");
        System.out.println();
    }

}
