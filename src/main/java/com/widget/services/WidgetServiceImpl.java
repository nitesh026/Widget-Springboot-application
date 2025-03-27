package com.widget.services;

import com.widget.model.Widget;
import com.widget.repository.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WidgetServiceImpl implements WidgetService {

    @Autowired
    WidgetRepository widgetRepository;

    @Override
    public Widget createWidget(Widget widget) {
        return widgetRepository.save(widget);
    }

    @Override
    public List<Widget> getAllWidgets() {
        return widgetRepository.findAll();
    }

    @Override
    public Widget getWidgetByName(String name) {
        return widgetRepository.findByName(name);
    }

    @Override
    public String updateWidgetDescription(String name, String description) {
        if(widgetRepository.findByName(name) == null){
            return "Widget can not found";
        } else {
            Widget widget = widgetRepository.findByName(name);
            widget.setDescription(description);
            widgetRepository.save(widget);
            return "Widget Updated successfully";
        }
    }

    @Override
    public String deleteWidgetByName(String name) {
        if(widgetRepository.findByName(name) == null){
            return "Widget can not found";
        } else {
            widgetRepository.deleteByName(name);
            return "Widget deleted successfully";
        }
    }
}
