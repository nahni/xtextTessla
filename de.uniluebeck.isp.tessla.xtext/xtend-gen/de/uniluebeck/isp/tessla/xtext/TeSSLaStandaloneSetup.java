/**
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.xtext;

import de.uniluebeck.isp.tessla.xtext.TeSSLaStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TeSSLaStandaloneSetup extends TeSSLaStandaloneSetupGenerated {
  public static void doSetup() {
    new TeSSLaStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}