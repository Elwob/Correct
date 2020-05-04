package com.company.controller;

import com.company.view.Console;

public class Controller {
    ControllerMenue controllerMenue = null;


    public void start() {

        Console newConsole = new Console();
        newConsole.view();
    }


}
