package com.skillbox.diplomaProject.model;

import com.skillbox.diplomaProject.model.enumerated.Epost;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private byte is_active;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Epost moderation_status;

    @NotNull
    private int moderator_id;

    @ManyToOne
    @JoinColumn(name="user.id")
    @NotNull
    private User user;

    // @Temporal(TemporalType.DATE)
    @NotNull
    private LocalDateTime time;

    @NotNull
    private String title;

    @NotNull
    private String text;

    @NotNull
    private int view_count;

    @OneToMany (mappedBy = "post")
    private Set<PostVote> postVotes;

    @OneToMany (mappedBy = "post")
    private Set<PostComment> postComments;

    @OneToMany (mappedBy = "post")
    private Set<Tag2Post> tag2Posts;
}
