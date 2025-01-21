package com.onlinelearningplatform.Online.Learning.Platform.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long courseId;
    private String question;

    @ElementCollection
    private List<String> correctAnswer;

    @ElementCollection
    private List<String> options;


}
