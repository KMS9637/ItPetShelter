package com.itpetshelter.itpetshelter.Domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    private String Uid;
    private String Upw;
    private String Uname;
    private String Uphone;
}

