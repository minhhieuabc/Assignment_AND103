package com.example.assignment_and103.Model;

public class Respone<T> {
    private int status;
    private String messenger;
    private T data;

    public Respone() {
    }

    public Respone(int status, String messenger, T data) {
        this.status = status;
        this.messenger = messenger;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessenger() {
        return messenger;
    }

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
