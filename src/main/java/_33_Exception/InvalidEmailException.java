package _33_Exception;

public class InvalidEmailException extends RuntimeException{ // 런타임은 trycatch 강제 X
    public InvalidEmailException(String message){
        super(message);
    }
}
