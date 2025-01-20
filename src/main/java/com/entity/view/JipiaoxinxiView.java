package com.entity.view;

import com.entity.JipiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 机票信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 01:19:32
 */
@TableName("jipiaoxinxi")
public class JipiaoxinxiView  extends JipiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JipiaoxinxiView(){
	}
 
 	public JipiaoxinxiView(JipiaoxinxiEntity jipiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jipiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
