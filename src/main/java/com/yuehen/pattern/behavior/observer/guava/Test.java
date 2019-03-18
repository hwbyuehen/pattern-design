package com.yuehen.pattern.behavior.observer.guava;

/**
 * @author 吃土的飞鱼
 * @date 2019/3/18
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Teacher teacher1 = new Teacher("Tom");
        Teacher teacher2 = new Teacher("Mic");

        GPerEventBus.register(teacher1);
        GPerEventBus.register(teacher2);

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        GPerEventBus.post(question);
    }
}
