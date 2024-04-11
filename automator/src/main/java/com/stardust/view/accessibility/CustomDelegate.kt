package com.stardust.view.accessibility

import android.accessibilityservice.AccessibilityService
import android.os.Build
import android.view.accessibility.AccessibilityEvent

class CustomDelegate : AccessibilityDelegate {
    override val eventTypes: Set<Int>?
        get() = AccessibilityDelegate.ALL_EVENT_TYPES

    val listenerList: ArrayList<CustomDelegateListener> = ArrayList()
    override fun onAccessibilityEvent(service: AccessibilityService, event: AccessibilityEvent): Boolean {
        for(listener in listenerList){
            listener.onAccessibilityEvent(service, event);
        }
        return false
    }
    fun addListener(listener: CustomDelegateListener){
        listenerList.add(listener);
    }
}