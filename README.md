# Android-with-Opencv
Camera display with opencv in android

### Intergration Opencv with Android

1) Download opencv sdk for android. <a href="https://sourceforge.net/projects/opencvlibrary/files/opencv-android/ in zip file">Click here</a> <br>
2) Create android project. <br>
3) Unzipped sdk file. <br>
4) Copy path <b>"..\opencv-3.4.3-android-sdk\OpenCV-android-sdk\sdk\java "</b>.
5) Import opencv module in android project <b>"File menu -> New -> Import module -> Paste path -> Next and Finish. </b>
6) Possibly you might get error.To solve, <br>
Open AndroidManifest.xml file which is located in Openv folder and <br>
Delete this line <b> < "uses-sdk android:minSdkVersion = '...' android:targetSdkVersion = '...'  "> </b> <br>

7) Create folder in <b>"project -> app -> src -> main"</b>. You have to give name of folder <b>"jniLibs"</b>.
8) Copy all file in libs folder which is stored in <b>"..\opencv-3.4.3-android-sdk\OpenCV-android-sdk\sdk\native\libs".</b> <br>
Or <br>
Instead of steps 7) and 8), you can download suitable <b> "opencv manager apk" </b> separately for your device.
