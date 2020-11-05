package com.example.finalwork;

public class Item {
    private int id;
    private String time;
    private String kind;
    private String num;

    public Item() {
        super();
        time = "";
        kind = "";
        num = "";
    }
    public Item(String time, String kind, String num) {
        super();
        this.time = time;
        this.kind = kind;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}

