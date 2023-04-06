
package com.lagradost

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class WatchAsianProviderPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(WatchAsianProvider())
        registerExtractorAPI(XStreamCdn())
        registerExtractorAPI(LayarKaca())
        registerExtractorAPI(DBfilm())
        registerExtractorAPI(Luxubu())
        registerExtractorAPI(FEmbed())
        registerExtractorAPI(Fplayer())
        registerExtractorAPI(FeHD())
    }
}