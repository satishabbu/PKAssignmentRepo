package com.pk.producer.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class AppConstants {

  private AppConstants() {}

  /** Kafka constants */
  public static final String TOPIC_NAME = "oo6eeuc2-default";
  public static final String GROUP_ID = "pkglobal";

  /** Splunk constants */
  public static final String SPLUNK_HOST = "prd-p-q653h.splunkcloud.com";
  public static final String SPLUNK_PORT = "8089";
  public static final String SCHEME = "https";

  /** Masking config */
  public static final List<String> MASKED_FIELDS =
      Collections.unmodifiableList(Arrays.asList("customerNumber", "birthdate", "email"));
}
