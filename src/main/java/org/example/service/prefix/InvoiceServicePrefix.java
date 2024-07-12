package org.example.service.prefix;


import org.example.entity.Invoice;
import org.example.repository.InvoiceRepositoryInterface;
import org.example.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    @Value("${invoice.lastNumber}")
    private long lastNumber=112L;

    @Value("${invoice.prefix}")
    private String prefix;

    private final InvoiceRepositoryInterface invoiceRepository;

    public InvoiceServicePrefix(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(prefix+(++lastNumber));
        invoiceRepository.create(invoice);
    }

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }


}
