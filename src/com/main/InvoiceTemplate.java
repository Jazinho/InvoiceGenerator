package com.main;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

/**
 * Created by Jaśko on 2016-11-03.
 */

public class InvoiceTemplate extends JPanel {
    private Company data;

    public InvoiceTemplate() {
        data = new Company();
        this.setLayout(null);

        JPanel header = generateCompanyData();
        this.add(header);
        header.setLocation(10, 10);
        header.setSize(200, 100);

        JPanel dates = generateInvoiceAndDatesInputs();
        this.add(dates);
        dates.setLocation(300, 0);
        dates.setSize(250, 150);

        JPanel buyerData = generateBuyerDataInput();
        this.add(buyerData);
        buyerData.setLocation(10, 140);
        buyerData.setSize(500, 100);

        JPanel productsTable = generateProductsTable();
        this.add(productsTable);
        productsTable.setLocation(10,240);
        productsTable.setSize(500,200);

        JPanel summarizationTable = generateChargeSumarization();
        this.add(summarizationTable);
        summarizationTable.setLocation(295,440);
        summarizationTable.setSize(220,130);

        JPanel payment = generatePaymentInfo();
        this.add(payment);
        payment.setLocation(0,470);
        payment.setSize(290,100);

        JButton button = new JButton(">> WYGENERUJ FAKTURĘ <<");
        this.add(button);
        button.setLocation(250,580);
        button.setSize(200,50);

    }

    private JPanel generateCompanyData() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));

        header.add(new JLabel(data.getName() + " " + data.getOwner()));
        header.add(new JLabel(data.getAddress()));
        header.add(new JLabel(data.getPostalCode() + " " + data.getCity()));
        header.add(new JLabel("NIP: " + data.getNIP()));
        header.add(new JLabel("tel. " + data.getPhone()));

        return header;
    }

    private JPanel generateInvoiceAndDatesInputs() {
        JPanel panel = new JPanel();

        panel.add(new JLabel("Faktura VAT"));

        JTextField invoiceNumber = new JTextField("", 11);
        panel.add(invoiceNumber);

        panel.add(new JLabel(("Miejsce wystawienia: Porąbka Uszewska")));
        panel.add(new JLabel("Data wystawienia:"));
        JTextField invoiceDate = new JTextField("", 11);
        panel.add(invoiceDate);

        panel.add(new JLabel("Data sprzedaży:"));
        JTextField saleDate = new JTextField("", 11);
        panel.add(saleDate);

        return panel;
    }

    private JPanel generateBuyerDataInput() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(new JLabel("Nazwa kontrahenta:"));
        JTextField buyerName = new JTextField("", 45);
        panel.add(buyerName);

        panel.add(new JLabel("Adres:"));
        JTextField buyerAddress = new JTextField("", 29);
        panel.add(buyerAddress);

        panel.add(new JLabel("NIP: "));
        JTextField buyerNIP = new JTextField("", 8);
        panel.add(buyerNIP);

        return panel;
    }

    private JPanel generateProductsTable() {
        JPanel panel = new JPanel();

        String[] columnNames = {"Lp.", "Nazwa towaru", "Ilośc", "Jedn", "Cena jedn. netto", "Wart. netto", "Stawka pod.(%)","Wart. podatku", "Wart brutto"};
        Object[][] data = {{"1","","","","","","","",""},{"2","","","","","","","",""},{"3","","","","","","","",""},
                {"4","","","","","","","",""},{"5","","","","","","","",""},{"6","","","","","","","",""},{"7","","","","","","","",""},
                {"8","","","","","","","",""},{"9","","","","","","","",""},{"10","","","","","","","",""}};

        JTable table = new JTable(data, columnNames);

        int[] tightColumns = {2,3,6};
        int[] priceColumns = {4,5,7,8};

        TableColumn column = null;
        column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(20);
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(150);

        for(int index: tightColumns){
            column = table.getColumnModel().getColumn(index);
            column.setPreferredWidth(30);
        }

        for(int index: priceColumns){
            column = table.getColumnModel().getColumn(index);
            column.setPreferredWidth(60);
        }

        panel.add(table.getTableHeader());
        panel.add(table);

        return panel;
    }

    private JPanel generateChargeSumarization(){
        JPanel panel = new JPanel();

        Object[][] data = {{"","23","",""},{"","8","",""},{"","5","",""},{"","0","",""},{"","zw","",""},{"","","",""},{"","SUM","",""}};

        JTable table = new JTable(data,new String[]{"","","",""});
        int[] priceColumns = {0,2,3};

        TableColumn column = null;
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(30);

        for(int index: priceColumns){
            column = table.getColumnModel().getColumn(index);
            column.setPreferredWidth(60);
        }

        panel.add(table);

        return panel;
    }

    private JPanel generatePaymentInfo(){
        JPanel panel = new JPanel();

        panel.add(new JLabel("Płatność:"));
        JComboBox combo = new JComboBox(new String[]{"gotówka","przelew"});
        panel.add(combo);

        panel.add(new JLabel("Termin:"));
        panel.add(new JTextField("",6));

        panel.add(new JLabel("Bank:"));
        panel.add(new JTextField("",20));

        panel.add(new JLabel("Nr. konta:"));
        panel.add(new JTextField("",18));

        return panel;
    }
}
