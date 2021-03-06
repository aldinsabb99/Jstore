package Jstore;
/**
 * Kelas ini berfungsi untuk membuat invoice dari tiap transaksi.
 *
 * @author Aldinisa
 * @version 28-Feb-2019
 */

import java.util.*;

public abstract class Invoice
{
    private int id = 0;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    private static InvoiceStatus status;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.item = item;
        this.date = new GregorianCalendar();
    }

    /**
     * Method untuk mengembalikan id invoice
     *
     * @return    id invoice
     */
    public int getId()
    {
        return id;
    }

    /**
     * Method untuk mengembalikan item yang dibeli
     *
     * @return    objek item
     */
    public ArrayList<Integer> getItem()
    {
        return item;
    }

    /**
     * Method untuk mengembalikan tanggal invoice
     *
     * @return    tanggal invoice
     */
    public Calendar getDate()
    {
        return date;
    }

    /**
     * Method untuk mengembalikan total harga item yang dibeli
     *
     * @return    total harga
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }

    /**
     * An 
     *
     * @param  y  a sa
     * @return    the
     */
    public abstract InvoiceStatus getInvoiceStatus();

    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public abstract InvoiceType getInvoiceType();

    /**
     * Method untuk mengubah id invoice
     *
     * @param  id  id dari suatu invoice
     */
    public boolean getIsActive()
    {
        return isActive;
    }

    /**
     * Method untuk mengubah id invoice
     *
     * @param  id  id dari suatu invoice
     */
    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * Method untuk mengubah id invoice
     *
     * @param  id  id dari suatu invoice
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Method untuk mengubah item pada invoice
     *
     * @param  item  objek item dari suatu invoice
     */
    public void setItem(ArrayList<Integer> item)
    {
        this.item = item;
    }

    /**
     * Method untuk mengubah tanggal invoice
     *
     * @param  date  tanggal dari suatu invoice
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }

    /**
     * Method untuk mengubah total harga pada invoice
     *
     * @param  totalPrice  total harga dari suatu invoice
     */
    public void setTotalPrice()
    {
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(id).getItem();
        for(int tempID : listItemID)
        {
            this.totalPrice = totalPrice + DatabaseItem.getItemFromID(tempID).getPrice();
        }
    }

    /**
     *
     *
     * @param
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }

    /**
     *
     *
     * @param
     */
    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }

    /**
     *
     *
     * @param
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    /**
     * Method untuk menampilkan total harga pada invoice
     *
     */
    public abstract String toString();
}