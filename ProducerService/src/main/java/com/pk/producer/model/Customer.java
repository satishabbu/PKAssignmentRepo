package com.pk.producer.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
// import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen",
    date = "2021-04-23T09:59:16.810Z")

public class Customer {
  @JsonProperty("customerNumber")
  @NotNull
  private String customerNumber = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("birthDate")
  private OffsetDateTime birthDate = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  @JsonProperty("email")
  private String email = null;

  /**
   * f Gets or Sets customerStatus
   */
  public enum CustomerStatusEnum {
    RESTORED("Restored"),

    SUSPENDED("Suspended"),

    OPEN("Open"),

    CLOSED("Closed");

    private String value;

    CustomerStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerStatusEnum fromValue(String text) {
      for (CustomerStatusEnum b : CustomerStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("customerStatus")
  private CustomerStatusEnum customerStatus = null;

  @JsonProperty("address")
  private Object address = null;

  public Customer customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  @ApiModelProperty(required = true, value = "customer number is required")
  @NotNull(message = "customer number is required")
  @Size(max = 10, message = "maximum 10 characters can be entered")
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  @ApiModelProperty(required = true, value = "first name is required")
  @NotNull(message = "first name is required")
  @Size(min = 10, max = 50, message = "min 10 / max 50 characters required")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  @ApiModelProperty(required = true, value = "last name is required")
  @NotNull(message = "last name is required")
  @Size(min = 10, max = 50, message = "min 10 / max 50 characters required")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer birthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  @ApiModelProperty(required = true, value = "birth date is required")
  @Valid
  public OffsetDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
  }

  public Customer country(String country) {
    this.country = country;
    return this;
  }

  @ApiModelProperty(example = "India", required = true, value = "country is required")
  @NotNull(message = "country is required")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Customer countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  @ApiModelProperty(example = "IN", required = true, value = "country code is required")
  @NotNull(message = "country code is required")
  @Size(max = 2, message = "max 2 chars can be entered")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Customer mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  @ApiModelProperty(example = "5555551216", required = true, value = "mobile number is required")
  @NotNull(message = "mobile number is required")
  @Size(max = 10, message = "max 10 chars can be entered")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

  @ApiModelProperty(example = "abc@gmail.com", required = true, value = "email is required")
  @NotNull(message = "email is required")
  @Size(max = 50, message = "max 50 chars can be entered")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer customerStatus(CustomerStatusEnum customerStatus) {
    this.customerStatus = customerStatus;
    return this;
  }

  @ApiModelProperty(required = true, value = "customer status is required")
  @NotNull(message = "customer status is required")
  public CustomerStatusEnum getCustomerStatus() {
    return customerStatus;
  }

  public void setCustomerStatus(CustomerStatusEnum customerStatus) {
    this.customerStatus = customerStatus;
  }

  public Customer address(Object address) {
    this.address = address;
    return this;
  }

  @ApiModelProperty(required = true, value = "address is required")
  @NotNull(message = "address is required")
  public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerNumber, customer.customerNumber)
        && Objects.equals(this.firstName, customer.firstName)
        && Objects.equals(this.lastName, customer.lastName)
        && Objects.equals(this.birthDate, customer.birthDate)
        && Objects.equals(this.country, customer.country)
        && Objects.equals(this.countryCode, customer.countryCode)
        && Objects.equals(this.mobileNumber, customer.mobileNumber)
        && Objects.equals(this.email, customer.email)
        && Objects.equals(this.customerStatus, customer.customerStatus)
        && Objects.equals(this.address, customer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, firstName, lastName, birthDate, country, countryCode,
        mobileNumber, email, customerStatus, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");

    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    customerStatus: ").append(toIndentedString(customerStatus)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

