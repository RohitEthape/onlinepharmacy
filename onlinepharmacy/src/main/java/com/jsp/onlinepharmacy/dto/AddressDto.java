package com.jsp.onlinepharmacy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressDto {

	private int addressId;
    private String streetName;
    private String city;
    private String state;
    private long pincode;


}
