package com.android;

import com.ios.IphoneHeadset;

// The Adapter class makes IphoneHeadset compatible with AndroidHeadset
public class HeadsetAdapter implements AndroidHeadset {

    // Creating an instance of IphoneHeadset (the Adaptee)
    IphoneHeadset ihs = new IphoneHeadset();

    // Overriding the method from the AndroidHeadset interface
    @Override
    public void giveSound(String str) {
        // The Adapter delegates the call to the Adaptee's method
        // This converts the AndroidHeadset method to the iPhoneHeadset method
        ihs.giveQualitySound(str);
    }
}
