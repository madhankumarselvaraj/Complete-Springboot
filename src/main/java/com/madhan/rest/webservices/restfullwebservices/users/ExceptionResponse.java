/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import java.util.Date;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class ExceptionResponse {

private Date timestamp;
private String reason;
private String details;

public ExceptionResponse(Date timestamp, String reason, String details) {
    this.timestamp = timestamp;
    this.reason = reason;
    this.details = details;
}

public Date getTimestamp() {
    return timestamp;
}

public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
}

public String getReason() {
    return reason;
}

public void setReason(String reason) {
    this.reason = reason;
}

public String getDetails() {
    return details;
}

public void setDetails(String details) {
    this.details = details;
}

}
