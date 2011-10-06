/*
Copyright 2007-2009 WebDriver committers
Copyright 2007-2009 Google Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package org.openqa.selenium.firefox.internal;

import org.openqa.selenium.remote.internal.CircularOutputStream;

import java.io.OutputStream;

public class Streams {

  /**
   * Drains the contents of a stream without blocking on further input from that stream.
   * 
   * @param stream the stream to drain
   * @return the contents of the drained stream
   */
  public static String drainStream(OutputStream stream) {
    if (stream == null) {
      return null;
    }

    if (stream instanceof CircularOutputStream) {
      return stream.toString();
    }

    return null;
  }
}
