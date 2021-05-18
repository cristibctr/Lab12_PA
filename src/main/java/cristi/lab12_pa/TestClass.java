/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cristi.lab12_pa;
import java.lang.annotation.*;
/**
 *
 * @author crist
 */
public class TestClass {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Test { }
}
