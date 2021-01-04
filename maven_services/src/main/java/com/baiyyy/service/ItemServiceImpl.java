package com.baiyyy.service;

import com.baiyyy.dao.ItemMapper;
import com.baiyyy.pojo.Item;
import com.baiyyy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public Item findById(int id) {
        return itemMapper.findById(id);
    }
}
