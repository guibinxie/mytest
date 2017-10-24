package com.itheima.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.itheima.springboot.domain.Notice;

@Mapper
public interface NoticeMapper {
	/**查询所有公告*/
	@Select("select * from notice")
	List<Notice> findAll();
	
	/**统计查询*/
	Long count();
	
	/**分页查询所有公告*/
	List<Notice> findByPage(@Param("page")Integer page,@Param("rows")Integer rows);
}
