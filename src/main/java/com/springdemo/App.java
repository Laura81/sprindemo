package com.springdemo;

import com.springdemo.beans.Worker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //  Tool tool = (Tool)context.getBean("tool");
        //  System.out.println(tool.toString());

        //  Tool tool1 = (Tool)context.getBean("tool");
        //  tool1.setName("Popescu");
        //  tool1.setWeight(53);
        //  System.out.println(tool1.toString());

        Worker worker = (Worker) context.getBean("worker");
        System.out.println(worker.toString());

        Worker worker2 = (Worker) context.getBean("worker");
        worker2.setProfession("it");
        worker2.setAge(35);
        System.out.println(worker2.toString());

        //   System.out.println(worker.getTool());
    }
}
