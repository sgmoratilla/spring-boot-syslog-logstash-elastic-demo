package com.github.sgmoratilla.demo.springbootsysloglogstashelasticdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Logger log = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    void log() {
        log.info("Logging from /");
    }
}
