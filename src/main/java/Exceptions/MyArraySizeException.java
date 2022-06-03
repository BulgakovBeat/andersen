package Exceptions;

import lombok.Getter;

@Getter
public class MyArraySizeException extends Throwable {
    private final String str;

    public MyArraySizeException(int n, int m) {
        this.str = "Error Size of Array: " + n + " " + m;
    }

    @Override
    public String toString() {
        return "MyArraySizeException{" +
                "str='" + str + '\'' +
                '}';
    }
}
