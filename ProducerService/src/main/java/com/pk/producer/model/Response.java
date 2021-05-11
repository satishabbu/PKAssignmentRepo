package com.pk.producer.model;

import java.util.Objects;
import javax.validation.constraints.NotNull;
// import io.swagger.annotations.ApiModel;
// import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen",
    date = "2021-04-23T09:59:16.810Z")

public class Response {
  @JsonProperty("status")
  private String status = "success";

  @JsonProperty("message")
  private String message = null;

  public Response status(String status) {
    this.status = status;
    return this;
  }

  @ApiModelProperty(required = true, value = "status is required")
  @NotNull(message = "status is required")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Response message(String message) {
    this.message = message;
    return this;
  }

  @ApiModelProperty(required = true, value = "message is required")
  @NotNull(message = "message is required")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.status, response.status)
        && Objects.equals(this.message, response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");

    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
