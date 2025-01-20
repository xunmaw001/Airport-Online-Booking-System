package com.dao;

import com.entity.DingpiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingpiaoxinxiVO;
import com.entity.view.DingpiaoxinxiView;


/**
 * 订票信息
 * 
 * @author 
 * @email 
 * @date 2022-04-20 01:19:33
 */
public interface DingpiaoxinxiDao extends BaseMapper<DingpiaoxinxiEntity> {
	
	List<DingpiaoxinxiVO> selectListVO(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
	
	DingpiaoxinxiVO selectVO(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
	
	List<DingpiaoxinxiView> selectListView(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);

	List<DingpiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
	
	DingpiaoxinxiView selectView(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
}
