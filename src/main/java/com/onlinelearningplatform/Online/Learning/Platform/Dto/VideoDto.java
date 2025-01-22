package com.onlinelearningplatform.Online.Learning.Platform.Dto;

import lombok.*;

import javax.validation.constraints.NotNull;

public class VideoDto {

    @NotNull(message = "Title is required")
    private String title;

    @NotNull(message = "Video URL is required")
    private String videoUrl;

    @NotNull(message = "Create at is required")
    private String createdAt;

    public @NotNull(message = "Create at is required") String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NotNull(message = "Create at is required") String createdAt) {
        this.createdAt = createdAt;
    }

    public @NotNull(message = "Title is required") String getTitle() {
        return title;
    }

    public void setTitle(@NotNull(message = "Title is required") String title) {
        this.title = title;
    }

    public @NotNull(message = "Video URL is required") String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(@NotNull(message = "Video URL is required") String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
