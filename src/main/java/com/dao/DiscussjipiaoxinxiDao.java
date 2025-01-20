package com.dao;

import com.entity.DiscussjipiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjipiaoxinxiVO;
import com.entity.view.DiscussjipiaoxinxiView;


/**
 * 机票信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-20 01:19:33
 */
public interface DiscussjipiaoxinxiDao extends BaseMapper<DiscussjipiaoxinxiEntity> {
	
	List<DiscussjipiaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjipiaoxinxiEntity> wrapper);
	
	DiscussjipiaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussjipiaoxinxiEntity> wrapper);
	
	List<DiscussjipiaoxinxiView> selectListView(@Param("ew") Wrapper<DiscussjipiaoxinxiEntity> wrapper);

	List<DiscussjipiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjipiaoxinxiEntity> wrapper);
	
	DiscussjipiaoxinxiView selectView(@Param("ew") Wrapper<DiscussjipiaoxinxiEntity> wrapper);
	

}
