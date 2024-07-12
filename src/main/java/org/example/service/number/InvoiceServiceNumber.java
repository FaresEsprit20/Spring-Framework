package org.example.service.number;


import org.example.entity.Invoice;
import org.example.repository.InvoiceRepositoryInterface;
import org.example.service.InvoiceServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {
    private static long lastNumber=0L;
    private final InvoiceRepositoryInterface invoiceRepository;

    public InvoiceServiceNumber(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }


    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }


}
