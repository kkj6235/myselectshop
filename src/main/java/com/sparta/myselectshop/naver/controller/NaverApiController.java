package com.sparta.myselectshop.naver.controller;

import com.sparta.myselectshop.naver.dto.ItemDto;
import com.sparta.myselectshop.naver.dto.ProductResponseDto;
import com.sparta.myselectshop.naver.dto.UpdateReqDto;
import com.sparta.myselectshop.naver.service.NaverApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class NaverApiController {
    private final NaverApiService naverApiService;

    @GetMapping("/search")
    public List<ItemDto> searchItems(@RequestParam String query){
        return naverApiService.searchItems(query);
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDto registerItem(@RequestBody ItemDto itemDto){
        return naverApiService.registerItem(itemDto);
    }
    @GetMapping("/products")
    public List<ProductResponseDto> getWishItems(){
        return naverApiService.getWishItems();
    }
    @PutMapping("/products/{id}")
    public ProductResponseDto updateItem(@PathVariable Long id, @RequestBody UpdateReqDto updateReqDto){
        return naverApiService.updateItem(id,updateReqDto);
    }
}
