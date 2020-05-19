import java.io.File;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class XML_SAX {
	
	
	public static void main(String[] args) {
		
		try {
			
			File inputFile = new File("Student_SAX.xml");
			SAXParserFactory f = SAXParserFactory.newInstance();
			SAXParser sp = f.newSAXParser();
			UserHandler u = new UserHandler();
			sp.parse(inputFile,u);
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		

	}

}


  class UserHandler extends DefaultHandler {
	
	
		boolean fn = false;
		boolean ln = false;
		boolean m = false;

		
		public void startElement(String uri, String localname,String qname,Attributes attributes) throws SAXException{//Calling the beginning of an element
			
			if(qname.equalsIgnoreCase("student")) {
				
				String id = attributes.getValue("id");
				System.out.println("ID: " + id);
			}
			
			else if (qname.equalsIgnoreCase("firstname")) {
				
				fn = true;
				
			}
			
			else if (qname.equalsIgnoreCase("lastname")) {
				
				
				
				ln = true;
				
			}
			
			else if (qname.equalsIgnoreCase("marks")) {
				
				
				m = true;
				
			}
					
		}

		
		public void endElement(String uri, String localname,String qname,Attributes attributes) {//Calling the end of a element
			
			if(qname.equalsIgnoreCase("student")) {
				System.out.println("End element: " + qname);
			}
		}
		
  
		
	public void characters(char ch[], int start, int length )throws SAXException{
			
			
			 if(ln) {
				
				System.out.println("Last name: " + new String(ch,start,length));
				
				ln = false;
			}
			
			else if(m) {
				
				System.out.println("Marks: " + new String(ch,start,length));
				
				m = false;
			}
			
		}
	
}

