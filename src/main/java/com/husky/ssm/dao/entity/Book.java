package com.husky.ssm.dao.entity;

import javax.persistence.*;

@Table(name = "book")
public class Book {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 图书编号
     */
    @Column(name = "book_id")
    private String bookId;

    /**
     * 图书名称
     */
    @Column(name = "book_name")
    private String bookName;

    /**
     * 状态
PURCHASE:采购中
AVAILABLE:可借
BORROWED:已借
LOSE:丢失


     */
    private String status;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取图书编号
     *
     * @return book_id - 图书编号
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * 设置图书编号
     *
     * @param bookId 图书编号
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * 获取图书名称
     *
     * @return book_name - 图书名称
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 设置图书名称
     *
     * @param bookName 图书名称
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * 获取状态
PURCHASE:采购中
AVAILABLE:可借
BORROWED:已借
LOSE:丢失


     *
     * @return status - 状态
PURCHASE:采购中
AVAILABLE:可借
BORROWED:已借
LOSE:丢失


     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
PURCHASE:采购中
AVAILABLE:可借
BORROWED:已借
LOSE:丢失


     *
     * @param status 状态
PURCHASE:采购中
AVAILABLE:可借
BORROWED:已借
LOSE:丢失


     */
    public void setStatus(String status) {
        this.status = status;
    }
}