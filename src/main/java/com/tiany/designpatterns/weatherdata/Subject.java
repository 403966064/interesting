package com.tiany.designpatterns.weatherdata;

/**
 * Created by tiany on 2017/11/2.
 * 主题，拥有注册，移除，通知方法
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
