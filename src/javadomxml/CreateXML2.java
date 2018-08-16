/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadomxml;

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

/**
 *
 * @author i.an
 */
public class CreateXML2 {

    public static void main(String argv[]) {

        try {
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("users");
            doc.appendChild(rootElement);

            // user element
            Element user = doc.createElement("user");
            rootElement.appendChild(user);

            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            user.setAttributeNode(attr);

            Element role = doc.createElement("role");
            role.appendChild(doc.createTextNode("admin"));
            user.appendChild(role);

            Element username = doc.createElement("username");
            username.appendChild(doc.createTextNode("gigi"));
            user.appendChild(username);

            Element password = doc.createElement("password");
            password.appendChild(doc.createTextNode("parola123"));
            user.appendChild(password);

            // user element2            
            Element user2 = doc.createElement("user2");
            rootElement.appendChild(user2);

            Attr attr2 = doc.createAttribute("id");
            attr2.setValue("2");
            user2.setAttributeNode(attr2);

            Element role2 = doc.createElement("role");
            role2.appendChild(doc.createTextNode("user"));
            user2.appendChild(role2);

            Element username2 = doc.createElement("username");
            username2.appendChild(doc.createTextNode("pantalone"));
            user2.appendChild(username2);

            Element password2 = doc.createElement("password");
            password2.appendChild(doc.createTextNode("word987"));
            user2.appendChild(password2);

            // user element2            
            Element user3 = doc.createElement("user3");
            rootElement.appendChild(user3);

            Attr attr3 = doc.createAttribute("id");
            attr3.setValue("3");
            user3.setAttributeNode(attr3);

            Element role3 = doc.createElement("role");
            role3.appendChild(doc.createTextNode("admin"));
            user3.appendChild(role3);

            Element username3 = doc.createElement("username");
            username3.appendChild(doc.createTextNode("flory9"));
            user3.appendChild(username3);

            Element password3 = doc.createElement("password");
            password3.appendChild(doc.createTextNode("123flor"));
            user3.appendChild(password3);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\users\\i.an\\desktop\\users2.xml"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (ParserConfigurationException | TransformerException pce) {
        }
    }
}
