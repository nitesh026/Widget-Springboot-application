package com.widget.services;

import com.widget.model.Widget;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WidgetService {
    public Widget createWidget(Widget widget);
    public List<Widget> getAllWidgets();
    public Widget getWidgetByName(String name);
    public String updateWidgetDescription(String name,String description);
    public String deleteWidgetByName(String name);

}
