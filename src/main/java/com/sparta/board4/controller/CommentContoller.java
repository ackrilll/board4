package com.sparta.board4.controller;

import com.sparta.board4.dto.CommentSaveRequestDto;
import com.sparta.board4.dto.CommentSaveResponseDto;
import com.sparta.board4.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentContoller {
    private final CommentService commentService;

    @PostMapping("/boards/{boardId}/comments")
    public ResponseEntity<CommentSaveResponseDto> saveComment(@PathVariable long boardId,
                                                              @RequestBody CommentSaveRequestDto commentSaveRequestDto){
        return ResponseEntity.ok(commentService.saveComment(boardId,commentSaveRequestDto));
    }
}
