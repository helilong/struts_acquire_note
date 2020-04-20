package com.valuestack.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
/***
 * ��ȡֵջ����
 * @author xiaohe
 *
 */

@Namespace("/")
@ParentPackage("struts-default")
@Result(name="show",location="/show.jsp")

public class StackAction extends ActionSupport{
	
	
	@Action("stack")
	public String show() {
		//1.��ȡActionContext�����
		 ActionContext context	= ActionContext.getContext();
		//2.���ڷ����õ�ֵջ����
		 ValueStack stack = context.getValueStack();
		 
		 
		 ValueStack stack2 = context.getValueStack();
		 //ÿ��ֵջ����ֻ��һ�� �������ַ�Ա�     true��
		 System.out.println(stack==stack2);
		 System.out.println("ִ�гɹ�");
		return "show";
	}
	


}
