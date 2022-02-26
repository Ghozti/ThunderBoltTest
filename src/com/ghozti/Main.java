package com.ghozti;

import net.java.games.input.*;

public class Main {

    public static void main(String[] args) {
        Controller[] controllers = ControllerEnvironment.getDefaultEnvironment().getControllers();
        Controller controller = null;

        for (int i = 0; i < controllers.length; i++) {
            if (controllers[i].getType() == Controller.Type.MOUSE){
                controller = controllers[i];
            }
        }

        EventQueue eventQueue;
        Event event;
        boolean stopped = false;

        while (!stopped){
            controller.poll();
            eventQueue = controller.getEventQueue();
            event = new Event();

            while (eventQueue.getNextEvent(event)) {
                System.out.println("***");
            }
        }
    }
}
