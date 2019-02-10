/**
 * 
 */
package org.joe;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author josephgonzalez
 *
 */
public class ClassToBeTested3Test {
  ClassToBeTested3 testClass = new ClassToBeTested3();


  @Test
  public void test2() {
    testClass.getSomething2(5);
    testClass.getSomething2(15);
  }
  @Test
  public void test3() {
    testClass.getSomething3(5);
  }

}
