package com.onlinelearningplatform.Online.Learning.Platform.Dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VideoDto {

    @NotNull(message = "Title is required")
    private String title;

    @NotNull(message = "Video URL is required")
    private String videoUrl;

    @NotNull(message = "Create at is required")
    private String createdAt;

}
