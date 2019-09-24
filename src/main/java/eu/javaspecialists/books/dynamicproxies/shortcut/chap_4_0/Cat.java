/*
 * Copyright (c) 2014. Heinz Max Kabutz , Sven Ruppert
 *   We licenses
 *   this file to you under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License. You may
 *   obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package eu.javaspecialists.books.dynamicproxies.shortcut.chap_4_0;

/**
 * Created by Sven Ruppert on 04.01.14.
 */
public class Cat {
  private final String species;

  public Cat(String species) {
    this.species = species;
  }

  public String toString() {
    return species;
  }

  public void meow() {
    System.out.println(this + ": Meow");
  }

  public static interface Collection extends java.util.Collection {
    Iterator catIterator();
  }

  public static interface Iterator extends java.util.Iterator {
    Cat nextCat();
  }
}
