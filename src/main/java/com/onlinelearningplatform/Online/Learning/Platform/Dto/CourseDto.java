package com.onlinelearningplatform.Online.Learning.Platform.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

public class CourseDto {

    @NotNull(message = "Title is required")
    private String title;

    @NotNull(message = "Description is required")
    private String description;

    public @NotNull(message = "Description is required") String getDescription() {
        return description;
    }

    public void setDescription(@NotNull(message = "Description is required") String description) {
        this.description = description;
    }

    public @NotNull(message = "Title is required") String getTitle() {
        return title;
    }

    public void setTitle(@NotNull(message = "Title is required") String title) {
        this.title = title;
    }
}
