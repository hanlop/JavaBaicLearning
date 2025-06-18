package com.oracle;

public class Move {
    private String name;//电影名称
    private String type;//电影类型
    private String director;//电影导演

    public Move() {
    }

    public Move(String name, String type, String director) {
        this.name = name;
        this.type = type;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
