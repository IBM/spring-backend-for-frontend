package application;
//this is the new package generation for spring with service bindings
import application.model.Product;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBindingsConfig", date = "2018-11-29T18:57:45.335Z")

@Controller
public class ProductApiController implements ProductApi {

    @Autowired
	private ProductApiBinding services;

    private final ObjectMapper objectMapper;

    public ProductApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Product> delete(@ApiParam(value = "Product ID",required=true ) @PathVariable("productID") Long productID,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {


        ApiResponseMessage<Product> result = services.delete(productID);

        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<Product>(result.getData(), result.getCode());
        }

        return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Product> get(@ApiParam(value = "Product ID",required=true ) @PathVariable("productID") Long productID,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {


        ApiResponseMessage<Product> result = services.get(productID);

        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<Product>(result.getData(), result.getCode());
        }

        return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Product> update(@ApiParam(value = "Product ID",required=true ) @PathVariable("productID") Long productID,
        @ApiParam(value = "Product name" ,required=true )  @Valid @RequestBody String productName,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {


        ApiResponseMessage<Product> result = services.update(productID, productName);

        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<Product>(result.getData(), result.getCode());
        }

        return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
    }

}
