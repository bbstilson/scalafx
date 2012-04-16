/*
 * Copyright (c) 2012, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package scalafx.util.converter

import javafx.util.{ converter => jfxuc }
import scalafx.Includes._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * ByteStringConverter Spec tests.
 *
 *
 */
@RunWith(classOf[JUnitRunner])
class ByteStringConverterSpec
  extends AbstractStringConverterDelegateSpec[java.lang.Byte, jfxuc.ByteStringConverter, Byte, ByteStringConverter](classOf[jfxuc.ByteStringConverter], classOf[ByteStringConverter], classOf[Byte]) {

  override val examples = List((0.toByte, "0"), (12.toByte, "12"), (-12.toByte, "-12"),
    (Byte.MaxValue, Byte.MaxValue.toString), (Byte.MinValue, Byte.MinValue.toString))

  protected def getScalaClassInstance = new ByteStringConverter

  protected def convertScalaClassToJavaClass(sfxControl: ByteStringConverter) = {
    val jfxByteStringConverter: jfxuc.ByteStringConverter = sfxControl
    jfxByteStringConverter
  }

  protected def convertJavaClassToScalaClass(jfxControl: jfxuc.ByteStringConverter) = {
    val sfxByteStringConverter: ByteStringConverter = jfxControl
    sfxByteStringConverter
  }

}