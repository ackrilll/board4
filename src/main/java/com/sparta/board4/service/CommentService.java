package com.sparta.board4.service;

import com.sparta.board4.dto.CommentResponseDto;
import com.sparta.board4.dto.CommentSaveRequestDto;
import com.sparta.board4.dto.CommentSaveResponseDto;
import com.sparta.board4.entity.Board;
import com.sparta.board4.entity.Comment;
import com.sparta.board4.repository.BoardRepository;
import com.sparta.board4.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CommentService {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    @Transactional
    public CommentSaveResponseDto saveComment(long boardId, CommentSaveRequestDto commentSaveRequestDto) {
        Board board = boardRepository.findById(boardId).orElseThrow(()-> new NullPointerException("보드 못 찾음"));
        Comment newComment = new Comment(commentSaveRequestDto.getComment(),board);
        Comment savedComment = commentRepository.save(newComment);
        return new CommentSaveResponseDto(savedComment.getId(),savedComment.getContent());
    }

    public List<CommentResponseDto> getComments() {
        List<Comment> comments = commentRepository.findAll();
        List<CommentResponseDto> commentResponseDtos = new ArrayList<>();
        for (Comment comment : comments) {
            commentResponseDtos.add(new CommentResponseDto(comment.getId(),comment.getContent()));
        }
        return commentResponseDtos;
    }
}
