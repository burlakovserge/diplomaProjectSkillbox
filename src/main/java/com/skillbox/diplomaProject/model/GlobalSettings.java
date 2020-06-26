package com.skillbox.diplomaProject.model;

import com.skillbox.diplomaProject.model.enumerated.Epost;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "global_settings")
public class GlobalSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String code;

    @NotNull
    private String name;

    @NotNull
    private String value;


}
