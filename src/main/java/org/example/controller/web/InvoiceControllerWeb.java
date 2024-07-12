package org.example.controller.web;


import org.example.controller.InvoiceControllerInterface;
import org.example.entity.Invoice;
import org.example.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    private final InvoiceServiceInterface invoiceService;

    public InvoiceControllerWeb(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }


    public void createInvoice(){

        String customerName="Tesla";
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }
}
