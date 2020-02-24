using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Huawei.Analytics.RNReactNativeHuaweiAnalytics
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeHuaweiAnalyticsModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeHuaweiAnalyticsModule"/>.
        /// </summary>
        internal RNReactNativeHuaweiAnalyticsModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeHuaweiAnalytics";
            }
        }
    }
}
