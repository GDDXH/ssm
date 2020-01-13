package com.husky.ssm.dto;

import java.util.Date;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/12
 */
public class BorrowDTO {
    /**
     * ID
     */
    private Long id;

    /**
     * 借书单号
     */
    private String borrowId;

    /**
     * 学生学号
     */
    private String studentId;

    /**
     * 图书单号
     */
    private String bookId;

    /**
     * 状态
     * BORROWED:已借
     * RETURNED:已还
     * OVERDUE:超期
     * LOSE:丢失
     */
    private String status;

    /**
     * 借出时间
     */
    private Date borrowTime;

    /**
     * 还书时间
     */
    private Date returnTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "BorrowDTO[borrowId=" + borrowId + ",studentId=" + studentId + ",bookId=" + bookId + ",status=" + status + ",borrowTime=" + borrowTime + ",returnTime=" + returnTime + "]";
    }
}
