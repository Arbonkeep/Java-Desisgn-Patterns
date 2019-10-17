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
	
	//ͨ����дclone����ʵ�����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		//1.���ȣ��Ի�����������String���Խ���clone��ʹ��Ĭ�ϵ�clone����
		obj = super.clone();
		
		//2.�������������Խ��д���
		DeepProtoType dpt = (DeepProtoType)obj;//��Ϊǰ���Ѿ�������String���ͣ��������ǽ�ǰ���obj��������ǿת
		dpt.dp01 = (DeepClone01)dp01.clone();//����������������dp01,ֱ�ӿ�¡һ�����Ը�ֵ������������
	
		return dpt;
		//ע�⣺���ַ�ʽ����������ж���������;���Ҫ�޸Ķ��
	}
	
	
	//ʹ�÷�ʽ2�����������л���
	public Object deepClone() {
		//1.������Ҫ�õ���������
		ByteArrayOutputStream baos = null;
		ByteArrayInputStream bais = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			//���л�
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(this);//����ǰ������������ʽ���
			
			//�����л�
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
