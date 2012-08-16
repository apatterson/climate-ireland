(defproject clad "0.1.0-SNAPSHOT"
            :description "Irish Climate Information Platform"
            :dependencies [[clj-stacktrace "0.2.4"]
                           [org.clojure/clojure "1.3.0"]
                           [enlive "1.0.0"]
                           [noir "1.2.1"]
                           [org.clojars.sritchie09/gdal-java "1.8.0"]
                           [org.clojars.pallix/analemma "1.0.0-SNAPSHOT"]
                           [incanter "1.2.3"]
                           [clj-time "0.3.7"]
                           [com.ashafa/clutch "0.4.0-SNAPSHOT"]
			   [org.clojars.pallix/batik "1.7.0"]
                           [clj-logging-config "1.9.7"]
                           [com.cemerick/friend "0.0.9"]]
            :dev-dependencies [swank-clojure "1.4.0-SNAPSHOT"]
            :extra-classpath-dirs [".lein-git-deps/rincanter/src/"]
            :plugins [[lein-ring "0.7.1"]]
            :main clad.server)

