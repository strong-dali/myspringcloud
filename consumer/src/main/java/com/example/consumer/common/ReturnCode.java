package com.example.consumer.common;

public enum ReturnCode {
    SUCCESS(0,"success"),
    ERROR(1,"error");

    private int code;
    private String mes;

    ReturnCode(int code, String mes) {
        this.code = code;
        this.mes = mes;
    }

    public int getCode() {
        return code;
    }

    public String getMes() {
        return mes;
    }
}
