package com.sparta.board4.dto;

import com.sparta.board4.entity.Board;
import com.sparta.board4.entity.Comment;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BoardSimpleResponseDto {
    private final Long id;
    private final String title;
    private final List<CommentResponseDto> dtoList;

    public BoardSimpleResponseDto(Long id, String title, List<Comment> comments) {
        List<CommentResponseDto> dtoList = new ArrayList<>();
        for (Comment comment : comments) {
            CommentResponseDto commentResponseDto = new CommentResponseDto(comment.getId(), comment.getContent());
            dtoList.add(commentResponseDto);
        }
        this.id = id;
        this.title = title;
        this.dtoList = dtoList;

    }

}
