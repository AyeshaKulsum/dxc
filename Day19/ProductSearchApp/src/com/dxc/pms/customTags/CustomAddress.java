package com.dxc.pms.customTags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomAddress extends TagSupport {

	public CustomAddress() {
		// TODO Auto-generated constructor stub
	}
public int doStartTag() throws JspException
{
	JspWriter out=pageContext.getOut();
	try {
		out.println("<h1>DXC Technology");
		out.println("DGS phase1<br/>");
		out.println("Hosur Roas<br/>");
		out.println("E.city<br/>");
		out.println("Banglore, karnataka-560100<br/>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return super.doStartTag();
}
}
