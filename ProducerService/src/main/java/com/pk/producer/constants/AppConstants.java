package com.pk.producer.constants;

public class AppConstants {

  private AppConstants() {}

  /** Kafka constants */
  public static final String TOPIC_NAME = "kafkaTopic";
  public static final String GROUP_ID = "pkglobal";

  /** Splunk constants */
  public static final String SPLUNK_HOST = "prd-p-q653h.splunkcloud.com";
  public static final String SPLUNK_PORT = "8089";
  public static final String SCHEME = "https";

}
