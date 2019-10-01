package Bridge;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Bridge {
	public static Object getBean(String args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dFactory.newDocumentBuilder();
		Document doc;
		doc=dBuilder.parse(new File("XML/PenConfig.xml"));
		NodeList nl=null;
		Node classNode=null;
		String cName=null;
		nl=doc.getElementsByTagName("className");
		
		if(args.equals("color")) {
			classNode=nl.item(0).getFirstChild();
		}else if(args.equals("pen")){
			classNode=nl.item(1).getFirstChild();
		}
		
		cName=classNode.getNodeValue();
		Class c=Class.forName(cName);
		Object obj=c.newInstance();
		
		return obj;
	}
}
