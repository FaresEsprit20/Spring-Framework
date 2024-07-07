package org.example.service;


import org.example.entity.Invoice;
import org.example.repository.InvoiceRepositoryInterface;

public class InvoiceServiceNumber implements InvoiceServiceInterface{

    private static long lastNumber=0L;

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }


}
