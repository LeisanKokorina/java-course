package ru.itpark;

import com.sun.org.apache.regexp.internal.RE;

public class Rectangle {
    private  int length;
    private  int weigth;

    public Rectangle(int length, int weigth) {
        if(length < 0){
            this.length = 1;
        }else{
        this.length = length;
        }
        if(weigth < 0){
            this.weigth = 1;
        }else {
            this.weigth = weigth;
        }
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getLength() {
        return length;
    }

    public int getWeigth() {
        return weigth;
    }

    public boolean equals(Object object) {
        if ( object == null || !(object instanceof Rectangle)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        Rectangle that = (Rectangle) object;
        return this.length == that.length &&
                this.weigth == that.weigth;
    }
}
