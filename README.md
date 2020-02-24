
# react-native-huawei-analytics

## Getting started

`$ npm install react-native-huawei-analytics --save`

### Mostly automatic installation

`$ react-native link react-native-huawei-analytics`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-huawei-analytics` and add `RNReactNativeHuaweiAnalytics.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeHuaweiAnalytics.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeHuaweiAnalytics.sln` in `node_modules/react-native-huawei-analytics/windows/RNReactNativeHuaweiAnalytics.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Native.Huawei.Analytics.RNReactNativeHuaweiAnalytics;` to the usings at the top of the file
  - Add `new RNReactNativeHuaweiAnalyticsPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNReactNativeHuaweiAnalytics from 'react-native-huawei-analytics';

// TODO: What to do with the module?
RNReactNativeHuaweiAnalytics;
```
  