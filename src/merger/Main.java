/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package merger;

/**
 *
 * @author yousufkhan
 */
public class Main {
    public static String foldername ="sports";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path ="wordset/"+foldername+"/words.txt";
        ReadFile.read(path);
    }
    
}
