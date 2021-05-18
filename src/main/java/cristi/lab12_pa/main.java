/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristi.lab12_pa;

import cristi.lab12_pa.TestClass.Test;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class main {
    static MyClassLoader loader;
    public static void main(String[] args) throws MalformedURLException{
        File path = new File("D:\\Facultate\\An2 Sem2\\PA\\Lab12_PA\\target\\classes\\cristi\\lab12_pa\\ClassFile.class");
        if(path.exists()) {
            URL url = path.toURI().toURL();
            loader.addURL(url);
        }
        
        try {
            Class clazz = Class.forName(loader.getURLs()[0].toString());
            Method[] methods = clazz.getMethods();
            for(Method method : methods){
                if(method.isAnnotationPresent(Test.class) && method.getParameterCount() == 0 && Modifier.isStatic(method.getModifiers())){
                    try {
                        method.invoke(null);
                    } catch (Throwable ex) {
                        System.out.printf("Test %s failed: %s %n", method, ex.getCause());
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
