package com.vasilievaleksey.plugin.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class extjiragitModel {

    @XmlElement(name = "value")
    private String message;

    public extjiragitModel() {
    }

    public extjiragitModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}