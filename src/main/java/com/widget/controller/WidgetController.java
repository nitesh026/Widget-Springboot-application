package com.widget.controller;

import com.widget.model.Widget;
import com.widget.services.WidgetService;
import com.widget.util.ErrorUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("v1/")
public class WidgetController {


    @Autowired
    WidgetService widgetService;

    @PostMapping("createWidget")
    public ResponseEntity createWidget(@Valid @RequestBody Widget widget, BindingResult result){
        if(ErrorUtils.getErrors(result).size() !=0){
            return ResponseEntity.ok(ErrorUtils.getErrors(result));
        } else {
            return ResponseEntity.ok(widgetService.createWidget(widget));
        }
    }

    @GetMapping("getAllWidgets")
    public ResponseEntity getAllWidgets(){
        return ResponseEntity.ok(widgetService.getAllWidgets());
    }

    @GetMapping("getWidgetByName/{name}")
    public ResponseEntity getWidgetByName(@PathVariable String name){
        return ResponseEntity.ok(widgetService.getWidgetByName(name));
    }

    @DeleteMapping("deleteWidget/{name}")
    public ResponseEntity deleteWidgetByName(@PathVariable String name){
        return ResponseEntity.ok(widgetService.deleteWidgetByName(name));
    }

    @PutMapping("updateWidget")
    public ResponseEntity updateWidget(@Valid @RequestBody Widget widget,BindingResult result){
       if(ErrorUtils.getErrors(result).size() > 0){
           return ResponseEntity.ok(ErrorUtils.getErrors(result));
       }
       else {
            return ResponseEntity.ok(widgetService.updateWidgetDescription(widget.getName(),widget.getDescription()));
        }

    }
}
