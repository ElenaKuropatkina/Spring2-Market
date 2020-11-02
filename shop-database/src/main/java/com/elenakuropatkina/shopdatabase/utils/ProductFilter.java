package com.elenakuropatkina.shopdatabase.utils;

import lombok.Getter;
import com.elenakuropatkina.shopdatabase.models.Product;
import org.springframework.data.jpa.domain.Specification;
import com.elenakuropatkina.shopdatabase.repositories.specifications.ProductSpecification;

import java.util.Map;

@Getter
public class ProductFilter {

    private Specification<Product> specification;
    private StringBuilder filter;

    public ProductFilter(Map<String, String> map) {
        this.specification = Specification.where(null);
        this.filter = new StringBuilder();
        if (map.containsKey("min_price") && !map.get("min_price").isEmpty()) {
            int minPrice = Integer.parseInt(map.get("min_price"));
            specification = specification.and(ProductSpecification.priceGEThan(minPrice));
            filter.append("&min_price=").append(minPrice);
        }
        if (map.containsKey("max_price") && !map.get("max_price").isEmpty()) {
            int maxPrice = Integer.parseInt(map.get("max_price"));
            specification = specification.and(ProductSpecification.priceLEThan(maxPrice));
            filter.append("&max_price=").append(maxPrice);
        }
        if (map.containsKey("title") && !map.get("title").isEmpty()) {
            String title = map.get("title");
            specification = specification.and(ProductSpecification.titleLike(title));
            filter.append("&title=").append(title);
        }
        if (map.containsKey("id") && !map.get("id").isEmpty()) {
            Long id = Long.getLong(map.get("id"));
            specification = specification.and(ProductSpecification.idE(id));
            filter.append("&id=").append(id);
        }
    }

}
