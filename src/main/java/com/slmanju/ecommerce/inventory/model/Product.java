package com.slmanju.ecommerce.inventory.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter @Setter
@Document("product")
public class Product {

    @Id
    private String id;
    private String name;
    private List<Variant> variants;
    private Category category;
    private List<String> categories;

    @Getter @Setter
    public static class Variant {
        private String name;
        private Price price;
    }

    @Getter @Setter
    public static class Price {
        private int amount;
        private String currency;
    }

}
