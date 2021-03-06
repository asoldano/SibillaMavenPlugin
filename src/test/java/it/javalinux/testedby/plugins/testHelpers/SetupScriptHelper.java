/*
 * Stefano Maestri, javalinuxlabs.org Copyright 2008, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package it.javalinux.testedby.plugins.testHelpers;

import java.io.File;
import java.util.Map;

/**
 * Common interface for the beanshell setup script used by the Maven Invoker Plugin (see test-embedded)
 * 
 * @author alessio.soldano@javalinux.it
 * @since 13-Dec-2009
 *
 */
public interface SetupScriptHelper {
    
    /**
     * Perform the custom setup using the global variables defined by the Invoker Plugin
     * 
     * @param basedir
     * @param localRepositoryPath
     * @param context
     * @throws Exception
     */
    public void setup(File basedir, File localRepositoryPath, Map<?,?> context) throws Exception;

}
