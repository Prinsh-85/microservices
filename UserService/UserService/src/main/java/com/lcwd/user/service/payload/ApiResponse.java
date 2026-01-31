package com.lcwd.user.service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    private String meassage;
    private boolean success;
    private HttpStatus status;
}
