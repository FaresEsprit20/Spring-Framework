package org.example.controller;


import org.example.entity.Invoice;
import org.example.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceControllerDouchette implements InvoiceControllerInterface {


    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void createInvoice() {
        System.out.println("Usage of a scanner");
        Invoice invoice=new Invoice();
        invoice.setCustomerName("Virgin Galactic");
        invoiceService.createInvoice(invoice);
    }
}
