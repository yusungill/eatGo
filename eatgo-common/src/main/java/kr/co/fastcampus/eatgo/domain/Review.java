package kr.co.fastcampus.eatgo.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    private Long restaurantId;

    private String name;

    @NotNull
    private Integer score;

    @NotEmpty
    private String description;

}
