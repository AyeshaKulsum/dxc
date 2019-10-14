package com.dxc.pms.customTags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Print  extends TagSupport {
private String name="Ayesha";
private String times="5";
	
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTimes() {
	return times;
}

public void setTimes(String times) {
	this.times = times;
}

	public int doStartTag() throws JspException
	{
		JspWriter out=pageContext.getOut();
		int noOfTimes =Integer.parseInt(times);
		try {
			for(int i=0;i<noOfTimes;i++)
			{
			out.println("<h1>"+name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
