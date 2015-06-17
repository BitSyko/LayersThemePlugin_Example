# Layers Theme PluginExample
##How to use
###Download & load
download the sample app from https://github.com/Sh4dowSoul/LayersThemePlugin_Example/releases
open Android Studio, click on File, import project. Select the downloaded project

###Changes to Manifest
* inside the project navigate to the AndroidManifest.xml
* at the top part of the Manifest you have to change the following things:
![alt tag](https://cloud.githubusercontent.com/assets/10466533/8212392/b9588420-151b-11e5-9243-baf2078fe936.png)  
  change the marked part in android:sharedUserId to you theme name. (example: exampleUI)                                        
  change the marked part in android:lable the disired app Name (shown in android in the settings app  (example: Example UI)

* at the bottom you have to add some basic information about your theme
![alt tag](https://cloud.githubusercontent.com/assets/10466533/8212581/b70deb8c-151c-11e5-86a2-5c7f590dea34.png)  
  Layers_Name = the name of your theme (it can contain spaces)<br />
  Layers_Developer = you name <br />
  Layers_Colors = if you include some overlays which are available in different colors, add the colors here.<br />
  Layers_Description = Short description about your theme<br />
  Layers_WhatsNew = Whats new in your themes latest update. <br />
  Layers_OverlayNames = Names of the apps you include Overlays for.<br />
  BE AWARE: 
  If you use...
    * Only "normal" Overlays: ![alt tag](https://cloud.githubusercontent.com/assets/10466533/8213187/7a61c664-1520-11e5-9ffd-d280c5a3e5c0.png) "App,App, "
    * Only color specific Overlays: ![alt tag](https://cloud.githubusercontent.com/assets/10466533/8213299/3f6436fe-1521-11e5-8525-db2ce70b7bca.png)  " ,App,App"
    * both normal and color specific Overlays: ![alt tag](https://cloud.githubusercontent.com/assets/10466533/8213060/a278f600-151f-11e5-85e9-faa1a5cb14be.png)  "App,App, ,App,App"

###Change Package Name
Look at the project panel in android studio (the one on the left). In the top right corner you will see a little gear icon. Click on it. You will see the following:
![alt tag](https://cloud.githubusercontent.com/assets/10466533/8213507/9009e616-1522-11e5-8fe1-2465c3365b2e.png) <br />
<br />
In this dialog you have to click on **Compact Empty Middle Packages** <br />
Select the schnettler folder (in JAVA/com/ and rightclick it.  Choose refactor and then rename.<br />
A warning window will pop up. Just click on Rename package.<br />
Enter the desired first part of your package name and click refactor.<br />
At the bottom of the screen a refactoring preview will appear. Just click on DO REFACTOR at the left corner.<br />
<br />
Do the same with the exampleUi folder, name it like your desired second part of the packagename <br />
<br />
Finally open the build.gradle and change the package name there too.

###Changes to the ressources


  
  
