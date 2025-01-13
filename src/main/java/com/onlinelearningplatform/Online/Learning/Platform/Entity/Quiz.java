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
    private Long course_id;
    private String question;
    private String correct_answer;

    @ElementCollection
    private List<String> options;
}
