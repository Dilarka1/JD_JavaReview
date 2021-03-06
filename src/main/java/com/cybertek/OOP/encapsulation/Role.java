package com.cybertek.OOP.encapsulation;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Role {
    private Integer id;
    private String description;

//    public Role(long id, String description) {
//        this.id = id;
//        this.description = description;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
