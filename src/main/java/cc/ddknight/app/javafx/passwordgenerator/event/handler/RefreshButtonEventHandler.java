package cc.ddknight.app.javafx.passwordgenerator.event.handler;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 * @author ddknight (Create on:2016年11月18日)
 */
public class RefreshButtonEventHandler implements EventHandler {

    /* (non-Javadoc)
     * @see javafx.event.EventHandler#handle(javafx.event.Event)
     */
    @Override
    public void handle(Event event) {
        // TODO Auto-generated method stub
        System.out.println(event.getEventType());
    }

}
