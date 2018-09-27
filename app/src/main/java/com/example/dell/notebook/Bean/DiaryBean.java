package com.example.dell.notebook.Bean;

public class DiaryBean {
    private String date;
    private String title;
    private String content;
    private String nlabel;
    public DiaryBean(String date,String title,String content,String nlabel){
        this.date = date;
        this.title = title;
        this.content = content;
        this.nlabel = nlabel;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setNlabel(String nlabel){
        this.nlabel = nlabel;
    }
}

