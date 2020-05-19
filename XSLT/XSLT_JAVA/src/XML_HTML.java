

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;


import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


public class XML_HTML {

	public static void main(String[] args) {
		
		
		Source xml = new StreamSource(new File("C:\\Users\\Mamello Mitane\\Desktop\\XML_Basics\\XSLT\\Employees.xml"));
		
		Source xslt = new StreamSource("C:\\Users\\Mamello Mitane\\Desktop\\XML_Basics\\XSLT\\Employee_Import.xsl");
		
		convertXML_HTML(xml,xslt);
		
		

	}
	
	public static void convertXML_HTML(Source xml, Source xslt) {
		
		
		StringWriter sw = new StringWriter();
		
		
		try {
			
			
			FileWriter fw = new FileWriter("C:\\Users\\Mamello Mitane\\Desktop\\XML_Basics\\XSLT\\Employee.html");
			
			TransformerFactory tf = TransformerFactory.newInstance();
			
			Transformer t = tf.newTransformer(xslt);
			
			t.transform(xml, new StreamResult(sw));
			
			fw.write(sw.toString());
			
			fw.close();
			
			
			System.out.println("Employee.html has been successfully generated at  C:\\XSLT ");
		}
		
		catch(IOException | TransformerConfigurationException e) {
			
			e.printStackTrace();
		}
		
		catch(TransformerFactoryConfigurationError e) {
			
			e.printStackTrace();
		}
		
		catch(TransformerException e) {
			
			e.printStackTrace();
		}
	}

}
