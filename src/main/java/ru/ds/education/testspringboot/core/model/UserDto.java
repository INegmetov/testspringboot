package ru.ds.education.testspringboot.core.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private AddressDto addressDto;


}
