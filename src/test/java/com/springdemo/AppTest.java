package com.springdemo;

import com.springdemo.beans.Worker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Worker worker = (Worker) context.getBean("worker");
        assertNotNull(worker);
    }
}
