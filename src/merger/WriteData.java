/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package merger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author yousufkhan
 */
public class WriteData {
    
    public static void write(String data,File file){
        try{
                    //if file doesnt exists, then create it
                    if(!file.exists()){
                            file.createNewFile();
                    }

    		//true = append file
                    FileWriter fileWritter = new FileWriter(file.getAbsoluteFile(),true);
                    try (BufferedWriter bufferWritter = new BufferedWriter(fileWritter)) {
                        bufferWritter.write(data);
                        bufferWritter.close();
                    }
 
	        
 
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
    
}
