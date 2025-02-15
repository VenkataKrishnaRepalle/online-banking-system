package com.learning.onlinebankingsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {
    private String addressLine1;

    private String addressLine2;

    private String landmark;

    private String state;

    private String city;

    private String pincode;
}
