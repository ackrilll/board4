package com.sparta.board4.dto;

import lombok.Getter;

@Getter
public class CommentSaveResponseDto {
    private final Long id;
    private final String comment;
    public CommentSaveResponseDto(Long id, String comment) {
        this.id = id;
        this.comment = comment;
    }
}
