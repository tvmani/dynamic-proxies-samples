/*
 * Copyright (C) 2000-2019 Heinz Max Kabutz
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.  Heinz Max Kabutz
 * licenses this file to you under the Apache License, Version
 * 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.  See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */

package eu.javaspecialists.books.dynamicproxies.ch06.appendables;

import eu.javaspecialists.books.dynamicproxies.*;
import org.junit.*;

import java.io.*;

public class AppendableDynamicTest extends AppendableTest {
  @Test
  public void dynamicComposite() throws IOException {
    var tee = Proxies.compose(AppendableCloseableFlushable.class,
        AppendableCloseableFlushable.getReducers(),
        Appendable.class, Closeable.class, Flushable.class);
    var sw1 = new StringWriter();
    var sw2 = new StringWriter();
    var sw3 = new StringWriter();
    tee.add(sw1);
    tee.add(sw2);
    tee.add(sw3);

    test(tee, sw1, sw2, sw3);
  }
}