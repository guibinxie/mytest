package com.itheima.springboot.service;

import java.util.List;
import java.util.Map;
import com.itheima.springboot.domain.Notice;

public interface NoticeService {
	/**查询所有公告*/
	List<Notice> findAll();
	
	/**统计查询*/
	Long count();
	
	/**分页查询所有公告*/
	Map<String,Object> findByPage(Integer page,Integer rows);

}
