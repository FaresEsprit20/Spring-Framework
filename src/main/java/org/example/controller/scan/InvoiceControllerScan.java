package org.example.controller.scan;


import org.example.controller.InvoiceControllerInterface;
import org.example.entity.Invoice;
import org.example.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

//@Controller
public class InvoiceControllerScan implements InvoiceControllerInterface {

    private final InvoiceServiceInterface invoiceService;

    public InvoiceControllerScan(InvoiceServiceInterface invoiceService) {
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
