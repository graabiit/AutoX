package com.stardust.view.accessibility

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

interface CustomDelegateListener {

    fun onAccessibilityEvent(service: AccessibilityService, event: AccessibilityEvent): Boolean

}