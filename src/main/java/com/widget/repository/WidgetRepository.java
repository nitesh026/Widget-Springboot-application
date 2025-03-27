package com.widget.repository;

import com.widget.model.Widget;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WidgetRepository extends JpaRepository<Widget,String> {

    Widget findByName(String name);
    @Transactional
    Widget deleteByName(String name);
}
