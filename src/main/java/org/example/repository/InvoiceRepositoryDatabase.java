package org.example.repository;


import org.example.entity.Invoice;

public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface{

    public void create(Invoice invoice){
        /*[…]
        PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE (NUMBER,CUSTOMERNAME) VALUES (?,?)");
                […]
        pstmt.executeUpdate();*/
        System.out.println("Database: Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());
    }

}
