package application.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A product object
 */
@ApiModel(description = "A product object")
@Validated
@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBindingsConfig", date = "2019-01-22T20:40:17.773Z")

public class Product   {
  @JsonProperty("identifier")
  private Long identifier = null;

  @JsonProperty("name")
  private String name = null;

  public Product identifier(Long identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Long identifier) {
    this.identifier = identifier;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.identifier, product.identifier) &&
        Objects.equals(this.name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

