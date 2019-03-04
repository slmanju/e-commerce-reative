package com.slmanju.ecommerce.inventory.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@Document("category")
public class Category {

    @Id
    private String id;
    private String name;
    private int level;
    private Category parent;

}
