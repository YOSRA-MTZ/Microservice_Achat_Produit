package com.example.achat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AchatReq {
    //private Date date;
    private String currency;
    private List<Long> productsIds;
}
