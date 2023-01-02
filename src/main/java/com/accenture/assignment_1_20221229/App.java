package com.accenture.assignment_1_20221229;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting app ..." );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        System.out.println("=====================");
        
        Employee employee = context.getBean("employee", Employee.class); 
        System.out.println(employee); 
        employee.employeeInfo(); 
        
        System.out.println("App closed");
    }
}
