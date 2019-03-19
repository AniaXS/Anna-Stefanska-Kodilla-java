package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product notebook = new Product("Notepad");
        Product pencil = new Product("Pencil");
        Product pen = new Product("Pen");
        Product envelope = new Product("Envelope");

        Item item1 = new Item(new BigDecimal(11), 2);
        Item item2 = new Item(new BigDecimal(0.99), 3);
        Item item3 = new Item(new BigDecimal(1.55), 1);
        Item item4 = new Item(new BigDecimal(2.25), 1);
        Item item5 = new Item(new BigDecimal(0.99), 7);
        Item item6 = new Item(new BigDecimal(2.25), 5);

        Invoice invoice1 = new Invoice("122/2019");
        Invoice invoice2 = new Invoice("123/2019");

        item1.setProduct(pen);
        item2.setProduct(envelope);
        item3.setProduct(pencil);
        item4.setProduct(notebook);
        item5.setProduct(envelope);
        item6.setProduct(notebook);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);
        item5.setInvoice(invoice2);
        item6.setInvoice(invoice2);

        //When
        invoiceDao.save(invoice1);
        int id1 = invoice1.getId();
        invoiceDao.save(invoice2);
        int id2 = invoice2.getId();

        //Then
        Assert.assertNotEquals(0, id1);
        Assert.assertNotEquals(0, id2);

        //CleanUp
        invoiceDao.deleteById(id1);
        invoiceDao.deleteById(id2);
    }
}