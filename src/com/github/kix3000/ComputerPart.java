package com.github.kix3000;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
