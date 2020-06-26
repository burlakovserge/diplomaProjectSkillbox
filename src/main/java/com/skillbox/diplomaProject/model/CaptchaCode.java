package com.skillbox.diplomaProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "captcha_codes")
public class CaptchaCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   // @Temporal(TemporalType.DATE)
    @NotNull
    private LocalDateTime time;

    @NotNull
    private byte code;

    @NotNull
    private byte secret_code;
}
