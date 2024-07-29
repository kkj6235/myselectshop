package com.sparta.myselectshop.naver.dto;

import com.sparta.myselectshop.naver.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ProductResponseDto {
    private int id;
    private String title;
    private String link;
    private String image;
    private int lprice;
    private int myprice;
    public static ProductResponseDto toDto(Product product){
        return ProductResponseDto.builder()
                .id(product.getId())
                .title(product.getTitle())
                .link(product.getLink())
                .image(product.getImage())
                .lprice(product.getLprice())
                .myprice(product.getMyprice())
                .build();
    }
}
