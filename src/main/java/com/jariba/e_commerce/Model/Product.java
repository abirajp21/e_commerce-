package com.jariba.e_commerce.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private String brand;
    private String category;
    private double weight;
    private String dimension;
    private boolean available;
    private int quantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
    private Date releaseDate;
    private String seller;

    //@OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    //private List<ProductImage> productImage;


//    private String imageName;
//    private String imageType;
//    @Lob
//    private byte[] imageData;

}
