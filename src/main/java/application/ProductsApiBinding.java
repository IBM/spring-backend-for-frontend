package application;

//this is the class that binds to selected services
import application.model.Product;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
public class ProductsApiBinding  {


  public ApiResponseMessage<Product> add(String productName) {
      return new ApiResponseMessage<>(HttpStatus.NOT_FOUND, "", null);
  }
  public ApiResponseMessage<List<Product>> getAll() {
      return new ApiResponseMessage<>(HttpStatus.NOT_FOUND, "", null);
  }
}

