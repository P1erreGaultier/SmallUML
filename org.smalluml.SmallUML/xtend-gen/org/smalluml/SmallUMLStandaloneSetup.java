/**
 * generated by Xtext 2.10.0
 */
package org.smalluml;

import org.smalluml.SmallUMLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SmallUMLStandaloneSetup extends SmallUMLStandaloneSetupGenerated {
  public static void doSetup() {
    SmallUMLStandaloneSetup _smallUMLStandaloneSetup = new SmallUMLStandaloneSetup();
    _smallUMLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
