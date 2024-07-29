package com.sparta.myselectshop.naver.controller;

import com.sparta.myselectshop.naver.dto.ItemDto;
import com.sparta.myselectshop.naver.dto.ProductResponseDto;
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
    public ProductResponseDto registerItems(@RequestBody ItemDto itemDto){
        return naverApiService.registerItems(itemDto);
    }
}
