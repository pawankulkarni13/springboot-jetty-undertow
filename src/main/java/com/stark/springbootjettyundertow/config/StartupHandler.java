package com.stark.springbootjettyundertow.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupHandler {

    private Logger logger = LoggerFactory.getLogger(StartupHandler.class);

    @EventListener
    public void getAndLogStartupMetrics(
            ApplicationReadyEvent event) {
        logger.info("Time Taken for Application Ready - {} ms",event.getTimeTaken().toMillis());
    }

}
