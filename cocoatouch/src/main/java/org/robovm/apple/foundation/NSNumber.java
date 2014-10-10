/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSNumber/*</name>*/ 
    extends /*<extends>*/NSValue/*</extends>*/ 
    /*<implements>*/implements NSPropertyList/*</implements>*/ {

    /*<ptr>*/public static class NSNumberPtr extends Ptr<NSNumber, NSNumberPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSNumber.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSNumber(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "charValue")
    public native byte getCharValue();
    @Property(selector = "unsignedCharValue")
    public native byte getUnsignedCharValue();
    @Property(selector = "shortValue")
    public native short getShortValue();
    @Property(selector = "unsignedShortValue")
    public native short getUnsignedShortValue();
    @Property(selector = "intValue")
    public native int getIntValue();
    @Property(selector = "unsignedIntValue")
    public native int getUnsignedIntValue();
    @Property(selector = "longValue")
    public native @MachineSizedSInt long getLongValue();
    @Property(selector = "unsignedLongValue")
    public native @MachineSizedUInt long getUnsignedLongValue();
    @Property(selector = "longLongValue")
    public native long getLongLongValue();
    @Property(selector = "unsignedLongLongValue")
    public native long getUnsignedLongLongValue();
    @Property(selector = "floatValue")
    public native float getFloatValue();
    @Property(selector = "doubleValue")
    public native double getDoubleValue();
    @Property(selector = "boolValue")
    public native boolean isBoolValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "integerValue")
    public native @MachineSizedSInt long getIntegerValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "unsignedIntegerValue")
    public native @MachineSizedUInt long getUnsignedIntegerValue();
    @Property(selector = "stringValue")
    public native String getStringValue();
    @Property(selector = "decimalValue")
    public native @ByVal NSDecimal getDecimalValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "compare:")
    public native NSComparisonResult compare(NSNumber otherNumber);
    @Method(selector = "isEqualToNumber:")
    public native boolean isEqualTo(NSNumber number);
    @Method(selector = "descriptionWithLocale:")
    public native String toString(NSLocale locale);
    @Method(selector = "numberWithChar:")
    public static native NSNumber valueOf(byte value);
    @Method(selector = "numberWithShort:")
    public static native NSNumber valueOf(short value);
    @Method(selector = "numberWithUnsignedShort:")
    public static native NSNumber valueOf(char value);
    @Method(selector = "numberWithInt:")
    public static native NSNumber valueOf(int value);
    @Method(selector = "numberWithLongLong:")
    public static native NSNumber valueOf(long value);
    @Method(selector = "numberWithFloat:")
    public static native NSNumber valueOf(float value);
    @Method(selector = "numberWithDouble:")
    public static native NSNumber valueOf(double value);
    @Method(selector = "numberWithBool:")
    public static native NSNumber valueOf(boolean value);
    /*</methods>*/
}
