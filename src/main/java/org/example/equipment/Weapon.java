package org.example.equipment;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Weapon {
    private String weaponName;
    private double damage;
    private int durability;
}
