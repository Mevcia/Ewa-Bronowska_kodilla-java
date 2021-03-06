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
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        Invoice invoice = new Invoice("2018/07/231");
        Item tomato = new Item(new Product("Tomato"), new BigDecimal("12.58"), 2);
        Item cauliflower = new Item(new Product("Cauliflower"), new BigDecimal("5.5"), 1);
        Item bread = new Item(new Product("Bread"), new BigDecimal("4.5"), 3);

        tomato.setInvoice(invoice);
        cauliflower.setInvoice(invoice);
        bread.setInvoice(invoice);

        invoice.getItems().add(tomato);
        invoice.getItems().add(cauliflower);
        invoice.getItems().add(bread);

        invoiceDao.save(invoice);
        int id = invoice.getId();

        Assert.assertNotEquals(0, id);

        invoiceDao.delete(id);
    }
}
