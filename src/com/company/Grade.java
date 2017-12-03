package com.company;

/**
 * Created by furkan on 30.11.2017.
 */
public enum Grade {
    FF(0.0f), FD(0.5f), DD(1.0f), DC(1.5f), CC(2.0f), CB(2.5f), BB(3.0f), BA(3.5f), AA(4.0f) ;

    float value;

    Grade(float value) {
        this.value = value;
    }
    public float getValue(){
        return value;
    }
}
