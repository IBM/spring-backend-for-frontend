package application;

import org.springframework.http.HttpStatus;

@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBindingsConfig", date = "2019-01-22T20:40:17.773Z")

@javax.xml.bind.annotation.XmlRootElement
public class ApiResponseMessage<T> {

    private HttpStatus code;
    private String message;
    private T data;

    public ApiResponseMessage(){}

    public ApiResponseMessage(HttpStatus code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    
    public ApiResponseMessage(int code, String message, T data){
        this.code = HttpStatus.valueOf(code);
        this.message = message;
        this.data = data;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public T getData() {
    	return data;
    }
}