package com.e3mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mall.pojo.TbItem;
import com.e3mall.pojo.TbItemMapper;

@Service
public class ItemServiceImpl implements ItemService {
@Autowired
private TbItemMapper itemMapper;

@Override
public TbItem getItemById(long id) {
	// TODO Auto-generated method stub
	return itemMapper.selectByPrimaryKey(id);
}



}
