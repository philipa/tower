(defproject com.taoensso/tower "1.2.0"
  :description "Clojure internationalization & translation library"
  :url "https://github.com/ptaoussanis/tower"
  :license {:name "Eclipse Public License"}
  :dependencies [[org.clojure/clojure     "1.3.0"]
                 [org.clojure/tools.macro "0.1.1"]
                 [com.taoensso/timbre     "1.2.0"]]
  :profiles {:1.3  {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.0-alpha3"]]}
             :dev  {:dependencies [[ring/ring-core      "1.1.0"]]}
             :test {:dependencies [[ring/ring-core      "1.1.0"]]}}
  :aliases {"test-all" ["with-profile" "test,1.3:test,1.4:test,1.5" "test"]}
  :min-lein-version "2.0.0"
  :warn-on-reflection true)
