package com.yuehen.pattern.behavior.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/18
 */
public class GPerEventBus {
    private static String name = "GPer生态圈";
    private static EventBus eventBus = new EventBus();

    private GPerEventBus() {

    }

    public static EventBus getInstance() {
        return eventBus;
    }

    public static void register(Teacher teacher) {
        eventBus.register(teacher);
    }

    public static void unregister(Teacher teacher) {
        eventBus.unregister(teacher);
    }

    public static void post(Question question) {
        System.out.println(question.getUserName() + "在" + name + "上提交了一个问题。");
        eventBus.post(question);
    }
}
