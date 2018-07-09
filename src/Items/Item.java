/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import java.net.URL;

/**
 *
 * @author pretc
 */
public interface Item {
    void use();
    URL get();
    boolean isHealing();
    boolean isKey();
    boolean itsATrap();
}
