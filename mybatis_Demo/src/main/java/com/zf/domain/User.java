package com.zf.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private String id;
    private String username;
    private int age;
    private String address;

}
