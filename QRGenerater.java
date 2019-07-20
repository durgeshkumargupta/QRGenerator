/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrgenerater;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author Durgesh
 */
public class QRGenerater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String details="Hello gyes What are you doing";
        ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
        File f=new File("F:\\computer software\\Java compiler\\qbar code jar\\first.jpg");
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
        
        
    }
    
}
