package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class myTagHandler extends TagSupport {


	int number;


	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		
		JspWriter out=pageContext.getOut();
		try {
			out.println("hwelllo you are us ing custom tags");
			
			out.println("<br><h1>now we will print the table </h1><br>");
			for(int i=1;i<=10;i++)
			{
				out.println(i*number);
				out.println("<br>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	
}
