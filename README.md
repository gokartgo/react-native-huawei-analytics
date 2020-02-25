# Huawei Analytics Android

not support in ios and windows because huawei is android phone

## Integrating
### Setup In Android React Native Project
1\. Add agconnect-services.json ( Path android/app )
-   download agconnect-services.json from 
    -   Login to AppGallery Connect and select My apps.
    -   Click Application is your want to use agconnect-services.json
    -   Go to Develop > Overview.
    -    Path of App information area, Click agconnect-services.json for download file

2\. Add the Maven repository address and AppGallery Connect service dependencies in the build.gradle file of your project ( Path: android/build.gradle )

    1. maven {url 'http://developer.huawei.com/repo/'}
    2. classpath 'com.huawei.agconnect:agcp:1.2.0.300'

![Image of Huawei Analytics](https://communityfile-drcn.op.hicloud.com/FileServer/getFile/cmtyPub/011/111/111/0000000000011111111.20200121095150.23546797182603463796350986560982:50510220023726:2800:6772F400C02F06290E4F636B0D2423596644E82A538FCEA0234E61C04D94C195.png?needInitFileName=true)


3\. Add the plug-in configuration and SDK version in the build.gradle file in the app directory ( Path: android/app/build.gradle)

    1. apply plugin: 'com.huawei.agconnect' ( must add after line apply plugin: "com.android.application" )
    2. implementation 'com.huawei.hms:hianalytics:4.0.1.300' ( if you use lib react-native-huawei-analytics this implement not to use)

![Image of Huawei Analytics](https://communityfile-drcn.op.hicloud.com/FileServer/getFile/cmtyPub/011/111/111/0000000000011111111.20200218104139.97534784310115353892094491197914:50510220023726:2800:035182D7957D4D057562AA28ECEF03CB893C758EB8BAB07051A1B70486B059DA.png?needInitFileName=true?needInitFileName=true)

### Add Library
1\. add lib react-native-huawei-analytics
-   yarn add react-native-huawei-analytics

the method is set same firebase analytics 

### Example
import HuaweiAnalytics from 'react-native-huawei-analytics'
HuaweiAnalytics.logEvent('name',{ key: value })
HuaweiAnalytics.setAnalyticsCollectionEnabled( boolean )
HuaweiAnalytics.setCurrentScreen('screenName','screenClassOverride')
HuaweiAnalytics.setUserId('userId')
HuaweiAnalytics.setUserProperty('name','value')
HuaweiAnalytics.setUserProperties({name: value}) ( work same setUserProperty but only type input is different )

##### ส่วนของ logEvent
- {key: value} จะต้องเข้าไป set ใน Analytics ด้วย
    -   Login ที่ AppGallery Connect แล้วเลือก Analytics
    -   Click เลือก App ที่เราต้องการ set key value
    -   ไปที่ Advanced Analysis > Meta manage > Event

![Image logEvent](https://communityfile-drcn.op.hicloud.com/FileServer/getFile/cmtyPub/011/111/111/0000000000011111111.20200111152632.88019175743704493106408528668179:50510218132328:2800:F5F501456A406FF1062203923018D1A3052F8E2EA4F663541F81DF647C4D0C94.png?needInitFileName=true?needInitFileName=true?needInitFileName=true)

หมายเลข 5 คือการสร้าง event ใหม่
หมายเลข 4 คือการเพิ่ม parameter ขอ event นั้นๆ
เมื่อกด หมายเลข 4 ก็จะพบหน้าต่าง
![Image Edit Event](https://communityfile-drcn.op.hicloud.com/FileServer/getFile/cmtyPub/011/111/111/0000000000011111111.20200111152701.37513256755064144137057073699285:50510218132328:2800:B255F6401359CF335975D48F1E105C7F541A55EECD252EE64C6BF232B54B8EA4.png?needInitFileName=true?needInitFileName=true?needInitFileName=true)
-   พิมชื่อ parameter ที่ต้องการสร้างแล้วกดปุ่ม Add แล้ว set Parameter name กับ Type แล้วกด Save เป็นอันเสร็จ (อาจต้องรอ 1วัน ถึงค่า parameter จะใช้งานได้)

### Credit

https://developer.huawei.com/consumer/en/doc/development/HMS-Guides/Development-Guide#h1-6-accessing-analytics

# react-native-huawei-analytics


## Getting started

`$ npm install react-native-huawei-analytics --save`

### Mostly automatic installation

`$ react-native link react-native-huawei-analytics`

### Manual installation



#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeHuaweiAnalyticsPackage;` to the imports at the top of the file
  - Add `new RNReactNativeHuaweiAnalyticsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-huawei-analytics'
  	project(':react-native-huawei-analytics').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-huawei-analytics/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-huawei-analytics')
  	```


## Usage
```javascript
import HuaweiAnalytics from 'react-native-huawei-analytics'
HuaweiAnalytics.logEvent('name',{ key: value })
HuaweiAnalytics.setAnalyticsCollectionEnabled( boolean )
HuaweiAnalytics.setCurrentScreen('screenName','screenClassOverride')
HuaweiAnalytics.setUserId('userId')
HuaweiAnalytics.setUserProperty('name','value')
HuaweiAnalytics.setUserProperties({name: value}) ( เหมือน setUserProperty แค่ input ต่างกัน
```
  