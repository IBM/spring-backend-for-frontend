package application;

@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBindingsConfig", date = "2018-11-30T22:32:41.632Z")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
