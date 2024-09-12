package com.sparta.board4.controller;

import com.sparta.board4.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentContoller {
    private final CommentService commentService;
}
