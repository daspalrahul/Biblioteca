package com.twu.biblioteca.view;


import com.twu.biblioteca.controller.UserMenuDispatcher;

public interface IView {

    public void draw();

    public IView next(UserMenuDispatcher userMenuDispatcher);
}
