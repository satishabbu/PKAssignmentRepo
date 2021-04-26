package com.pk.engineering.excellence.producer.service;

import com.pk.engineering.excellence.producer.constants.AppConstants;
import com.splunk.Service;
import com.splunk.ServiceArgs;

public class SplunkService {

  ServiceArgs connectionArgs = new ServiceArgs();

  public SplunkService() {
    connectToSplunk();
  }

  public Service connectToSplunk() {
    connectionArgs.put("host", AppConstants.SPLUNK_HOST);
    // connectionArgs.put("port", port);
    connectionArgs.put("scheme", AppConstants.SCHEME);
    connectionArgs.put("username", "sc_admin");
    connectionArgs.put("password", "Renu@143");

    return Service.connect(connectionArgs);
  }

}
