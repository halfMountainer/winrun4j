/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package org.boris.winrun4j.test;

import org.boris.winrun4j.Advapi32;

public class Services
{
    public static void main(String[] args) throws Exception {
        long handle = Advapi32.OpenSCManager(null, null, Advapi32.SC_MANAGER_ALL_ACCESS);

    }

}
