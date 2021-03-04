package com.wheel_picker

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import java.util.*

class WheelPickerPackage : ReactPackage {
	override fun createNativeModules(
			reactContext: ReactApplicationContext): List<NativeModule> {
		return ArrayList()
	}
	
	override fun createViewManagers(
			reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
		return Arrays.asList<ViewManager<*, *>>(
				WheelPickerManager()
		)
	}
}
