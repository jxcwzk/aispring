package com.jxc.repository;

import com.jxc.entity.Menu;

import java.util.List;

public interface MenuRepository {
    public List<Menu> findAll();

    public int count();

    public Menu findById(long id);

    public void save(Menu menu);

    public void update(Menu menu);

    public void deleteById(long id);
}
