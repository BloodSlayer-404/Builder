package org.example.equipment;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Helmet {
    private String helmetName;
    private double protectionPoints;
    private int durability;
}
