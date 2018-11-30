package application;

@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBindingsConfig", date = "2018-11-30T22:32:41.632Z")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
