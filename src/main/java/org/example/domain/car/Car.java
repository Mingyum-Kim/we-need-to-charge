package org.example.domain.car;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Car {

    @Id @GeneratedValue
    private Long id;

    private String company;

    private String brand;

    private String name;

    private String chargeType;

}
