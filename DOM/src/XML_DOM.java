import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML_DOM {

	public static void main(String[] args) {
		
		try {
			
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document d = db.newDocument();
			
			Element re = d.createElement("class");//This is the root element
			d.appendChild(re);
			
			Element student = d.createElement("student");//This is the student element
			re.appendChild(student);
			
			Attr a = d.createAttribute("id");//This setting the attribute to the element
			a.setValue("001");
			student.setAttributeNode(a);
			
			Element name = d.createElement("name");
			name.appendChild(d.createTextNode("Mamello Mitane"));
			student.appendChild(name);
			
			
			Element age = d.createElement("age");
			age.appendChild(d.createTextNode("20"));
			student.appendChild(age);
						
			Element telephone = d.createElement("telephone");
			telephone.appendChild(d.createTextNode("0845692341"));
			student.appendChild(telephone);
			
			
			TransformerFactory tf = TransformerFactory.newInstance();//Writing content into a XML file
			Transformer t = tf.newTransformer();
			DOMSource s = new DOMSource(d);
			StreamResult sr = new StreamResult(new File("C:\\Users\\Mamello Mitane\\Desktop\\XML_Basics\\DOM\\Students.xml"));
			t.transform(s, sr);
			
			StreamResult cr = new StreamResult(System.out);//Displaying output to console for testing
			t.transform(s,cr);
			
			System.out.println("File saved!");
			
		}
		
			catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		}
		
			catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
}
	}


