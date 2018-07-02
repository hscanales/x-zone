/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author pretc
 */
public interface Item {
    void use();
    int get();
    boolean isHealing();
    boolean isKey();
    boolean itsATrap();
}
