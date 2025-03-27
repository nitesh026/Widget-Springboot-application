package com.widget.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

public class ErrorUtils {

    public static List<String> getErrors(BindingResult result) {
        List<String> errors = new ArrayList<>();
        if (result.hasErrors()) {
            for (ObjectError error : result.getAllErrors()) {
                errors.add(error.getDefaultMessage());
            }

        }
        return errors;
    }
}
