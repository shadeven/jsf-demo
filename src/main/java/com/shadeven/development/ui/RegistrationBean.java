package com.shadeven.development.ui;

import org.primefaces.event.FlowEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class RegistrationBean {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * It guarantees that the method will be invoked only once in the bean lifecycle.
     */
    @PostConstruct
    public void init() {

    }

    public void save() {
        logger.info("Invoking Save method...");
        FacesMessage message = new FacesMessage("Sucessful", "Welcome");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public String onFlowProcess(FlowEvent event) {
        logger.info("Event step: {}", event.getNewStep());
        return event.getNewStep();
    }
}
