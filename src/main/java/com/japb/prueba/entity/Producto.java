package com.japb.prueba.entity;
            
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Producto {

    @Getter
    @Setter
    private int Id;

    @Getter
    @Setter
    private String Title;

    @Getter
    @Setter
    private String Description;

    @Getter
    @Setter
    private float Price;

    @Getter
    @Setter
    private float DiscountPercentage;

    @Getter
    @Setter
    private float Rating;

    @Getter
    @Setter
    private int Stock;

    @Getter
    @Setter
    private String Brand;

    @Getter
    @Setter
    private String Category;

    @Getter
    @Setter
    private String Thumbnail;

    @Getter
    @Setter
    private List<String> Images = new ArrayList<String>();

    public Producto(){
        
    }
    
    public Producto(int id, String title, String description, float price,
            float discountPercentage, float rating, int stock,
            String brand, String category, String thumbnail,
            List<String> images) {
        this.Id = id;
        this.Title = title;
        this.Description = description;
        this.Price = price;
        this.DiscountPercentage = discountPercentage;
        this.Rating = rating;
        this.Stock = stock;
        this.Brand = brand;
        this.Category = category;
        this.Thumbnail = thumbnail;
        this.Images = images;
    }
}
