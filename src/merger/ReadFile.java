/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package merger;

import com.sun.org.apache.xpath.internal.functions.Function;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author yousufkhan
 */
public class ReadFile {
    public static void read(String path){
        String line=new String();
        ArrayList<String> wholefile=new ArrayList<String>();
        try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                wholefile.clear();
                while((line=br.readLine())!=null){
                    wholefile.add(line);
                }
                
            
            }
        catch(IOException Ex){
            System.out.println("Exception");
        }
        
        Merger.merger(wholefile);
    }
    
}
