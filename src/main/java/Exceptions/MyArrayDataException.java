package Exceptions;

import lombok.Getter;

@Getter
public class MyArrayDataException extends Throwable {
    private final String s;

    public MyArrayDataException(int i, int j, String s) {
        this.s = "Error Type of Element in Array: " + i + " " + j + " value: " + s;
    }

    @Override
    public String toString() {
        return "MyArrayDataException{" +
                "s='" + s + '\'' +
                '}';
    }
}
