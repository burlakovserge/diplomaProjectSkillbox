package com.skillbox.diplomaProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private byte is_moderator;

    //@Temporal(TemporalType.DATE)
    @NotNull
    private LocalDateTime reg_time;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String password;

    private String code;

    private String photo;

    @OneToMany (mappedBy = "user")
    private Set<Post> posts;

    @OneToMany (mappedBy = "user")
    private Set<PostComment> postComments;

    @OneToMany (mappedBy = "user")
    private Set<PostVote> postVotes;

}
