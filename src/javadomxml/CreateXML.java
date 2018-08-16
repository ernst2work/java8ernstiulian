/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadomxml;

/**
 *
 * @author i.an
 */
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.DOMException;

public class CreateXML {

   public static void main(String argv[]) {

      try {
         DocumentBuilderFactory dbFactory =
         DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.newDocument();
         
         // root element
         Element rootElement = doc.createElement("users");
         doc.appendChild(rootElement);

         // user1 element
         Element user1 = doc.createElement("user1");
         rootElement.appendChild(user1);

         // setting attributes to user1
         Attr attr11 = doc.createAttribute("username");
         attr11.setValue("admin1");
         user1.setAttributeNode(attr11);
         Attr attr12 = doc.createAttribute("password");
         attr12.setValue("pwd123admin");
         user1.setAttributeNode(attr12);
         Attr attr13 = doc.createAttribute("role");
         attr13.setValue("admin");
         user1.setAttributeNode(attr13);
         
                  // user2 element
         Element user2 = doc.createElement("user2");
         rootElement.appendChild(user2);

         // setting attributes to user2
         Attr attr21 = doc.createAttribute("username");
         attr21.setValue("client5");
         user2.setAttributeNode(attr21);
         Attr attr22 = doc.createAttribute("password");
         attr22.setValue("pwd12client");
         user2.setAttributeNode(attr22);
         Attr attr23 = doc.createAttribute("role");
         attr23.setValue("user");
         user2.setAttributeNode(attr23);

         
         Element user3 = doc.createElement("user3");
         rootElement.appendChild(user3);

         // setting attributes to user3
         Attr attr31 = doc.createAttribute("username");
         attr31.setValue("client7");
         user3.setAttributeNode(attr31);
         Attr attr32 = doc.createAttribute("password");
         attr32.setValue("pwd24client");
         user3.setAttributeNode(attr32);
         Attr attr33 = doc.createAttribute("role");
         attr33.setValue("user");
         user3.setAttributeNode(attr33);         

         // write the content into xml file
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(new File("C:\\users\\i.an\\desktop\\users.xml"));
         transformer.transform(source, result);
         

      } catch (ParserConfigurationException | TransformerException | DOMException e) {
      }
   }
}