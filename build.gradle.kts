plugins {
    id("dev.prism")
}

group = "com.leclowndu93150"
version = "1.0.0"

prism {
    metadata {
        modId = "threadtweak"
        name = "ThreadTweak"
        description = "Improve and tweak Minecraft CPU scheduling (again!)"
        license = "MIT"
        author("getchoo")
        author("UltimateBoomer")
        author("fantahund")
        author("Leclowndu93150")
    }

    publishing {
        type = STABLE

        curseforge {
            accessToken = providers.environmentVariable("CURSEFORGE_TOKEN")
            projectId = "1274735"
        }
    }

    version("1.20.1") {
        fabric {
            loaderVersion = "0.16.10"
        }
        forge {
            loaderVersion = "47.4.18"
            loaderVersionRange = "[4,)"
        }
    }

    version("1.21.1") {
        fabric {
            loaderVersion = "0.16.10"
        }
        neoforge {
            loaderVersion = "21.1.226"
            loaderVersionRange = "[4,)"
        }
    }

    version("1.21.11") {
        fabric {
            loaderVersion = "0.19.2"
        }
        neoforge {
            loaderVersion = "21.11.42"
            loaderVersionRange = "[4,)"
        }
    }

    version("26.1.2") {
        fabric {
            loaderVersion = "0.19.2"
        }
        neoforge {
            loaderVersion = "26.1.2.12-beta"
            loaderVersionRange = "[4,)"
        }
    }
}
