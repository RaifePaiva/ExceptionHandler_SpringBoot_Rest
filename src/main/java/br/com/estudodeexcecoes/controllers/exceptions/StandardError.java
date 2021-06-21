package br.com.estudodeexcecoes.controllers.exceptions;

import java.time.LocalDateTime;

public class StandardError {

    private Integer status;
    private String msg;
    private LocalDateTime time;

    public StandardError(Integer status, String msg, LocalDateTime time) {
        this.status = status;
        this.msg = msg;
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
