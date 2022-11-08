package com.personalsoft.afsilva.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    private Integer id;
    private String username;
    private LocalDate targetDate;
    private Boolean done;
}
