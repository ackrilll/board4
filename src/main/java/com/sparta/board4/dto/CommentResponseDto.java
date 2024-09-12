package com.sparta.board4.dto;

import lombok.Getter;

@Getter
public class CommentResponseDto {
    private final Long id;
    private final String comment;
    public CommentResponseDto(Long id, String comment) {
        this.id = id;
        this.comment = comment;
    }
}
