package com.sparta.myselectshop.naver.entity;


import com.sparta.myselectshop.naver.dto.ItemDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String link;
    private String image;
    private int lprice;
    private int myprice;

    public static Product toEntity(ItemDto itemDto){
        return Product.builder()
                .title(itemDto.getTitle())
                .link(itemDto.getLink())
                .image(itemDto.getImage())
                .lprice(itemDto.getLprice())
                .myprice(0)
                .build();
    }
    public Product setPrice(int myprice){
        this.myprice = myprice;
        return this;
    }
}
