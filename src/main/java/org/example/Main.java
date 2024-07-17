package org.example;



import org.example.controller.InvoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = SpringApplication.run(Main.class, args);
        InvoiceControllerInterface invoiceController=context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();
    }


}