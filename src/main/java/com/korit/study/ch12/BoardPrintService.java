package com.korit.study.ch12;

public class BoardPrintService {

    void printInfoBoards(Board[] boards) {
        System.out.println("[게시글 목록]");
        for (Board board : boards) {
            printInfoBoardLine(board);
        }
    }

    void printInfoBoardLine(Board board) {
        System.out.printf("게시 번호: %d, 작성자: %s, 제목: %s\n", board.id, board.writer.name, board.title);
    }

    void printInfoBoard(Board board) {
        System.out.println("[게시글 조회]");
        System.out.println("게시 번호: " + board.id);
        printInfoWriter(board.writer);
        System.out.println(board.title);
        printInfoComments(board.comments);
    }

    void printInfoWriter(Writer writer) {
        System.out.println("작성자 ID: " + writer.id + ", 닉네임: " + writer.name);
    }

    void printInfoComments(Comment[] comments) {
        System.out.println("[댓글 목록]");
        for (Comment comment : comments) {
            printInfoComment(comment);
        }
    }

    void printInfoComment(Comment comment) {
        System.out.printf("댓글 번호: %d, ", comment.id);
        printInfoWriter(comment.writer);
        System.out.println("댓글 내용: " + comment.contents);
    }
}
