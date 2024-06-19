package com.itpetshelter.itpetshelter.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Animal", indexes = {
        @Index(name = "idx_Animal_Type_Tno", columnList = "Type_Tno")
})
@Entity
public class Animal {
    @Id
    private int Ano;

    @OneToOne
    @JoinColumn(name = "Tno")
    private Type type;

    @OneToOne
    @JoinColumn(name = "Sno")
    private Shelter shelter;

    @OneToOne
    @JoinColumn(name = "Mno")
    private Manager manager;

    private String Aname;
    private int Aage;
    private boolean Aneutered;
    private boolean Adisease;
    private String Alocate;

}
