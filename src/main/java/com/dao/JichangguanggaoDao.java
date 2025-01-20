package com.dao;

import com.entity.JichangguanggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JichangguanggaoVO;
import com.entity.view.JichangguanggaoView;


/**
 * 机场广告
 * 
 * @author 
 * @email 
 * @date 2022-04-20 01:19:33
 */
public interface JichangguanggaoDao extends BaseMapper<JichangguanggaoEntity> {
	
	List<JichangguanggaoVO> selectListVO(@Param("ew") Wrapper<JichangguanggaoEntity> wrapper);
	
	JichangguanggaoVO selectVO(@Param("ew") Wrapper<JichangguanggaoEntity> wrapper);
	
	List<JichangguanggaoView> selectListView(@Param("ew") Wrapper<JichangguanggaoEntity> wrapper);

	List<JichangguanggaoView> selectListView(Pagination page,@Param("ew") Wrapper<JichangguanggaoEntity> wrapper);
	
	JichangguanggaoView selectView(@Param("ew") Wrapper<JichangguanggaoEntity> wrapper);
	

}
