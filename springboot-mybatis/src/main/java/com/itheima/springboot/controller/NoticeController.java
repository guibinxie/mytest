package com.itheima.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springboot.domain.Notice;
import com.itheima.springboot.service.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	/**查询所有公告*/
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	/**分页查询通告*/
	@GetMapping("/findByPage")
	@ResponseBody
	public Map<String,Object> findByPage(@RequestParam(value="page",defaultValue="1",required=true)Integer page,@RequestParam(value="rows",defaultValue="15",required=true)Integer rows){
		Map<String, Object> map = noticeService.findByPage((page-1)*rows, rows);
		return map;
	}
}
