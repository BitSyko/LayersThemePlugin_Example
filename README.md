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
  Layers_OverlayNames = Names of the apps you include Overlays for.<br />
  BE AWARE: 
  If you use...
    * Only "normal" Overlays: App1,App2,App3,...**, ,** (You have to add a comma, space, comma at the end)
    * Only color specific Overlays: **, ,**App1,App2,App3,...,App10000 (You have to add a comma, space, comma at the beginning)
    * both normal and color specific Overlays: App1,App2,App3,App4**, ,**App5,App6,App7 ( You have to add a comma, space, comma between the last normal and the first color specific Overlay, like in the screenshot)
