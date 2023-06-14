pluginManagement {
    repositories {
        gradlePluginPortal()

        maven { setUrl("https://repo.spring.io/milestone") } // Spring milestones
        maven { setUrl("https://repo.spring.io/snapshot") } // Spring snapshots
    }

    plugins {
        id("de.fayard.refreshVersions") version "0.51.0"
    }
}

plugins {
    id("de.fayard.refreshVersions")
}

rootProject.name = "webflux-examples"

include("examples:async-programming")
include("examples:spring-webflux")
include("examples:kotlin-coroutine")
include("examples:kotlin-coroutine-usage")

include("practices:completable-future")
include("practices:reactive-streams")
include("practices:nio-server")
include("practices:selector")
include("practices:reactor-pattern")
include("practices:reactor")
include("practices:netty")
include("practices:sse")
include("practices:webflux")
include("practices:webflux-image")
include("practices:websocket")
include("practices:mongo-chat")
include("practices:coroutine-mongo-chat")
include("practices:r2dbc-webflux")
include("practices:coroutine-r2dbc-webflux")