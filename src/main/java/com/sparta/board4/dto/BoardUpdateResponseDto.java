package com.sparta.board4.dto;

import lombok.Getter;

@Getter
public class BoardUpdateResponseDto {
    private final Long id;
    private final String title;
    private final String content;
    public BoardUpdateResponseDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
