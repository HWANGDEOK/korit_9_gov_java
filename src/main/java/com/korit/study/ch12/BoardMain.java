package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {
        // Board 배열 boards -> 게시글 2개

        // Board - id(정수), title(문자열), contents(문자열), writer(Writer), comments(Comment[])

        // Writer - id(정수), name(문자열)

        // Comment - id(정수), contents(문자열), writer(Writer)

        Writer writer = new Writer(1, "newWriter");

        Writer writer1 = new Writer(1651, "writer1");
        Writer writer2 = new Writer(144, "writer2");

        Comment c1 = new Comment(1, "첫 반갑습니다", writer1);
        Comment c2 = new Comment(2, "두번째 반갑습니다", writer2);
        Comment c3 = new Comment(1, "댓글 또 답니다", writer);
        Comment c4 = new Comment(2, "또 만나네요", writer);
        Comment[] comments1 = new Comment[]{c1, c2};
        Comment[] comments2 = new Comment[]{c3, c4};

        Board b1 = new Board(500, "첫 게시글 인사", "처음 뵙겠습니다" ,writer, comments1);
        Board b2 = new Board(502, "두번째 게시글", "글 또 씁니다" ,writer, comments2);

        Board[] boards = new Board[] {b1, b2};

        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.printInfoBoards(boards);
        boardPrintService.printInfoBoard(b1);

    }
}
