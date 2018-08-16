/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadomxml;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author i.an
 */
public class AddUsersXML {

    /**
     * @param args the command line arguments
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws javax.xml.transform.TransformerConfigurationException
     */
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, TransformerException {

        try {
            String filepath = "C:\\users\\i.an\\desktop\\users.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);  //this is the document created from the xml file

            String answer0 = "yes";
            while ("yes".equals(answer0)) {
                Scanner sc = new Scanner(System.in);

                Node users = doc.getChildNodes().item(0);
                NodeList userz = users.getChildNodes();
                System.out.println("The number of users registred is: " + userz.getLength());

                Node newUser = users.getFirstChild().cloneNode(true);
                users.appendChild(newUser);
                System.out.println("I have created a new user for you, please indicate its attributes");

                System.out.println("what should be the new role [admin/user]");
                String newRole = sc.next();
                System.out.println("what should be the new username []");
                String newUsername = sc.next();
                System.out.println("what should be the new password []");
                String newPassword = sc.next();

                newUser.getAttributes().getNamedItem("role").setNodeValue(newRole);
                newUser.getAttributes().getNamedItem("username").setNodeValue(newUsername);
                newUser.getAttributes().getNamedItem("password").setNodeValue(newPassword);
                System.out.println("Want another user added? [yes/no]");

                answer0 = sc.next();
            }

// write back the file after modification            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\users\\i.an\\desktop\\users.xml"));
            transformer.transform(source, result);

        } catch (SAXException | IOException ex) {
            Logger.getLogger(ReadAndEditXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
