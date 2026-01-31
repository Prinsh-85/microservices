package com.lcwd.user.service.external.service;

import com.lcwd.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RATINGSERVICE")
public interface RatingService {
    @GetMapping("/ratings/{ratingId}")
    Rating getRating(@PathVariable String ratingId);
}
