package com.skillbox.diplomaProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "post_votes") //лайки и дизлайки постов
public class PostVote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "user_id")
    @NotNull
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "post_id")
    @NotNull
    private Post post;

   // @Temporal(TemporalType.DATE)
    @NotNull
    private LocalDateTime time;

    @NotNull
    private byte value;
}
