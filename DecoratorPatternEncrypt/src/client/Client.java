package client;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import cipher.AdvancedCipher;
import cipher.Cipher;
import cipher.ComplexCipher;
import cipher.SimpleCipher;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("mingwen.txt")));      
		String password=null;    //明文  
		File file=new File("miwen.txt");   
	    if(!file.exists())   
	    {   
	        try {   
	            file.createNewFile();   
	        } catch (IOException e) {   
	            // TODO Auto-generated catch block   
	            e.printStackTrace();   
	        }   
	    }    
		FileWriter fw = new FileWriter(file.getName(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		while((password = br.readLine())!=null ){
			String cpassword;       //密文
			Cipher sc,ac,cc;	
			sc=new SimpleCipher();
			cpassword=sc.encrypt(password);
			System.out.println(cpassword);
			bw.write(cpassword);
			cc=new ComplexCipher(sc);
			cpassword=cc.encrypt(password);
		    System.out.println(cpassword);
			bw.write(cpassword);
			ac=new AdvancedCipher(cc);
			cpassword=ac.encrypt(password);
		    System.out.println(cpassword);
			bw.write(cpassword);
		}
		
		bw.close();
		
	}

}
