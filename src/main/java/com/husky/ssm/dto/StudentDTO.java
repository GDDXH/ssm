package com.husky.ssm.dto;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/12
 */
public class StudentDTO {
    /**
     * ID
     */
    private Long id;

    /**
     * 学号
     */
    private String studentId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 状态
     * NORMAL:正常
     * ABNORMAL:异常
     * GRADUATION:毕业
     */
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StudentDTO[studentId=" + studentId + ",studentName=" + studentName + ",Statue=" + status + "]";
    }
}
