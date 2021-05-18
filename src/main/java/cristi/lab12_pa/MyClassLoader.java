/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristi.lab12_pa;

import java.net.URL;
import java.net.URLClassLoader;

/**
 *
 * @author crist
 */
public class MyClassLoader extends URLClassLoader{
    public MyClassLoader() {
        super(new URL[0], ClassLoader.getSystemClassLoader());
    }
    @Override
    public void addURL(URL url) {
        super.addURL(url);
    }

}
