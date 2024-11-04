/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1_book;

/**
 *
 * @author Deniss
 */
public class Book {
    private String id;
    private String type;
    private String title;
    private String author;
    private Double price;
    private int qty;

    public Book(String id, String type, String title, String author, Double price, int qty) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", type=" + type + ", title=" + title + ", author=" + author + ", price=" + price + ", qty=" + qty + '}';
    }
    
    
    
    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Double price) {
        if (price>0)
        this.price = price;
    }

    public void setQty(int qty) {
        if (qty>0)
        this.qty = qty;
    }
    
    
}
