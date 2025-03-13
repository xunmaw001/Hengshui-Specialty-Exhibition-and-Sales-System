package com.entity.view;

import com.entity.TechanshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特产商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 18:12:48
 */
@TableName("techanshangpin")
public class TechanshangpinView  extends TechanshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TechanshangpinView(){
	}
 
 	public TechanshangpinView(TechanshangpinEntity techanshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, techanshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
