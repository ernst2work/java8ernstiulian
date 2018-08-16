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
public class ReadAndEditXML {

    /**
     * @param args the command line arguments
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws javax.xml.transform.TransformerConfigurationException
     *
     * this class allows reaing in console elements of a pre-defined xml file
     * that stores the users with their attributed it also allows delete users
     * and edit their details in console
     *
     * !! it works with a specific [CreateXML] xml file only!!
     * @throws org.xml.sax.SAXException
     */
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, TransformerException, SAXException {

        try {
            String filepath = "C:\\users\\i.an\\desktop\\users.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);  //this is the document created from the xml file

            Node users = doc.getChildNodes().item(0);
            NodeList userz = users.getChildNodes();
            System.out.println("The number of users registred is: " + userz.getLength());

            for (int i = 0; i < userz.getLength(); i++) {

                System.out.println("This is the user no.: " + (i + 1));

                System.out.println(userz.item(i).getAttributes().getNamedItem("role"));
                System.out.println(userz.item(i).getAttributes().getNamedItem("username"));
                System.out.println(userz.item(i).getAttributes().getNamedItem("password"));
            }

            System.out.println("do you want to edit/remove role, username or password or any of the users? [yes/no]:");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();

            if ("yes".equals(answer)) {

                System.out.println("what is the id number of the user you want to edit/remove? [integer please!]");
                int answer2 = sc.nextInt();

                System.out.println("you want to remove it? [yes/no]");
                String answer3 = sc.next();

                if ("yes".equals(answer3)) {
                    users.removeChild(userz.item(answer2 - 1));
                } else {

                    System.out.println("you want to edit it? [yes/no]");
                    String answer4 = sc.next();

                    if ("yes".equals(answer4)) {
                        System.out.println("what should be the new role [admin/user]");
                        String newRole = sc.next();
                        System.out.println("what should be the new username []");
                        String newUsername = sc.next();
                        System.out.println("what should be the new password []");
                        String newPassword = sc.next();

                        int e = answer2 - 1; //save time edit

                        userz.item(e).getAttributes().getNamedItem("role").setNodeValue(newRole);
                        userz.item(e).getAttributes().getNamedItem("username").setNodeValue(newUsername);
                        userz.item(e).getAttributes().getNamedItem("password").setNodeValue(newPassword);

                    } else {
                        System.out.println("it means you want to remove it, and i just did it for you");
                        users.removeChild(userz.item(answer2 - 1));
                    }
                }

                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("C:\\users\\i.an\\desktop\\users.xml"));
                transformer.transform(source, result);
            }
        } catch (SAXException | IOException ex) {
            Logger.getLogger(ReadAndEditXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
