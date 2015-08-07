package com.twu.biblioteca.view;


public interface IView {

    public void draw();

    public IView next(IView view);
}
