package org.example.controller.keyboard;



import org.example.controller.InvoiceControllerInterface;
import org.example.entity.Invoice;
import org.example.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    private final InvoiceServiceInterface invoiceService;


    public InvoiceControllerKeyboard(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){
        System.out.println( "What is the customer name?" );
        Scanner sc=new Scanner(System.in);
        String customerName=sc.nextLine();
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }


}
