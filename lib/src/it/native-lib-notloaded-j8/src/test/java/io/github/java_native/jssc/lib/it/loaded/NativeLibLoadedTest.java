/*
 * jSSC (Java Simple Serial Connector) - serial port communication library.
 *
 * This file is part of jSSC.
 *
 * jSSC is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jSSC is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with jSSC.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.java_native.jssc.lib.it.loaded;

import io.github.java_native.jssc.header.SerialNativeInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NativeLibLoadedTest {

    @Test
    public void testLibLoaded() {
        final SerialNativeInterface serialNativeInterface = new SerialNativeInterface();
        final String[] serialPortNames = serialNativeInterface.getSerialPortNames();

        Assertions.assertTrue(serialPortNames.length > 0);
    }
}
