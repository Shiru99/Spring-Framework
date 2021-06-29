package io.summer.Part17;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("\n\t"+event.getClass().getSimpleName());
        System.out.println("\t"+event.getSource());
        System.out.println("\t"+event.toString()+"\n");
    }   
}