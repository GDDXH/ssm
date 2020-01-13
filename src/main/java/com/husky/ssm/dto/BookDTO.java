package com.husky.ssm.dto;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/12
 */
public class BookDTO {
    /**
     * ID
     */
    private Long id;

    /**
     * 图书ID
     */
    private String bookId;

    /**
     * 图书名称
     */
    private String bookName;

    /**
     * 状态
     * PURCHASE:采购中
     * AVAILABLE:可借
     * BORROWED:已借
     * LOSE:丢失
     */
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookDTO[bookId=" + bookId + ",bookName=" + bookName + ",status=" + status + "]";
    }
}
