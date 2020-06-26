package com.skillbox.diplomaProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tag2post")
public class Tag2Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "post_id")
    @NotNull
    private Post post;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "tag_id")
    @NotNull
    private Tag tag;

}
