package com.sparta.board4.controller;

import com.sparta.board4.dto.CommentResponseDto;
import com.sparta.board4.dto.CommentSaveRequestDto;
import com.sparta.board4.dto.CommentSaveResponseDto;
import com.sparta.board4.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentContoller {
    private final CommentService commentService;

    @PostMapping("/boards/{boardId}/comments")
    public ResponseEntity<CommentSaveResponseDto> saveComment(@PathVariable long boardId,
                                                              @RequestBody CommentSaveRequestDto commentSaveRequestDto){
        return ResponseEntity.ok(commentService.saveComment(boardId,commentSaveRequestDto));
    }

    @GetMapping("boards/comments")
    public ResponseEntity<List<CommentResponseDto>> getComments(){
        return ResponseEntity.ok(commentService.getComments());
    }
}
