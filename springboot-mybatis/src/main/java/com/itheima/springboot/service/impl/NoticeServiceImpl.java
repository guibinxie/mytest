package com.itheima.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springboot.domain.Notice;
import com.itheima.springboot.mapper.NoticeMapper;
import com.itheima.springboot.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;
	/**查询所有公告*/
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}
	/**查询总记录数*/
	@Override
	public Long count() {
		
		return noticeMapper.count();
	}
	/**分页查询所有公告*/
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Map<String,Object> map = new HashMap<>();
		List<Notice> list = noticeMapper.findByPage(page, rows);
		Long totals = noticeMapper.count();
		map.put("total", totals);
		map.put("rows", list);
		return map;
	}

}
