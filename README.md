Cam3HiddenAPIs
==============

Sample Android Apps Using Camera 3 Hidden APIs from KitKat (Android v 4.4)

This project uses reflection to determine if the hidden Camera 3 APIs are available or not on the device.

To setup the Development Environment to actually use the hidden APIs:

Connect KitKat Device or start KitKat AVD
adb pull /system/framework/core.jar .
adb pull /system/framework/framework.jar .
Convert from Dex to Jar using tool such as dex2jar
dex2jar core.jar
dex2jar framework.jar
In Eclipse, Project → Properties → Java Build Path → Libraries → Add External JARs... → core-dex2jar.jar & framework-dex2jar.jar 

Source : http://stackoverflow.com/questions/7888191/how-do-i-build-the-android-sdk-with-hidden-and-internal-apis-available


