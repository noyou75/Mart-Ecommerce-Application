package com.samfrosh.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin()
@RestController
public class ProductStatusController {

    @Autowired
    private ProductStatusService productStatusService;

    @GetMapping("/productstatus")
    public List<ProductStatus> findProductStatus(){
        return productStatusService.getProductStatusList();
    }

}
