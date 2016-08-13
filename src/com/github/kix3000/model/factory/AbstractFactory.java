package com.github.kix3000.model.factory;

import com.github.kix3000.model.color.Color;
import com.github.kix3000.model.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
