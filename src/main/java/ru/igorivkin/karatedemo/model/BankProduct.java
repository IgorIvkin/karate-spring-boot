package ru.igorivkin.karatedemo.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankProduct {
    private Integer id;
    private String title;
}
