/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package application;

import application.model.Product;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBindingsConfig", date = "2019-03-07T14:51:57.973Z")

@Api(value = "product", description = "the product API")
public interface ProductApi {

    @ApiOperation(value = "", notes = "Delete product by ID", response = Product.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "One product", response = Product.class) })
    @RequestMapping(value = "/product/{productID}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Product> delete(@ApiParam(value = "Product ID",required=true ) @PathVariable("productID") Long productID, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "", notes = "Get product by ID", response = Product.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "One product", response = Product.class) })
    @RequestMapping(value = "/product/{productID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Product> get(@ApiParam(value = "Product ID",required=true ) @PathVariable("productID") Long productID, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "", notes = "Update product by ID", response = Product.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "One product", response = Product.class) })
    @RequestMapping(value = "/product/{productID}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Product> update(@ApiParam(value = "Product ID",required=true ) @PathVariable("productID") Long productID,@ApiParam(value = "Product name" ,required=true )  @Valid @RequestBody String productName, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
