//tag::all[]
//tag::allButValidation[]
package com.example.demo;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author DeepFeeling-1999
 */
@Data
public class Order {

  @NotBlank(message="Name is required")
  private String name;

  @NotBlank(message="Street is required")
  private String street;

  @NotBlank(message="City is required")
  private String city;

  @NotBlank(message="State is required")
  private String state;

  @NotBlank(message="Zip code is required")
  private String zip;

  //@CreditCardNumber(message="Not a valid credit card number")
  private String ccNumber;

  @Pattern(regexp="^(0[1-9]|1[0-9]|20)([\\/])([1-9][0-9])$",
           message="Must be formatted MM/YY")
  private String ccExpiration;

  /**
   * 数字验证，确保值包含三位数字
   */
  @Digits(integer=3, fraction=0, message="Invalid CVV")
  private String ccCVV;

}