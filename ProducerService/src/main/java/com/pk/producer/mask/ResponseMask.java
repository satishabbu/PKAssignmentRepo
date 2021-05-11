package com.pk.producer.mask;

import com.pk.producer.model.Response;

public class ResponseMask {

  public Response maskResponse(String message) {
    Response customerResponse = new Response();
    customerResponse.setStatus("success");
    customerResponse.setMessage(message);
    return customerResponse;
  }
}
