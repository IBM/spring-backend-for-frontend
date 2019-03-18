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
@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBindingsConfig", date = "2019-03-18T15:15:44.034Z")

@Controller
public class ProductsApiController implements ProductsApi {

    @Autowired
	private ProductsApiBinding services;

    private final ObjectMapper objectMapper;

    public ProductsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Product> add(@ApiParam(value = "Product name" ,required=true )  @Valid @RequestBody String productName,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {


        ApiResponseMessage<Product> result = services.add(productName);

        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<Product>(result.getData(), result.getCode());
        }

        return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Product>> getAll(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {


        ApiResponseMessage<List<Product>> result = services.getAll();

        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<List<Product>>(result.getData(), result.getCode());
        }

        return new ResponseEntity<List<Product>>(HttpStatus.BAD_REQUEST);
    }

}
