package com.arbonkeep.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable,Cloneable {
	public String name;
	public DeepClone01 dp01;
	
	public DeepProtoType() {
		super();
	}
	
	//通过重写clone方法实现深拷贝
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		//1.首先，对基本数据类型String属性进行clone，使用默认的clone即可
		obj = super.clone();
		
		//2.对引用类型属性进行处理
		DeepProtoType dpt = (DeepProtoType)obj;//因为前面已经处理了String类型，所以我们将前面的obj进行向下强转
		dpt.dp01 = (DeepClone01)dp01.clone();//设置它的引用类型dp01,直接克隆一个属性赋值给该引用类型
	
		return dpt;
		//注意：这种方式完成深拷贝如果有多个引用类型就需要修改多次
	}
	
	
	//使用方式2完成深拷贝（序列化）
	public Object deepClone() {
		//1.声明需要用到的流对象
		ByteArrayOutputStream baos = null;
		ByteArrayInputStream bais = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			//序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(this);//将当前对象以流的形式输出
			
			//反序列化
			bais = new ByteArrayInputStream(baos.toByteArray());
			ois = new ObjectInputStream(bais);
			DeepProtoType copy = (DeepProtoType)ois.readObject();
			
			return copy;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			try {
				baos.close();
				oos.close();
				bais.close();
				ois.close();
			}catch (Exception ex){
				System.out.println(ex.getMessage());
			}
		}
	}
}
