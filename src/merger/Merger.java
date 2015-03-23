/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package merger;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author yousufkhan
 */
public class Merger {
    
    public static File file =new File("corpus/data.txt");
    
    public static void merger(ArrayList<String> wholeFile){
        for(int i =0;i<wholeFile.size();i++){
            String replace=wholeFile.get(i).replaceAll("[A-Za-z0-9:]", "");
            replace.trim();
            if(replace.startsWith(" ")){
                continue;
            }
            System.out.println("word number : "+ i);
            replace = replace+"\n";
            WriteData.write(replace,file);
            
        }
    }

}
