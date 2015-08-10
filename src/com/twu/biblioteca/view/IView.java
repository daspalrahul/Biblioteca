package com.twu.biblioteca.view;


import com.twu.biblioteca.controller.ViewDispatcher;

public interface IView {

    public void draw();

    public IView next(ViewDispatcher viewDispatcher);
}
