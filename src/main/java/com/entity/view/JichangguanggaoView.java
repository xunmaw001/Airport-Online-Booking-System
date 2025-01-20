package com.entity.view;

import com.entity.JichangguanggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 机场广告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 01:19:33
 */
@TableName("jichangguanggao")
public class JichangguanggaoView  extends JichangguanggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JichangguanggaoView(){
	}
 
 	public JichangguanggaoView(JichangguanggaoEntity jichangguanggaoEntity){
 	try {
			BeanUtils.copyProperties(this, jichangguanggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
