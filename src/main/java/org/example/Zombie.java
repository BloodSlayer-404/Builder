package org.example;

import lombok.*;
import org.example.equipment.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Zombie {
    private String name;
    private double healthPoints;
    private Weapon weapon;
    private Helmet helmet;
    private Chesplate chesplate;
    private Leggings leggings;
    private Boots boots;

}
