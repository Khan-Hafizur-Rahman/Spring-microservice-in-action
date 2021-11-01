package com.optimagrowth.licensingservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * @author Khan Hafizur Rahman
 * @since 1/11/21
 */
@Getter
@Setter
@ToString
@Builder
public class License {

    private int id;
    private String licenseId;
    private String description;
    private String organizatonId;
    private String productName;
    private String licenseType;
}
