package com.example.board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.service.*;
import com.example.board.vo.*;


@Controller // 컨트롤러를 명시하는 어노테이션
@RequestMapping("/board") // url 경로설정
public class CommentController {
    private CommentService commentService;
}
